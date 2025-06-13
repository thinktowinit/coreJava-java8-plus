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

		System.out.println(todayDate);
		return todayDate;
	}

	private static LocalTime getCurrentTime() {
		// TODO Auto-generated method stub

		LocalTime currentTime = LocalTime.now();

		System.out.println(currentTime);
		return currentTime;

	}

	private static LocalDateTime getCurrentDateTime() {
		// TODO Auto-generated method stub

		LocalDateTime currentDateTime = LocalDateTime.now();

		return currentDateTime;

	}

	private static String getDateUsingDateTimeFormatter(LocalDateTime localDateTime) {
		// TODO Auto-generated method stub

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(CoreJavaConstants.DATE_TIME_FORMATTER);
		String formatedDate = localDateTime.format(dateTimeFormatter);
		return formatedDate;

	}

	public static Month getCurrentMonth() {
		// TODO Auto-generated method stub

		return getCurrentDateTime().getMonth();

	}

	private static int getToday() {
		// TODO Auto-generated method stub

		return getCurrentDateTime().getDayOfMonth();

	}

	private static int getSeconds() {
		// TODO Auto-generated method stub

		return getCurrentDateTime().getSecond();

	}

	private static LocalDate getSpecifiedDate() {
		// TODO Auto-generated method stub

		LocalDate localDate = LocalDate.of(2023, 05, 14);
		return localDate;

	}

	private static Period getDifferenceBetweenDates() {
		// TODO Auto-generated method stub
		LocalDate localDateToday = getTodayDate();
		LocalDate localDate2 = LocalDate.of(2023, Month.MAY, 14);
		Period period = Period.between(localDate2, localDateToday);
		return period;

	}

	private static Duration getDifferenceBetweenTimes() {
		// TODO Auto-generated method stub
		LocalTime currentTime = getCurrentTime();
		Duration duration = Duration.ofHours(5);
		LocalTime after5Hours = currentTime.plus(duration);

		System.out.println(" after5Hours = " + after5Hours);
		Duration durationBetweenTimes = Duration.between(after5Hours, currentTime);
		System.out.println(durationBetweenTimes);
		return durationBetweenTimes;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getTodayDate();
		getCurrentTime();

		LocalDateTime localDateTimeDefaultFormat = getCurrentDateTime();
		System.out.println("localDateTime Default Format = " + localDateTimeDefaultFormat);

		// display date in format of DATE_TIME_FORMATTER

		LocalDateTime localDateTime = getCurrentDateTime();
		String dateAFterFornatted = getDateUsingDateTimeFormatter(localDateTime);
		System.out.println("In my own format = " + dateAFterFornatted);

		System.out.println(getCurrentMonth());
		System.out.println(getToday());
		System.out.println(getSeconds());
		System.out.println(getSpecifiedDate());
		Period period = getDifferenceBetweenDates();
		System.out.println(
				period.getDays() + "  days, " + period.getMonths() + " months, " + period.getYears() + " years");
		getDifferenceBetweenTimes();

	}

}
