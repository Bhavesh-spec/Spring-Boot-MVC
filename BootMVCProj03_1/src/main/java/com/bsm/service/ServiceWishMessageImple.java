package com.bsm.service;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service("wishMessage")
public class ServiceWishMessageImple implements IServiceWishMessage{
public String showWishMessage() {
	LocalDateTime dateTime = LocalDateTime.now();
	int hour = dateTime.getHour();
	if(hour<12) {
		return "Good Morning:";
	}else if(hour<16){
		return "Good Afternoon:";
	}else if(hour<20){
		return "Good Evening::";

	}else {		
		return "Good Night:";
	}
}
}
