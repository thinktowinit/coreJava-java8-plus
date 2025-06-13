package com.multithreading;

public class MyThreadYeild extends Thread {

	public void run() {

		for (int i = 0; i < 25; i++) {// System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}

	}

	public static void main(String[] args) {
		MyThreadYeild myThreadYeild = new MyThreadYeild();
		myThreadYeild.setName("Tortoise");
		myThreadYeild.start();
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("after thread code");

		}

	}

}
