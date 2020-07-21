package org.epragati.tickets.service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.epragati.tickets.dto.CitizenDTO;
import org.epragati.tickets.dto.DistrictDTO;
import org.epragati.tickets.dto.ImageDTO;
import org.epragati.tickets.dto.OfficeDTO;
import org.epragati.tickets.dto.TicketSequnceDTO;
import org.epragati.tickets.mappers.TicketMapper;
import org.epragati.tickets.utills.TicketBadRequestException;
import org.epragati.tickets.vo.CitizenVO;
import org.epragati.tickets.vo.DistrictVO;
import org.epragati.tickets.vo.OfficeVO;
import org.epragati.ticketsdao.DistrictDAO;
import org.epragati.ticketsdao.OfficeDAO;
import org.epragati.ticketsdao.TicketDetailsDAO;
import org.epragati.ticketsdao.TicketSequnceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.gridfs.GridFSFile;

@Service
public class RestServicesimp implements RestServices {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${reg.data.check:}")
	private String regServiceUrl;
	@Autowired
	private DistrictDAO districtDAO;
	@Autowired
	private OfficeDAO officeDAO;
	@Autowired
	private TicketDetailsDAO ticketDetailsDAO;

	@Autowired
	private TicketMapper ticketMapper;

	@Autowired
	private GridFsOperations operations;
	
	@Autowired
	TicketSequnceDAO ticketSequnceDAO;

	@Override
	public String restRegServiceCall(String prNo) {

		Map<String, String> uriParams = null;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		uriParams = new HashMap<>();
		uriParams.put("prNo", prNo);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(regServiceUrl).queryParam("prNo", prNo);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<String> result = null;
		try {
			result = restTemplate.exchange(builder.buildAndExpand(uriParams).toUri(), HttpMethod.POST, entity,
					String.class);
			if (result != null) {
				return "sucess";
			}

		} catch (Exception e) {

			return null;

		}
		return null;
	}

// get all district list 
	@Override
	public List<String> allDistrictList() {
		String val = "Y";
		List<DistrictDTO> districtDTOlist = districtDAO.findByStatus(val);
		return districtDTOlist.stream().map(i -> i.getDistrictName()).collect(Collectors.toList());

	}

//List of District by using Status
	@Override
	public List<DistrictDTO> allDistricts() {
		List<DistrictDTO> districtDTOlist = districtDAO.findByStatus("Y");
		return districtDTOlist;
	}

	@Override
	public List<DistrictVO> allDistrictById() {
		List<DistrictVO> districtVOlist = new ArrayList<DistrictVO>();
		List<DistrictDTO> districtDTOlist = districtDAO.findByStatus("Y");
		districtDTOlist.forEach(action -> {
			DistrictVO districtVO = new DistrictVO();
			districtVO.setDistrictId(action.getDistrictId());
			districtVO.setDistrictName(action.getDistrictName());
			districtVOlist.add(districtVO);
		});

		return districtVOlist;

	}

	@Override
	public List<OfficeVO> officeCodesBasedOnDistrictId(Integer District) {
		// OfficeVO OfficeVO=null;
		if (District == null) {
			throw new TicketBadRequestException("District Can't Be NULL");
		}
		List<OfficeVO> officeVOlist = new ArrayList<OfficeVO>();
		List<OfficeDTO> officeDTOlist = officeDAO.findBydistrict(District);
		officeDTOlist.forEach(action -> {
			OfficeVO officeVO = new OfficeVO();
			officeVO.setOfficeCode(action.getOfficeCode());
			officeVO.setOfficeName(action.getOfficeName());
			officeVOlist.add(officeVO);
		});

		return officeVOlist;
	}

	
	@Override
	public List<CitizenVO> getTheCitizenTicketDetailsByDistrict(String district) {
		List<CitizenDTO> citizenDTOlist = ticketDetailsDAO.findByDistrict(district);
		List<CitizenVO> citizenVOlist = ticketMapper.convertEntity(citizenDTOlist);
		return citizenVOlist;
	}

	@Override
	public List<CitizenVO> getTheCitizenTicketDetailsByOfficeCode(String officeCode) {
		List<CitizenDTO> citizenDTOlist = ticketDetailsDAO.findByCommonOfficeCode(officeCode);
		List<CitizenVO> citizenVOlist = ticketMapper.convertEntity(citizenDTOlist);
		return citizenVOlist;
	}

	@Override
	public String saveTicketDetails(String citizenVO, MultipartFile[] files, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper obj = new ObjectMapper();
		CitizenDTO citizenDTO = null;
		List<ImageDTO> imageDTOlist = new ArrayList<ImageDTO>();
		CitizenVO citzenData = obj.readValue(citizenVO, CitizenVO.class);
		OfficeDTO officeDTO = officeDAO.findByofficeName(citzenData.getOfficeName());
		citizenDTO = ticketMapper.convertVO(citzenData);
		citizenDTO.getCommon().setOfficeCode(officeDTO.getOfficeCode());
		citizenDTO.setCreatedDate(LocalDateTime.now());

		for (MultipartFile file : files) {
			ImageDTO imgdto = new ImageDTO();
			GridFSFile GridFiles = operations.store(file.getInputStream(), file.getOriginalFilename());
			imgdto.setImageId(GridFiles.getId().toString());
			imgdto.setImgaeType(file.getOriginalFilename());
			imageDTOlist.add(imgdto);
		}
		citizenDTO.setTicketNumber(this.generateTicket(citzenData.getCommonVO().getticketModule()));
		citizenDTO.setIpAddress(request.getRemoteAddr());
		citizenDTO.setImageDTO(imageDTOlist);
		ticketDetailsDAO.save(citizenDTO);
		return "sucess";
	}
	
	
	public String generateTicket(String module) {
		TicketSequnceDTO ticketSequence=ticketSequnceDAO.findByid(module);
		Long ticket=ticketSequence.getTicketIds();
		 Long ticketSeq =++ticket;
		Date date=new Date();
		String ticketNo=module+ticketSeq+String.valueOf(date.getYear()+1900);
		ticketSequence.setTicketIds(ticketSeq);
		ticketSequnceDAO.save(ticketSequence);
		return ticketNo;
		
	}
	
	
	

}
