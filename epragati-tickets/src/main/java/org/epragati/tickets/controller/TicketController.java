package org.epragati.tickets.controller;

import java.io.IOException;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.epragati.tickets.service.RestServices;
import org.epragati.tickets.utills.MappingUrls;
import org.epragati.tickets.utills.TicketBadRequestException;
import org.epragati.tickets.utills.TicketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(MappingUrls.ticket_service_url)
public class TicketController {

	@Autowired
	RestServices restServices;

	@GetMapping(value = "/checkDataExist", produces = { MediaType.APPLICATION_JSON_VALUE })
	public TicketResponse<?> checkDataExist(@RequestParam String prNo) {

		String ticketTypesDTO = restServices.restRegServiceCall(prNo);
		return new TicketResponse<>(HttpStatus.ACCEPTED, ticketTypesDTO);

	}

	// Saving the data
	@PostMapping(value = "/saveTicketData", produces = { MediaType.APPLICATION_JSON_VALUE })
	public TicketResponse<?> saveTheTicketData(@RequestParam(required = true) String citizenVO,
			@RequestParam(required = false) MultipartFile[] files, HttpServletRequest request) {
		try {
			if (!StringUtils.isEmpty(citizenVO)) {
				restServices.saveTicketDetails(citizenVO, files, request);
				return new TicketResponse<>(HttpStatus.ACCEPTED, "Successfully Saved");
			} else {
				throw new TicketBadRequestException("please pass all the mandatory fields ");
			}
		} catch (TicketBadRequestException txe) {
			return new TicketResponse<>(HttpStatus.BAD_REQUEST, txe.getMessage());
		} catch (NullPointerException e) {
			return new TicketResponse<>(HttpStatus.SERVICE_UNAVAILABLE, e.getMessage());
		} catch (IOException jse) {
			return new TicketResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, jse.getMessage());
		} catch (Exception ex) {
			return new TicketResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
		}

	}
	/*
	 * @PostMapping(value = "/ccoTicketData", produces = {
	 * MediaType.APPLICATION_JSON_VALUE }) public TicketResponse<?>
	 * ccoTicket(@RequestBody CommonVO commonVO) { try { if
	 * (!StringUtils.isEmpty(commonVO.getDescription())) {
	 * restServices.ccoTicketDetails(commonVO);
	 * 
	 * return new TicketResponse<>(HttpStatus.ACCEPTED, "Successfully Saved");
	 * 
	 * } throw new TicketBadRequestException("Please Enter All The Fields"); } catch
	 * (NullPointerException e) { return new
	 * TicketResponse<>(HttpStatus.SERVICE_UNAVAILABLE, e.getMessage()); }
	 * 
	 * }
	 */
}