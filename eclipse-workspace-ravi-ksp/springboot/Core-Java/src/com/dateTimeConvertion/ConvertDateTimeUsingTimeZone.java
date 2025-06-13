package com.dateTimeConvertion;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConvertDateTimeUsingTimeZone {
	
	// requirement is convert date time from one time zone to another time zone
	// Ex:- Europe/London time zone to India time Zone
	public static void main(String[] args) {	
		// input
		// ================
//		date //2023-11-05
//		time //01:30
//		timezone //Europe/London
		
		// output
		// ================
//		 date //2023-11-05
//		 time //07:00
//		 timezone //India

		
		
		LocalDateTime localDateTime = LocalDateTime.of
				(2023, Month.NOVEMBER, 06, 10, 10, 00);
		ZonedDateTime zonedEurupLondon = localDateTime.atZone(ZoneId.of("Europe/London"));
		System.out.println("Europe/London date time ="+zonedEurupLondon);
//		ZoneId defaultZoneId = ZoneId.systemDefault();
//		 ZonedDateTime zonedDateTime = localDateTime.atZone(zoneIdOfIndia);
//		 Date date3 = Date.from(zonedDateTime.toInstant());
		ZonedDateTime zonedIST = zonedEurupLondon.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
		 System.out.println("India date time = "+zonedIST);
		 
		 //output
		 //2023-11-05T01:30Z[Europe/London]
		 //  2023-11-05T07:00+05:30[Asia/Kolkata]

	}

}
