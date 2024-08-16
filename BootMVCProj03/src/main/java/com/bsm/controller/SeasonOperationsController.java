package com.bsm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bsm.service.ISeasonFinderService;

@Controller
public class SeasonOperationsController {
	@Autowired
	private ISeasonFinderService iSeasonFinderService;

	@RequestMapping("/")
	public String showHome() {
          return "welcome";
	}
	@RequestMapping("/season")
	public String showSeason(Map<String,Object> map) {
		String msg = iSeasonFinderService.findSeason();
		System.out.println(msg);
	      map.put("resultMsg", msg);
		return "display";
	}
}
