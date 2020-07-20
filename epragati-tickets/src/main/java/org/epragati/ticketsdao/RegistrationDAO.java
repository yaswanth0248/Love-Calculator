package org.epragati.ticketsdao;

import java.io.Serializable;

import org.epragati.tickets.dto.RegistrationDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationDAO extends CrudRepository<RegistrationDTO, Serializable> {

}
