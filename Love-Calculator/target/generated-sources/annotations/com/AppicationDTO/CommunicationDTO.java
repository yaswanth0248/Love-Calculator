package com.AppicationDTO;

public class CommunicationDTO {
		
	private String email;
	// For phone number i am creating a class because phone no may consists of +91 or 01
	private Phone phone;

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
