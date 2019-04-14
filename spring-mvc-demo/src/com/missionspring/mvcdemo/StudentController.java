package com.missionspring.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/register")
	public String getRegistrationForm(Model model) {
		
		Student aStudent = new Student();
		System.out.println(aStudent);
		model.addAttribute("student", aStudent);

		return "student/register";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public String processRegistration(@ModelAttribute("student") Student aStudent, Model model) {
		System.out.println(aStudent);
		System.out.println(aStudent.getFirstName() + " " + aStudent.getLastName());
		return "student/acknowledgement";
	}
}
