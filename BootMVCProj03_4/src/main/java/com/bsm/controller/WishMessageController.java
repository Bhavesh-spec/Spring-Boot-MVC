package com.bsm.controller;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WishMessageController {
	@GetMapping("/")
	public String show() throws Exception {
		  return "welcome";
	}	
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) {
		map.put("favColors", new String[] {"red","green","yello"});
		map.put("nickNames", List.of("raja","raj","maharaj"));
		map.put("phoneNumbers",Set.of(969993L,887787L,7777747L));
		map.put("idDetails",Map.of("adharno",789962,"voterId",66548741));
   
		  return "show_report";
	}	
}
