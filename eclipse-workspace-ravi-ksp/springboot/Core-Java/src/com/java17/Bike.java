package com.java17;

public non-sealed class Bike extends Vehicle implements NumberOfTyres{
// non-sealed: open for extension (breaks the sealing chain)
	
	
	
//non-sealed or sealed or final mandatory when this class extends other class which is sealed
	
	public int getPrice() {
		return 100000;
	}

	@Override
	public int addNumberOfTyres() {
		// TODO Auto-generated method stub
		return 2;
	}

}
