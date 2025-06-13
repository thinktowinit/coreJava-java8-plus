package com.java17;

public sealed interface NumberOfTyres permits Car,Bike,Bus, Vehicle{
//should add tyres for only 3 type of vehicles  bike, car, bus
	public int addNumberOfTyres();

}
