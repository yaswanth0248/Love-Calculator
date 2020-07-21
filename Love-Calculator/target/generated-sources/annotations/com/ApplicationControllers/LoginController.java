package com.ApplicationControllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.AppicationDTO.UserInfoDTO;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String Home(@ModelAttribute("userinfo") UserInfoDTO userinfo) {

		return "home";

	}

	@RequestMapping("/process")
	public String processpage(@Valid @ModelAttribute("userinfo") UserInfoDTO userinfo, BindingResult result) {

			if(result.hasErrors()) {
				List<ObjectError> allErrors = result.getAllErrors();
				for(ObjectError temp: allErrors) {
					System.out.println(temp);
				}
				return "home";
			}
		return "processPage";

	}
}
