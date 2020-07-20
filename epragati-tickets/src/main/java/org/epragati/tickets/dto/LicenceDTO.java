package org.epragati.tickets.dto;


import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "llr_details")
public class LicenceDTO extends BaseDTO{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dlNo;
	private String llrNo;
	private String applicationNo;
	private String aadharNo;
	public String getDlNo() {
		return dlNo;
	}
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	public String getLlrNo() {
		return llrNo;
	}
	public void setLlrNo(String llrNo) {
		this.llrNo = llrNo;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

}
