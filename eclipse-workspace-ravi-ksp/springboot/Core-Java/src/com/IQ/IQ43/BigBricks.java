package com.IQ.IQ43;
import com.constants.CoreJavaConstants;
//Variable Rate Plan
public class BigBricks implements BricksFactory {

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return CoreJavaConstants.BIG_BRICKS_PRICE; //6000
	}

}
