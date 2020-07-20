package org.epragati.tickets.dto;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_district")
public class DistrictDTO extends BaseDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	/*
	 * private Integer did;
	 * 
	 * private String sid;
	 * 
	 * private String dcode;
	 * 
	 * private Integer description;
	 */

	private Integer districCode;

	private Integer districtId;

	private String districtName;

	private String stateId;

	private String status;

	private String zonecode;
	
	private boolean allowBiLateralTax;
	
	private String biLateralTaxOfficeCode;

	private Integer districNicCode;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the districCode
	 */
	public Integer getDistricCode() {
		return districCode;
	}

	/**
	 * @param districCode
	 *            the districCode to set
	 */
	public void setDistricCode(Integer districCode) {
		this.districCode = districCode;
	}

	/**
	 * @return the districtId
	 */
	public Integer getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId
	 *            the districtId to set
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName
	 *            the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the stateId
	 */
	public String getStateId() {
		return stateId;
	}

	/**
	 * @param stateId
	 *            the stateId to set
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the zonecode
	 */
	public String getZonecode() {
		return zonecode;
	}

	/**
	 * @param zonecode
	 *            the zonecode to set
	 */
	public void setZonecode(String zonecode) {
		this.zonecode = zonecode;
	}


	public boolean isAllowBiLateralTax() {
		return allowBiLateralTax;
	}

	public void setAllowBiLateralTax(boolean allowBiLateralTax) {
		this.allowBiLateralTax = allowBiLateralTax;
	}


	public String getBiLateralTaxOfficeCode() {
		return biLateralTaxOfficeCode;
	}

	public void setBiLateralTaxOfficeCode(String biLateralTaxOfficeCode) {
		this.biLateralTaxOfficeCode = biLateralTaxOfficeCode;
	}

	
	
	/**
	 * @return the districNicCode
	 */
	public Integer getDistricNicCode() {
		return districNicCode;
	}

	/**
	 * @param districNicCode the districNicCode to set
	 */
	public void setDistricNicCode(Integer districNicCode) {
		this.districNicCode = districNicCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DistrictDTO [id=" + id + ", districCode=" + districCode + ", districtId=" + districtId
				+ ", districtName=" + districtName + ", stateId=" + stateId + ", status=" + status + ", zonecode="
				+ zonecode + "]";
	}

}
	