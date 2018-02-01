package com.nit.service;
// imports
import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("wish")
public class WishMessageGeneratorService {
	
	public String generateWishMessage(String name){
		Calendar calendar = null;
		int hour = 0;
		String returnMessage = "";
		//get Calendar instance
		calendar = Calendar.getInstance();
		//get hour of the day
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		if(hour < 12)
			returnMessage = "Good Morning " + name;
		
		else if(hour < 16)
			returnMessage = "Good Afternoon " + name;
		
		else if(hour <20)
			returnMessage = "Good Evening " + name;
		
		else
			returnMessage = "Good Night " + name;
		
		return returnMessage;
	}// end of generateWishMessage(..)

}
