package com.java17;

public non-sealed class Car extends Vehicle implements NumberOfTyres{
	
	
	public int getPrice() {
		return 1000000;
	}

	@Override
	public int addNumberOfTyres() {
		// TODO Auto-generated method stub
		return 4;
	}

}
