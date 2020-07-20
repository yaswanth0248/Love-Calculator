package com.welcomeController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public String Welcome(Model m) {

		m.addAttribute("MySiteName", "Sports World");
		String s = "Yaswanth";
		m.addAttribute("my", s);
		return "Welcome";

	}

	@RequestMapping("/Process")
	public String Cricket(HttpServletRequest req, Model m) {
		String s = req.getParameter("Sports Type");
		m.addAttribute("UserInfo",s);
		return "Process";
	}

}
