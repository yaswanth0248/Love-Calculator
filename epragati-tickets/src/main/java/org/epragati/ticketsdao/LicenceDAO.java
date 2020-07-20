package org.epragati.ticketsdao;

import java.io.Serializable;

import org.epragati.tickets.dto.LicenceDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LicenceDAO extends CrudRepository<LicenceDTO, Serializable> {

}
