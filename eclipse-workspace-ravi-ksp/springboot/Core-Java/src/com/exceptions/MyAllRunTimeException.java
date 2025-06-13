package com.exceptions;

public class MyAllRunTimeException {

	static String x = null;
	static String y = "abc"; //"123"; = 123
	static int[] h= {1,2,3,4}; //index starts at 0

	public static void main(String[] args) {
		System.out.println("================line1");
		System.out.println("================line2");
		System.out.println("================line3");
		
		try {
			//System.out.println(x.length()); // error
			//int c = Integer.parseInt(y); //for conert string to interger.
			//System.out.println(c);
			int j = h[4];
			char c1 = y.charAt(3);
			int y=4;
			int x = 0;
			int m = y / x;
			System.out.println(m);
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("=============in catch block===========================");
			e.printStackTrace();
			System.out.println("=======================================");
			System.out.println(e.getMessage());
			System.out.println("===============catch block close========================");
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("================line5");// even still error, I want to execute this
		System.out.println("================line6");
	}

}
