package com.multithreading;

public class MyThreadJoin extends Thread {

	public void run() {

		for (int i = 0; i < 25; i++) {// System.out.println(i);
			System.out.println(Thread.currentThread().getName());  //24 times for 1 thread
		}

	}

	public static void main(String[] args) {
		MyThreadJoin myThreadJoin1 = new MyThreadJoin();
		MyThreadJoin myThreadJoin2 = new MyThreadJoin();
		myThreadJoin1.setName("Tortoise1");
		myThreadJoin2.setName("Tortoise2");
		myThreadJoin1.start();
		myThreadJoin2.start();
		
		try {
			myThreadJoin1.wait(); //waiting some time
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("=====1====="+e1.getMessage());
		}
		for (int i = 0; i < 5; i++) {
			try {
				myThreadJoin1.notify();
				// myThreadJoin1.join();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("====2======"+e.getMessage());
			}
			System.out.println("after thread code");

		}

	}

}
