package com.java14;

import java.time.LocalDate;
import java.time.Month;

import com.java8.stream.localdate.MyLocalDateOperations;

public class MySwitchCase {

	private static String switchCaseBeforeJava14() {
		// TODO Auto-generated method stub

		LocalDate localDate = MyLocalDateOperations.getTodayDate();
		var month = localDate.getMonth();

		switch (month) {
		case JANUARY:
			// code block
			return "Happy new year";
		case FEBRUARY:
			// code block
			return "Happy valentence day";
		case MARCH:
			return "Happy Ugadi";

		case APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER:
			return "Finance year started";
		default:
			return "Happy journey";
		}

	}

	private static String switchCaseFromJava14() {
		// TODO Auto-generated method stub
		LocalDate localDate = MyLocalDateOperations.getTodayDate();
		var month = localDate.getMonth();

		return switch (month) {
		case JANUARY -> {
			System.out.println("welcomme to new year");
			yield "Happy new year";
		}
		// code block
		case MARCH -> "Happy Ugadi";

		case APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER -> "Finance year started";
		default -> "Happy journey";
		};
	}

	// calculate monthly payment, for new year Jan add 10000 bonus, for feb decrese
	// 2 days payment.

	private static int calculateMonthlyPayment() {
		// TODO Auto-generated method stub
		LocalDate localDate = MyLocalDateOperations.getTodayDate();
		//var month = localDate.getMonth();
		var month = Month.JANUARY;
		int monthlyPayment = 60000;
		return switch (month) {
		case JANUARY -> {
			int janPayment = 60000 + 10000;
			yield janPayment;
		}
		case FEBRUARY -> {
			int febPayment = 60000 - 4000;
			yield febPayment;
		}
		// code block

		case MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> monthlyPayment;
		default -> monthlyPayment;
		};
	}

	public static void main(String[] args) {

		System.out.println(switchCaseBeforeJava14());
		System.out.println("============================");
		System.out.println(switchCaseFromJava14());
		System.out.println("========================");
		System.out.println(calculateMonthlyPayment());

	}

}
