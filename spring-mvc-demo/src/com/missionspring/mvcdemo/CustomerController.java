package com.missionspring.mvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringEditor);
		
	}

	@RequestMapping("/register")
	public String showRegistrationForm(Model aModel) {

		aModel.addAttribute("customer", new Customer());

		return "customer/customer-form";
	}

	@RequestMapping("/processRegistration")
	public String handleRegistration(@Valid @ModelAttribute("customer") Customer aCustomer,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "customer/customer-form";
		} else {
			return "customer/customer-confirmation";
		}
	}
}
