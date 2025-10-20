package com.java15;

public class MainClass {

	public static void main(String[] args) {
		Product product = new Product();

		PriceDetails priceDetails = new PriceDetails();
		//priceDetails.setPriceType("monthlyPrice");
		product.setPriceDetails(priceDetails);

		int length = product.getPriceDetails().getPriceType().length();
		System.out.println(length);
//		if(product != null) {
//			product.getPriceDetails();
//			if(product.getPriceDetails() != null) {
//				product.getPriceDetails().getPriceType();
//				if(product.getPriceDetails().getPriceType() != null) {
//					product.getPriceDetails().getPriceType().length();
//				}
//			}
//		}

		// get exception with clear information as null from which poroperty, product or
		// getPriceDetails or getPriceType
		
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because the return value of "com.java15.PriceDetails.getPriceType()" is null
		//at com.java15.MainClass.main(MainClass.java:16)

	}

}
