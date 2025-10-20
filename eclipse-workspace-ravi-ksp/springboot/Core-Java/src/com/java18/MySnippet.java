package com.java18;

/**
 * Utility class for demo.
 */
public class MySnippet {

    /**
     * Reverses a string.
     *
     * Example usage:
     * {@snippet :
     * String result = com.java18.MySnippet.reverse("Java");
     * System.out.println(result); // avaJ
     * }
     *
     * @param input The string to reverse.
     * @return The reversed string.
     */
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    
    public static void main(String[] args) {
		String r = reverse("abcde");
		System.out.println(r);
	}
    
    
    
    /**
     * This is how you use the method:
     * <pre>
     * {@code
     * 
     *  String result = com.java18.MyUtils.reverse("Java");
     * System.out.println(result); // avaJ
     * }
     * </pre>
     */
    public static String reverseBeforeJava18(String input) {
        return new StringBuilder(input).reverse().toString();
    }

}
