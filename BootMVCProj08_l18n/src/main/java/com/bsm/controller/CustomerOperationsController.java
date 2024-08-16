package com.bsm.controller;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.bsm.model.Customer;
@Controller
//@RequestMapping("/example")
public class CustomerOperationsController {
	@GetMapping("/")
	public String showHome() {
		return "welcome";
	}

	@GetMapping("/register")
	public String showCutomerFormPage(@ModelAttribute("cust") Customer cust, Map<String, Object> map) {
		return "customer_register";
	}
}
