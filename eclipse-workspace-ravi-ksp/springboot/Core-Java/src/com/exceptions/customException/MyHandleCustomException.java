package com.exceptions.customException;

import java.util.Scanner;

public class MyHandleCustomException {
	
	
	static int age;

	private static void checkValidVoterOrNot(int age) {

		if (age < 18) {
			throw new InvalidForVotingExcaption("You not valid for voting, y bcz u dont have age 18");
		} else {
			System.out.println("valid for voting");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter ur age");
		age = sc.nextInt();
		System.out.println("you entered age is = " + age);
		try {
			checkValidVoterOrNot(age);
		} catch (InvalidForVotingExcaption e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=======================line");
	}


}
