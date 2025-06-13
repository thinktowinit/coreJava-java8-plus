package com.java17;

public sealed class Vehicle implements NumberOfTyres permits Bike,Car,Bus {

	@Override
	public int addNumberOfTyres() {
		// TODO Auto-generated method stub
		return 0;
	}

}
