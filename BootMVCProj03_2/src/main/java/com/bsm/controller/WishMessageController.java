package com.bsm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WishMessageController {
	@RequestMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	@GetMapping("/report")
	public String showReport() throws Exception {
      System.out.println("WishMessageController.showReport()");
      return "show_report";
	}
	@PostMapping("/report")
	public String showReport1()throws Exception{
		System.out.println("WishMessageController.showReport1()");
		return "show_report1";
	}
}
