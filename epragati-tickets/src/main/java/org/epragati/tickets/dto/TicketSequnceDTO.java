package org.epragati.tickets.dto;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Ticket_sequence")
public class TicketSequnceDTO {
	
	@Id
	private String id;
	private Long ticketIds;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getTicketIds() {
		return ticketIds;
	}
	public void setTicketIds(Long ticketIds) {
		this.ticketIds = ticketIds;
	}
	
	
}
