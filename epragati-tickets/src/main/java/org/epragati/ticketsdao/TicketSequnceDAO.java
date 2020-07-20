package org.epragati.ticketsdao;

import java.io.Serializable;

import org.epragati.tickets.dto.TicketSequnceDTO;

public interface TicketSequnceDAO  extends BaseRepositoryCustom<TicketSequnceDTO, Serializable>{
	
	TicketSequnceDTO findByid(String id);

}
