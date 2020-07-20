package org.epragati.tickets.controller;

import java.util.List;

import org.epragati.tickets.service.RestServices;
import org.epragati.tickets.utills.MappingUrls;
import org.epragati.tickets.utills.TicketBadRequestException;
import org.epragati.tickets.utills.TicketResponse;
import org.epragati.tickets.vo.CitizenVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(MappingUrls.ticket_service_url_report)
public class ReportController {

	@Autowired
	RestServices restServices;

	@GetMapping(value = "/getCitizenTicketDetails", produces = { MediaType.APPLICATION_JSON_VALUE })
	public TicketResponse<?> CitizenTicketDetails(@RequestParam String district) {
		List<CitizenVO> citizenVOlist = null;
		try {
			if (!StringUtils.isEmpty(district)) {
				citizenVOlist = restServices.getTheCitizenTicketDetailsByDistrict(district);
				return new TicketResponse<>(HttpStatus.ACCEPTED, citizenVOlist);
			}
			throw new TicketBadRequestException("Please Give The District Name");
		} catch (NullPointerException e) {
			return new TicketResponse<>(HttpStatus.SERVICE_UNAVAILABLE, e.getMessage());
		}
	}

	@GetMapping(value = "/getCitizenTicketDetailsByOfficeCode", produces = { MediaType.APPLICATION_JSON_VALUE })
	public TicketResponse<?> CitizenTicketDetailsByOfficeCode(@RequestParam String officeCode) {
		List<CitizenVO> citizenVOlist = null;
		try {
			if (!StringUtils.isEmpty(officeCode)) {
				citizenVOlist = restServices.getTheCitizenTicketDetailsByOfficeCode(officeCode);
				return new TicketResponse<>(HttpStatus.ACCEPTED, citizenVOlist);
			}
			throw new TicketBadRequestException("Please Give The Office Code");
		} catch (NullPointerException e) {
			return new TicketResponse<>(HttpStatus.SERVICE_UNAVAILABLE, e.getMessage());
		}
	}

}
