package org.epragati.tickets.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;

public class BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String createdBy;
	private String modifiedBy;
	private String updatedBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime modifiedDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime lUpdate;
	private String ipAddress;
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}


}
