package org.epragati.ticketsdao;

import java.io.Serializable;
import java.util.List;

import org.epragati.tickets.dto.DistrictDTO;

public interface DistrictDAO extends BaseRepositoryCustom<DistrictDTO, Serializable> {
	
	 List<DistrictDTO> findByDistrictId(Integer district);
	 //Get DistrictName by using id
	 List<DistrictDTO> findByDistrictName(Integer district);
 
	 // Get All District list using status
	 List<DistrictDTO> findByStatus(String status);

}
