package org.epragati.ticketsdao;

import java.io.Serializable;
import java.util.List;

import org.epragati.tickets.dto.OfficeDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeDAO extends BaseRepositoryCustom<OfficeDTO, Serializable> {
	// Get Office Details by DistrictId
	List<OfficeDTO> findBydistrict(Integer district);
	
	//Get OfficeName by using OfficeName
	OfficeDTO findByofficeName(String officeName);
	/*
	 * 
	 * List<OfficeDTO> findBymandal(Integer mandal);
	 */
}
