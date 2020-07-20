package org.epragati.tickets.vo;

public class CommonVO {
//TicketDetailsDTO
	private String description;
	private String regSubTypes;
	private String officeCode;
	private String ticketModule;
	public String getticketModule() {
		return ticketModule;
	}

	public void setticketModule(String ticketModule) {
		this.ticketModule = ticketModule;
	}

	private String ipAddress;
	
	
	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getRegSubTypes() {
		return regSubTypes;
	}

	public void setRegSubTypes(String regSubTypes) {
		this.regSubTypes = regSubTypes;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CommonVO [description=" + description + ", regSubTypes=" + regSubTypes + ", officeCode=" + officeCode
				+ "]";
	}

	


}
