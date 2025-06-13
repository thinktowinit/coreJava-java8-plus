package com.multithreading;

public class TnreadJoinMethodMeans extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 2; j++) {
			try {
				// sleeping the thread for 300 milli seconds
				Thread.sleep(300);
				System.out.println("The current thread name is: " + Thread.currentThread().getName());
			}
			// catch block for catching the raised exception
			catch (Exception e) {
				System.out.println("The exception has been caught: " + e);
			}
		}
	}

	public static void main(String[] args) {

		TnreadJoinMethodMeans th1 = new TnreadJoinMethodMeans();
		th1.setName("th1");
		TnreadJoinMethodMeans th2 = new TnreadJoinMethodMeans();
		th2.setName("th2");
		TnreadJoinMethodMeans th3 = new TnreadJoinMethodMeans();
		th3.setName("th3");

		th1.start();

		// starting the th2 thread after when the first thread th1 has ended or died.
		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());

			// invoking the join() method
			th1.join();
		}

		// catch block for catching the raised exception
		catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}

		// thread th2 starts
		th2.start();

		// starting the th3 thread after when the thread th2 has ended or died.
		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());
			th2.join();
		}

		// catch block for catching the raised exception
		catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}

		// thread th3 starts
		th3.start();
	}

}
