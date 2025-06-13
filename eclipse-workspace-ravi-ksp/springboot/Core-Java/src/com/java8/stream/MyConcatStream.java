package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyConcatStream {

	public static void main(String[] args) {

		List<String> listOfNames = Arrays.asList("abc", "czdfd", "fsdf");
		List<String> listOfNames2 = Arrays.asList("agdfgbc", "chfghzdfd", "fshfghdf");

		Stream<String> totalStream = Stream.concat(listOfNames.stream(), listOfNames2.stream());

		totalStream.forEach(System.out::println);

	}

}
