package com.ApplicationFormatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.AppicationDTO.Phone;

public class PhoneNoFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {

		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		// Whether The Number Consists of -
		Phone phone = new Phone();
		// split the String received from The User
		String[] pno = completePhoneNumber.split("-");
		int index = completePhoneNumber.indexOf("-");
		if (index == -1 || completePhoneNumber.startsWith("-")) {
			// if '-' is not fount add 91 as Country Code or else leave it
			phone.setCountryCode("91");
			if (completePhoneNumber.startsWith("-")) {
				phone.setUserNumber(pno[1]);
			} else {
				phone.setUserNumber(pno[0]);
			}
		} else {

			// Extract The country code and set it to the phone class countryCode Property

			phone.setCountryCode(pno[0]);
			phone.setUserNumber(pno[1]);
		}
		return phone;
	}

}
