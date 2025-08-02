package com.java17;

public sealed class Vehicle implements NumberOfTyres permits Bike,Car,Bus {

	//Bike,Car,Bus   only these class will use Vehicle as a super class
	
	@Override
	public int addNumberOfTyres() {
		return 0;
	}

}
