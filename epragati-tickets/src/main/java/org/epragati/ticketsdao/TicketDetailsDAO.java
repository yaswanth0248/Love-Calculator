package org.epragati.ticketsdao;


import java.io.Serializable;
import java.util.List;

import org.epragati.tickets.dto.CitizenDTO;
import org.springframework.stereotype.Repository;
@Repository
public interface TicketDetailsDAO extends BaseRepositoryCustom<CitizenDTO,Serializable> {

	List<CitizenDTO> findByDistrict(String district);
	
	List<CitizenDTO> findByCommonOfficeCode(String officeCode);	
	
}
