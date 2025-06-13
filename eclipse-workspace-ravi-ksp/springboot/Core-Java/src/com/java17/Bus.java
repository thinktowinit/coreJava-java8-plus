package com.java17;

public non-sealed class Bus extends Vehicle implements NumberOfTyres{
	
	public int getPrice() {
		return 5000000;
	}

	@Override
	public int addNumberOfTyres() {
		// TODO Auto-generated method stub
		return 6;
	}

}
