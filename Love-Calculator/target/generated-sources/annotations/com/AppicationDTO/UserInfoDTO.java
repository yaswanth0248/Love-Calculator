package com.AppicationDTO;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	@NotBlank(message ="Your Name Can't be Blank ")
	@Size(min =3, max=15, message="Your Name Should Contains Chars between 3-15")
	private String userName;
	@NotBlank(message ="Crush Name Can't be Blank ")
	@Size(min =3, max=15, message="Crush Name Should Contains Chars between 3-15")
	private String crushName;
	@AssertTrue(message ="You have to agree")
	private boolean termsAndConditions;

	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

}
