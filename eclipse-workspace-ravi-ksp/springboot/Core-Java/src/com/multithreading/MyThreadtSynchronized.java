package com.multithreading;

public class MyThreadtSynchronized extends Thread{
	

	
	public synchronized void run() {
		
		for(int i=0; i<20; i++) {
			System.out.println(i);		}
		
	}
	
	public static void main(String[] args) {
		MyThreadtSynchronized myThreadtSynchronized1 = new MyThreadtSynchronized();
	
		MyThreadtSynchronized myThreadtSynchronized2 = new MyThreadtSynchronized();
		myThreadtSynchronized1.start();
		myThreadtSynchronized2.start();
	}



}
