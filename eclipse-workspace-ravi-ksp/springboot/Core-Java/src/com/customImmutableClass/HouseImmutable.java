package com.customImmutableClass;
//immutable class before java16
public final class HouseImmutable {

	private final int price;
	private final String houseName;

	public HouseImmutable(int price, String houseName) {
		// TODO Auto-generated constructor stub

		this.price = price;
		this.houseName = houseName;
	}

	public int getPrice() {
		return price;
	}

	public String getHouseName() {
		return houseName;
	}

	public static void main(String[] args) {

		HouseImmutable house = new HouseImmutable(1, "Aiswarya villas");

		System.out.println(house.getHouseName());

	}

}
