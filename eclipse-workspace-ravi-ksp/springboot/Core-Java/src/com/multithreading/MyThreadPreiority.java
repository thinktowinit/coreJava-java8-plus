package com.multithreading;

public class MyThreadPreiority extends Thread {
	
	@Override
	public void run() {
		
		for (int i = 0; i < 25; i++) {// System.out.println(i);
			System.out.println(Thread.currentThread().getName());  //24 times for 1 thread
		}
		
	}

	
	
	public static void main(String[] args) {
		MyThreadPreiority myThreadPreiority1 = new MyThreadPreiority();
		myThreadPreiority1.setPriority(MAX_PRIORITY);
		myThreadPreiority1.setName("myThreadPreiority1");
		
		MyThreadPreiority myThreadPreiority2 = new MyThreadPreiority();
		myThreadPreiority2.setPriority(MAX_PRIORITY);
		myThreadPreiority2.setName("myThreadPreiority2");
		
		myThreadPreiority1.start();
		myThreadPreiority2.start();
		
		
		myThreadPreiority1.yield();
		
		
	}
}
