package com.missionspring.mvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping("/login-using-get")
	public String displayLoginGetForm() {
		return "login-using-get";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String handleLogin() {
		return "welcome";
	}

	@RequestMapping("/shoutout")
	public String shoutout(HttpServletRequest request, Model model) {

		String username = request.getParameter("username");

		String message = "Yo! " + username.toUpperCase();
		model.addAttribute("message", message);

		return "get-welcome";
	}

	@RequestMapping("/handleRequestParam")
	public String handleRequestParam(@RequestParam("username") String user, Model model) {
		String message = "Accessing using RequestParam : " + user.toUpperCase();

		model.addAttribute("message", message);

		return "get-welcome";
	}

}
