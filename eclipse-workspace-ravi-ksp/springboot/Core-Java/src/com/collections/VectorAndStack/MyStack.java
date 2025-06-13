package com.collections.VectorAndStack;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("b");
		s.push("h");
		s.push("e");
		s.push("e");
		s.push("m");
		s.push("a");
		
		System.out.println(s);
		
		System.out.println(s.size());
		
		s.pop();
		System.out.println(s);
		
	}

}
