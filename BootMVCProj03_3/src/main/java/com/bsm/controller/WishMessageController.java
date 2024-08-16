package com.bsm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//@RequestMapping("/wish-operations")
@Controller
public class WishMessageController {
	//@GetMapping("/all")
	@GetMapping("/")
	public String showReport() throws Exception {
     // return "show_report";
		  return "forward:/test-operations/all";
	}	
}
