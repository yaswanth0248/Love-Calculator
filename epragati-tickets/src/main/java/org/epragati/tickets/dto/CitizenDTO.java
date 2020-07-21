package org.epragati.tickets.dto;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "saveTickets")
public class CitizenDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String district;
	private String officeName;
	private String mobileNo;
	private CommonDTO common;
	private List<ImageDTO> imageDTO;
	private String ticketNumber;

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public CommonDTO getCommon() {
		return common;
	}

	public void setCommon(CommonDTO common) {
		this.common = common;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<ImageDTO> getImageDTO() {
		return imageDTO;
	}

	public void setImageDTO(List<ImageDTO> imageDTO) {
		this.imageDTO = imageDTO;
	}

}
