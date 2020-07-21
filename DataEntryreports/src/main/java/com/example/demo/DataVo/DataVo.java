package com.example.demo.DataVo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DataVo {
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fromDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate toDate;

//private String officeCode;

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

//	public String getOfficeCode() {
//		return officeCode;
//	}
//
//	public void setOfficeCode(String officeCode) {
//		this.officeCode = officeCode;
//	}
//	

}
