package com.java16;

import java.util.Scanner;

public class MyTypeCasting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter select ur vehicle");
		String vehicleTYpe = sc.nextLine();
		System.out.println("you selected vehicle is = " + vehicleTYpe);
		int price = 0;
		if (vehicleTYpe.equalsIgnoreCase("car")) {
			price = getVehiclePriceUsingJava16(new Car());
		} else if (vehicleTYpe.equalsIgnoreCase("bus")) {
			price = getVehiclePrice(new Bus());
		} else if (vehicleTYpe.equalsIgnoreCase("bike")) {
			price = getVehiclePrice(new Bike());
		} else {
			System.out.println("please select only bike or car or bus");
		}

		System.out.println("price is = " + price);

	}

	// get vehicle price based on vehicle

	private static Integer getVehiclePrice(Vehicle vehicle) {
		// instanceof will check object of which class.

		if (vehicle instanceof Bike) { // checking is it bike object or not
			Bike veh = (Bike) vehicle; // type cast
			int price = veh.getPrice();
			return price;
		} else if (vehicle instanceof Car) {

			Car veh = (Car) vehicle; // type cast
			int price = veh.getPrice();
			return price;
		} else if (vehicle instanceof Bus) {
			Bus veh = (Bus) vehicle; // type cast
			int price = veh.getPrice();
			return price;
		}

		return null;

	}

	private static Integer getVehiclePriceUsingJava16(Vehicle vehicle) {
		// instanceof will check object of which class.

		if (vehicle instanceof Bike selectedvehicle) { // checking is it bike object or not
			// Bike veh = (Bike) vehicle; // no need type casting from java16
			int price = selectedvehicle.getPrice();
			return price;
		} else if (vehicle instanceof Car veh) {

			// Car veh = (Car) vehicle; // type cast
			int price = veh.getPrice();
			return price;
		} else if (vehicle instanceof Bus veh) {
			// Bus veh = (Bus) vehicle; // type cast
			int price = veh.getPrice();
			return price;
		}

		return null;

	}

}
