package com.myPolymorphisam.methodOverridingExample2;

public class OrdinaryBus extends Bus implements Vehicle {

	@Override
	public void driving() {
		// TODO Auto-generated method stub
		System.out.println("Oridinary bus driving");
	}
	
}
