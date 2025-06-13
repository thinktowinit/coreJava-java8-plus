package com.java8.stream.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;

import com.constants.CoreJavaConstants;
import com.util.CoreJavaUtil;

public class CalculateIntrestForBankLoan {

	// principle amount
	// loan disbursed date
	// loan payment date
	// intrest rate...18%

	// monthly 1.5 rupee per 100, 18% per year

	public static void main(String[] args) {
		LocalDate loanDisbursedDate = LocalDate.of(2022, Month.DECEMBER, 01);
		LocalDate loanPaymentDate = LocalDate.of(2023, Month.DECEMBER, 23);
		float totalAmount = calculateTotalAmount(100000, loanDisbursedDate, loanPaymentDate, 18);
		System.out.println(totalAmount);

	}

	private static float calculateTotalAmount(float principleAmount, LocalDate disbursedAmount,
			LocalDate loanPaymentDate, float intrestRate) {

		Map<String, Integer> getYearsMonthsDaysDetails = CoreJavaUtil.getDifferenceBetweenDates(disbursedAmount,
				loanPaymentDate);

		float totalIntrest = getTotalIntrest(principleAmount, intrestRate, getYearsMonthsDaysDetails);

		return principleAmount + totalIntrest;
	}

	private static float getTotalIntrest(float principleAmount, float intrestRate, Map<String, Integer> yearMonthsDaysDetails) {
		System.out.println("years = " + yearMonthsDaysDetails.get(CoreJavaConstants.YEARS));
		System.out.println("months = " + yearMonthsDaysDetails.get(CoreJavaConstants.MONTHS));
		System.out.println("days = " + yearMonthsDaysDetails.get(CoreJavaConstants.DAYS));

		float intrestForYears = CoreJavaUtil.calculateIntrestForYears(yearMonthsDaysDetails.get(CoreJavaConstants.YEARS), intrestRate,
				principleAmount);
		float intrestForMOnths = CoreJavaUtil.calculateIntrestForMOnths(yearMonthsDaysDetails.get(CoreJavaConstants.MONTHS), intrestRate,
				principleAmount);
		float intrestForDays = CoreJavaUtil.calculateIntrestForDays(yearMonthsDaysDetails.get(CoreJavaConstants.DAYS), intrestRate,
				principleAmount);
		float totalIntrest = intrestForYears + intrestForMOnths + intrestForDays;
		System.out.println("total intrest = " + totalIntrest);
		return totalIntrest;
	}

}
