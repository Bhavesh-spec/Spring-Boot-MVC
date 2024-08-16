package com.bsm.controller;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bsm.model.Employee;
@Controller
public class EmployeeController {
	@GetMapping("/")
	public String showHome() {
		return "welcome";
	}
	@GetMapping("/register")
	public String showRegister() {
		return "show_register";
	}
	@PostMapping("/register")
	public String showResult(Map<String, Object> map
			,@ModelAttribute("emp")Employee empl) {
		
		return "show_result";
	}
}
