package com.bsm.controller;
import java.util.Map;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bsm.model.Student;

@Controller
public class StudentOperatonsController {
	@GetMapping("/")
	public String start() {
		return "welcome";
	}

	@GetMapping("/register")
	public String showForm() {
		return "student_register";
	}
	@PostMapping("/register")
	public String registerStudent(Map<Student,Object> map,
			             @ModelAttribute("stud") Student st) {
		return "show_result";
	}
}
