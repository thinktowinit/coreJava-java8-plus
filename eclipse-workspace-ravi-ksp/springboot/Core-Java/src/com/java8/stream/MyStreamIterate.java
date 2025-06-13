
package com.java8.stream;

import java.util.stream.Stream;

public class MyStreamIterate {

	public static void main(String[] args) {

		Stream.iterate(20, temp -> temp + 2).filter(n -> n % 3 == 0).limit(6).forEach(System.out::println);

		// 20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54

		// 24,30,36,42,48,54

		// if we want to develop more lines of code and return final result to
		// filter....

		System.out.println("================================");
		Stream.iterate(20, temp -> { // temp = 20;
			int x = temp + 4; // 24
			int y = x + 4; // 28
			return y;
		}).filter(n -> n % 3 == 0).limit(6).forEach(System.out::println);

		// 28,36(28+4+4),
	}

}
