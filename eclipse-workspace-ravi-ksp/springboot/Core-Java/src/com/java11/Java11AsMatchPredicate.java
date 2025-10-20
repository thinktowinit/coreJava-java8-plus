package com.java11;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Java11AsMatchPredicate {
	
	
	 public static void main(String[] args) {
	        // Creating a pattern for a simple date format: YYYY-MM-DD
	        Pattern datePattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}"); // 2023-12-05
	        Pattern pattern2 =Pattern.compile("[a-zA-Z]{2}-[a-zA-Z]{2}-[a-zA-Z]{4}");

	        // Getting the match predicate from the pattern
	        Predicate<String> dateMatcher = datePattern.asMatchPredicate();
	        Predicate<String> predicate2 = pattern2.asMatchPredicate();

	        // Creating a stream of date strings and filtering them using the match predicate
	        Stream.of("2023-09-27", "12-34-5678", "2021-05-15", "abcd-ef-ij", "ad-er-wert")
	              .filter(dateMatcher)
	              .forEach(System.out::println);
	        
	        Stream.of("2023-09-27", "12-34-5678", "2021-05-15", "abcd-ef-ij", "ad-er-wert")
            .filter(predicate2)
            .forEach(System.out::println);
	    }

}
