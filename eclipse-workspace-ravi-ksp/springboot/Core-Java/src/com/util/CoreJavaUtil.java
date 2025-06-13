package com.util;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

import com.constants.CoreJavaConstants;

public class CoreJavaUtil {

	public static Float calculateIntrestForYears(int totalYears, float intrestRate, float principleAmount) {

		float numerOfHundresds = principleAmount/100;
		// intrest amount by default they give per year 18%
		float intrestForOneYear = numerOfHundresds * intrestRate; // 18000
		float intrestForTotalYears = totalYears * intrestForOneYear; // 3*180000 = 54000
		return intrestForTotalYears;
	}

	public static Float calculateIntrestForMOnths(int totalMonths, float intrestRate, float principleAmount) {
		float numerOfHundresds = principleAmount / 100; //
		float intrestForOneMonth = (numerOfHundresds * intrestRate) / 12; // 1500 per year
		float intrestForTotalMOnths = totalMonths * intrestForOneMonth; // 3*1500 = 4500
		return intrestForTotalMOnths;
	}

	public static Float calculateIntrestForDays(int totalDays, float intrestRate, float principleAmount) {
		float numerOfHundresds = principleAmount / 100; //
		float intrestForOneMonth = (numerOfHundresds * intrestRate) / 12;// 1500
		float intrestForDay = intrestForOneMonth / 30; // 50
		float intrestForTotalDays = intrestForDay * totalDays; // 3 days*50 = 150
		return intrestForTotalDays;
	}

	public static Map<String, Integer> getDifferenceBetweenDates(LocalDate fromDate, LocalDate toDate) {
		// TODO Auto-generated method stub
		LocalDate localDateToday = toDate;
		LocalDate localDate2 = fromDate;
		Period period = Period.between(localDate2, localDateToday);

		// TODO Auto-generated method stub
		// how many years, how many months, how many days
		// Ex:- 2 years, 10 months, 5 days
		// Ex:- years, 2, k, v
		// months, 2, k, v
		// days, 2, K,v
		Map<String, Integer> map = new HashMap<>();
		map.put(CoreJavaConstants.YEARS, period.getYears());
		map.put(CoreJavaConstants.MONTHS, period.getMonths());
		map.put(CoreJavaConstants.DAYS, period.getDays());

		return map;

	}

}
