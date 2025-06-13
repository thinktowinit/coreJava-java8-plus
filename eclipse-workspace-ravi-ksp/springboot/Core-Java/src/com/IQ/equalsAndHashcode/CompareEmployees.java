package com.IQ.equalsAndHashcode;

public class CompareEmployees {

	public static boolean compare(Employee e1, Employee e2) {

		if (e1.hashCode() == e2.hashCode()) {

			if (e1.equals(e2)) // true if data same
				return true;
			else
				return false; // false if data is different

		} else
			return false;

	}

}
