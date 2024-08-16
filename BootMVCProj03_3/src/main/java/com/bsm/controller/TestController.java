package com.bsm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/test-operations")
public class TestController {
	@GetMapping("/all")
	public String showReport() throws Exception {
		System.out.println("TestController.showReport()");
      return "show_report1";
	}
}
