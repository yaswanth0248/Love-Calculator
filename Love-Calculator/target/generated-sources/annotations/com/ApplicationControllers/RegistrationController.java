package com.ApplicationControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.AppicationDTO.UserRegistrationDTO;

@Controller
public class RegistrationController {
		
		@RequestMapping("/register")
		public String Registration(@ModelAttribute("regdto") UserRegistrationDTO regdto) {
			
			return "registrationPage";	
		}
		
		@RequestMapping("/RegistrationSuccess")
		public String RegDetails(@ModelAttribute("regdto") UserRegistrationDTO regdto) {
			return"registration-Details";
		}
		
}
