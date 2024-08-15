package com.bsm.controll;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ShowHomeController {
	@GetMapping("/hello")
	public String showHome() {
         return "welcome";
	}
}
