package org.epragati.tickets.service;

import org.epragati.tickets.dto.TicketTypesDTO;
import org.epragati.tickets.utills.TicketBadRequestException;
import org.epragati.ticketsdao.TicketTypesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class TicketsubTypesImp implements TicketSubTypes {
	
	
	@Autowired
	TicketTypesDAO ticketTypesDAO;

	@Override
	public TicketTypesDTO getSubTypeServices(String ticketModule) {
		TicketTypesDTO ticketdto=ticketTypesDAO.findByIsEnableTrue(ticketModule);
		if(ObjectUtils.isEmpty(ticketdto)) {
			throw new TicketBadRequestException("No values are getting");
		}
		
		return ticketdto;
	}

}
