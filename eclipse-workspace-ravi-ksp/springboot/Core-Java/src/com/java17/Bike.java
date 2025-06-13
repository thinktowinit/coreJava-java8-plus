package com.java17;

public non-sealed class Bike extends Vehicle implements NumberOfTyres{

	public int getPrice() {
		return 100000;
	}

	@Override
	public int addNumberOfTyres() {
		// TODO Auto-generated method stub
		return 2;
	}

}
