package org.epragati.ticketsdao;

import java.io.Serializable;

import org.epragati.tickets.dto.OtherStateDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherStateDAO extends CrudRepository<OtherStateDTO, Serializable> {
/*
 * if we want to get details for Daily Reports
 * 
 */
	
	OtherStateDTO findByApplicatioNO(String ApplicationNO);
}
