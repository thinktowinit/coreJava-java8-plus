package com.java16;

public final  class MyCustomImmutableClass {
	
	MyCustomImmutableClass(int x, int y){
		this.x=x;
		this.y=y;
	}

	private final int x;
	private final int y;

	public int getX() {
		return x;
	}

	

	public int getY() {
		return y;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyCustomImmutableClass myCustomImmutableClass = new MyCustomImmutableClass(1, 2);
//myCustomImmutableClass.setX(3);

	}

}
