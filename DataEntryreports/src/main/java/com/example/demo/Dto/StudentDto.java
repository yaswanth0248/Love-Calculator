package com.example.demo.Dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
@Document(collection ="Student_Details_report")
public class StudentDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fName;
	private String lName;
	private String mobileNo;
	private String _id;
	private LocalDate dob;

	private LocalDateTime createdDate;

	public String getfName() {
		return fName;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

}
