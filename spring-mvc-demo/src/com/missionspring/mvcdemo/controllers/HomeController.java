package com.missionspring.mvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String displayHome() {
		return "home";
	}

	@RequestMapping("/login")
	public String displayLoginForm() {
		return "login-form";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String handleLogin() {
		return "welcome";
	}
}
