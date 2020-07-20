package org.epragati.tickets.dto;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Ticket_TYPES")
public class TicketTypesDTO {
	
	private String ticketModule;
	private List<String> regSubTypes;
	private Boolean isEnable=Boolean.FALSE;
	public String getTicketModule() {
		return ticketModule;
	}
	public void setTicketModule(String ticketModule) {
		this.ticketModule = ticketModule;
	}
	public List<String> getRegSubTypes() {
		return regSubTypes;
	}
	public void setRegSubTypes(List<String> regSubTypes) {
		this.regSubTypes = regSubTypes;
	}
	public Boolean getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}
	
	
	
	

}
