package com.IQ.IQ43;
import java.util.Scanner;

import com.constants.CoreJavaConstants;

public class GetBricksPrice {

	private static final String INVALID_BRICK_TYPE_MESSAGE = "please enter proper brick type, you entered invalid brick type";

	//factory design pattern
	
	//RAte Plan
	//FixedRatePlan
	//VariableRatePlan
	private BricksFactory getBrickTypeObjectBasedOnBrickType(String brickType) {
		// TODO Auto-generated method stub

		if (brickType.equalsIgnoreCase(CoreJavaConstants.SMALL_BRICKS)) {
			BricksFactory bricksFactory = new SmallBrciks();
			
			//BricksFactory - interface
			//SmallBrciks - class
			
			return bricksFactory;
		} else if (brickType.equalsIgnoreCase(CoreJavaConstants.BIG_BRICKS)) {
			BricksFactory bricksFactory = new BigBricks();
			return bricksFactory;
		}

		return null;
	}

	public static void main(String[] args) {

		GetBricksPrice getBricksPrice = new GetBricksPrice();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter rate plan type");
		String brickType = sc.nextLine();
		System.out.println("you entered brickType is = " + brickType);

		BricksFactory bricksFactory = getBricksPrice.getBrickTypeObjectBasedOnBrickType(brickType);
		if (bricksFactory != null) { // != not equals
			int price = bricksFactory.getPrice();
			System.out.println(price);
		} else {
			System.out.println(INVALID_BRICK_TYPE_MESSAGE);
		}
	}

}
