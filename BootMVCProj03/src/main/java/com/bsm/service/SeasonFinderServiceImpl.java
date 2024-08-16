package com.bsm.service;
import java.time.LocalDate;
import java.time.Month;
import org.springframework.stereotype.Service;
@Service("seasonService")
public class SeasonFinderServiceImpl implements ISeasonFinderService{	
	public String findSeason() {
		LocalDate dateTime = LocalDate.now();
		int month = dateTime.getMonthValue();
		 
		if(month==2){
			return "Spring";
		}
		else if(month>2 && month<=5){
			return "Summer";
		} 
		else if(month>5 && month<=9){
			return "Monsoon";
		} 
		else if(month>9 && month<=11){
			return "Autumn";
		} 
	    else{
		    return "Winter";
	   }			
	}
}
