package com.bsm.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bsm.service.IServiceWishMessage;
@Controller
public class WishMessageController {
	@Autowired
private IServiceWishMessage iServiceWishMessage;
	@RequestMapping("/report")
	public String showReport() throws Exception {
		return "show_report";
	}

	@RequestMapping("/REPORT")
	public String showReport1(Map<String,Object> map) throws Exception {
		String showWishMessage = iServiceWishMessage.showWishMessage();
		map.put("showWishMessage", showWishMessage);
		return "show_report1";
	}
}
