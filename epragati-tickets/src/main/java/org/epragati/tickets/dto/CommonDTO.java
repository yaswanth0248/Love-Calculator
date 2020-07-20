package org.epragati.tickets.dto;

//@Document(collection="common_data_ticket")
public class CommonDTO {
	
	private String ticketModule;
	public String getticketModule() {
		return ticketModule;
	}
	public void setticketModule(String ticketModule) {
		this.ticketModule = ticketModule;
	}
	private String description;
	private String regSubTypes;
	private String officeCode;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRegSubTypes() {
		return regSubTypes;
	}
	public void setRegSubTypes(String regSubTypes) {
		this.regSubTypes = regSubTypes;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	

}
