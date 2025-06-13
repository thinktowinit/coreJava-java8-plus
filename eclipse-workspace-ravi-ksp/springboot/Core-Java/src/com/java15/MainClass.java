package com.java15;

public class MainClass {

	public static void main(String[] args) {
		Product product = new Product();

		PriceDetails priceDetails = new PriceDetails();

		product.setPriceDetails(priceDetails);

		int length = product.getPriceDetails().getPriceType().length();

		// get exception with clear information as null from which poroperty, product or
		// getPriceDetails or getPriceType
		
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because the return value of "com.java15.PriceDetails.getPriceType()" is null
		//at com.java15.MainClass.main(MainClass.java:16)

	}

}
