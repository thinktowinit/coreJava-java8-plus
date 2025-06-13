package com.multithreading;

public class BasicThreadRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("BasicThreadRunnable");
		
	}
	
	public static void main(String[] args) {
		BasicThreadRunnable t1 = new BasicThreadRunnable();
		Thread thread = new Thread(t1);
		thread.start();
	}

}
