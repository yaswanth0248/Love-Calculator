package org.epragati.tickets.service;

import java.io.IOException;
import java.util.List;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.epragati.tickets.dto.DistrictDTO;
import org.epragati.tickets.vo.CitizenVO;
import org.epragati.tickets.vo.DistrictVO;
import org.epragati.tickets.vo.OfficeVO;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface RestServices {

	String restRegServiceCall(String prNo);

	List<String> allDistrictList();

	List<DistrictVO> allDistrictById();

	List<DistrictDTO> allDistricts();

	List<OfficeVO> officeCodesBasedOnDistrictId(Integer District);

	String saveTicketDetails(String citizenVO,MultipartFile[] files,HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException;

	List<CitizenVO> getTheCitizenTicketDetailsByDistrict(String district);
	
	List<CitizenVO> getTheCitizenTicketDetailsByOfficeCode(String officeCode);
}
