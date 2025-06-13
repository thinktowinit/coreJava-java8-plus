package com.java11;

import java.util.concurrent.TimeUnit;

public class Java11TimeUnit {
	
	 public static void main(String args[])
	    {
	        long hours = 96;
	 
	        // Convert given time (hours)in days
	        long days = TimeUnit.DAYS.convert(hours, TimeUnit.HOURS);
	 
	        // Convert days in minutes
	        long minutes = TimeUnit.MINUTES.convert(days, TimeUnit.DAYS);
	 
	        System.out.println(hours + " Hours = " + days
	                           + " Days = " + +minutes
	                           + " Minutes");
	 
	        // Convert given time (minutes) to microseconds
	        long micros = TimeUnit.MINUTES.toMicros(minutes);
	        System.out.println(minutes + " Minutes = " + micros
	                           + " Microseconds");
	 
	        // Convert given time (microseconds) to seconds
	        long seconds = TimeUnit.MICROSECONDS.toSeconds(micros);
	        System.out.println(micros + " Microseconds = "
	                           + seconds + " Seconds");
	 
	        // Create TimeUnit object of type Minutes
	        TimeUnit time = TimeUnit.valueOf("MINUTES");
	        System.out.println("TimeUnit object type: " + time);
	    }

}
