package com.myPolymorphisam.methodOverridingExample2;

public class MainClass {
	
	public static void main(String[] args) {

		Bus bus = new OrdinaryBus(); // Oridinary bus driving //run time polympsm
		//bus = new ExpressBus(); //Express bus driving //run time polympsm
		//bus = new Bus();//bus driving // compile time polympsm

		bus.driving();

	}

}
