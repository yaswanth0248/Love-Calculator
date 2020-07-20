package org.epragati.tickets.controller;

import java.util.List;

import org.epragati.tickets.dto.TicketTypesDTO;
import org.epragati.tickets.service.RestServices;
import org.epragati.tickets.service.TicketSubTypes;
import org.epragati.tickets.utills.MappingUrls;
import org.epragati.tickets.utills.TicketResponse;
import org.epragati.tickets.vo.DistrictVO;
import org.epragati.tickets.vo.OfficeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(MappingUrls.master_data_url)
public class MasterController {

	@Autowired
	TicketSubTypes ticketSubTypes;

	@Autowired
	RestServices restServices;

	@GetMapping(value = "/getTicketTypes", produces = { MediaType.APPLICATION_JSON_VALUE })
	public TicketResponse<?> getTicketType(@RequestParam String ticketModule) {
		TicketTypesDTO ticketTypesDTO = ticketSubTypes.getSubTypeServices(ticketModule);
		return new TicketResponse<>(HttpStatus.ACCEPTED, ticketTypesDTO);

	}
	@GetMapping(value = "/getAllDistricts", produces = { MediaType.APPLICATION_JSON_VALUE })
	public TicketResponse<?> getDistricts() {
		List<DistrictVO> districtVO = restServices.allDistrictById();

		return new TicketResponse<>(HttpStatus.ACCEPTED, districtVO);

	}
	@GetMapping(value = "/getoffices", produces = { MediaType.APPLICATION_JSON_VALUE })
	public TicketResponse<?> getOfficesBasedOnDistrictId(@RequestParam Integer district) {

		List<OfficeVO> officelist = restServices.officeCodesBasedOnDistrictId(district);

		return new TicketResponse<>(HttpStatus.ACCEPTED, officelist);

	}
}
