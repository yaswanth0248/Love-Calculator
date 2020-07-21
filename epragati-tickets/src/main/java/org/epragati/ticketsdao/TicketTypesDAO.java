package org.epragati.ticketsdao;

import org.epragati.tickets.dto.TicketTypesDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketTypesDAO extends BaseRepositoryCustom<TicketTypesDTO , String> {
	TicketTypesDTO findByIsEnableTrue(String ticketModule);
	
	TicketTypesDTO findByticketModuleAndIsEnableTrue(String ticketModule);
}
