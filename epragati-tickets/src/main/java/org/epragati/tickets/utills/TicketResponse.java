package org.epragati.tickets.utills;

import java.util.List;

import org.springframework.http.HttpStatus;

public class TicketResponse<T> {

	
	private Boolean status;
	private HttpStatus httpStatus;
	private String message;
	private T result;
	
	private List<String> errors;
	public TicketResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketResponse(HttpStatus httpStatus, String message) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
	}
	public TicketResponse(HttpStatus httpStatus, T result) {
		
		this.httpStatus = httpStatus;
		this.result = result;
	}
	public TicketResponse(Boolean status, HttpStatus httpStatus, String message) {
		super();
		this.status = status;
		this.httpStatus = httpStatus;
		this.message = message;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	
}
