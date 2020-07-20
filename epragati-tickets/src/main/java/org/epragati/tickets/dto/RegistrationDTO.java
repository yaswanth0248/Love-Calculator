package org.epragati.tickets.dto;

public class RegistrationDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String prNo;
	private String applicationNo;
	private String trNo;

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

}
