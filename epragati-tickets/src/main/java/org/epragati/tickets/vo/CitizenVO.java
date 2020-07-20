package org.epragati.tickets.vo;

import java.util.List;

public class CitizenVO extends CommonVO{
	private String district;
	private String officeName;
	private String mobileNo;
	private CommonVO commonVO;
	private List<ImageVO> imageVO;
	private String ticketNo;

	

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public List<ImageVO> getImageVO() {
		return imageVO;
	}

	public void setImageVO(List<ImageVO> imageVO) {
		this.imageVO = imageVO;
	}

	public CommonVO getCommonVO() {
		return commonVO;
	}

	public void setCommonVO(CommonVO commonVO) {
		this.commonVO = commonVO;
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

	@Override
	public String toString() {
		return "CitizenVO [district=" + district + ", officeName=" + officeName + ", mobileNo=" + mobileNo
				+ ", commonVO=" + commonVO + "]";
	}
	
	
}
