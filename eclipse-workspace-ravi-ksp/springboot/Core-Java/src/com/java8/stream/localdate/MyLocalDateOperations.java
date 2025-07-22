package com.java8.stream.localdate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import com.constants.CoreJavaConstants;

public class MyLocalDateOperations {

	public static LocalDate getTodayDate() {
		// TODO Auto-generated method stub

		LocalDate todayDate = LocalDate.now();

		System.out.println("Today date "+todayDate);
		return todayDate;
	}

	private static LocalTime getCurrentTime() {
		// TODO Auto-generated method stub

		LocalTime currentTime = LocalTime.now();

		System.out.println("present time "+currentTime);
		return currentTime;

	}

	private static LocalDateTime getCurrentDateTime() {
		// TODO Auto-generated method stub

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("localDateTime Default Format = " + currentDateTime);
		return currentDateTime; //2025-7-22 09:02:22

	}

	private static String getDateUsingDateTimeFormatter(LocalDateTime localDateTime, String formatter) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatter);
		String formatedDate = localDateTime.format(dateTimeFormatter);
		return formatedDate;
	}

	public static Month getCurrentMonth() {
		// TODO Auto-generated method stub

		return getCurrentDateTime().getMonth();
		     //(2025-7-22 09:02:22).getMonth() = JULY
	}

	private static int getToday() {

		return getCurrentDateTime().getDayOfMonth();

	}

	private static int getSeconds() {
		// TODO Auto-generated method stub

		return getCurrentDateTime().getSecond();

	}

	private static LocalDate getSpecifiedDate() {
		// TODO Auto-generated method stub

		LocalDate localDate = LocalDate.of(1993, 1, 26); //1993-01-26
		return localDate;

	}

	private static Period getDifferenceBetweenDates() {
		// TODO Auto-generated method stub
		LocalDate localDateToday = getTodayDate();
		LocalDate localDate2 = LocalDate.of(2023, Month.MAY, 14);
		Period period = Period.between(localDate2, localDateToday);
		System.out.println(period.getDays() + "  days, " + period.getMonths() + " months, " + period.getYears() + " years");
		return period;

	}

	private static Duration getDifferenceBetweenTimes() {
		// TODO Auto-generated method stub
		LocalTime currentTime = getCurrentTime();
		Duration duration = Duration.ofHours(5);
		LocalTime after5Hours = currentTime.plus(duration);

		System.out.println(" after5Hours = " + after5Hours);
		Duration durationBetweenTimes = Duration.between(after5Hours, currentTime);
		System.out.println("duration between above times "+durationBetweenTimes);
		return durationBetweenTimes;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getTodayDate();
		//getCurrentTime();
//
		//LocalDateTime localDateTimeDefaultFormat = getCurrentDateTime();
		
//
//	    display date in format of DATE_TIME_FORMATTER

		LocalDateTime localDateTime = getCurrentDateTime();
//		String dateAFterFornatted = getDateUsingDateTimeFormatter(localDateTime, CoreJavaConstants.DATE_TIME_FORMATTER);
//		System.out.println("In my own format = " + dateAFterFornatted);
//		String dateAFterFornatted2 = getDateUsingDateTimeFormatter(localDateTime, CoreJavaConstants.DATE_TIME_FORMATTER2);
//		System.out.println("In my own format2 = " + dateAFterFornatted2);
//		String dateAFterFornatted3 = getDateUsingDateTimeFormatter(localDateTime, CoreJavaConstants.DATE_TIME_FORMATTER3);
//		System.out.println("In my own format3 = " + dateAFterFornatted3);
//		String dateAFterFornatted4 = getDateUsingDateTimeFormatter(localDateTime, CoreJavaConstants.DATE_TIME_FORMATTER4);
//		System.out.println("In my own format4 = " + dateAFterFornatted4);
//
//		System.out.println(getCurrentMonth());
//		System.out.println(getToday());
//		System.out.println(getSeconds());
//		System.out.println(getSpecifiedDate());
//		getDifferenceBetweenDates();
		getDifferenceBetweenTimes();
		
		LocalDate specifiedDate = LocalDate.of(2025, 5, 22);
		getSpecifiedDateWithCurrentTime(specifiedDate);

	}

	private static void getSpecifiedDateWithCurrentTime(LocalDate specifiedDate) {
		// TODO Auto-generated method stub
		
		  LocalTime currentTime = LocalTime.now();

	        // Combine specified date with current time
	        LocalDateTime combinedDateTime = LocalDateTime.of(specifiedDate, currentTime);

	        // Print the result
	        System.out.println("Specified date with current time: " + combinedDateTime);
		
	}

}
