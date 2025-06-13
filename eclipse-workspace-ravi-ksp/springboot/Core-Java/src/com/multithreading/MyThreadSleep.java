package com.multithreading;

public class MyThreadSleep extends Thread {
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(3000); //no nred to call notify, after 3000 time, will release from sleep/wait state
				System.out.println(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		MyThreadSleep myThreadSleep1 = new MyThreadSleep();
	
		MyThreadSleep myThreadSleep2 = new MyThreadSleep();
		myThreadSleep1.start();
		myThreadSleep2.start();
	}

}
