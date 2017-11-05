package com.threads;

public class Deadlock {

	public static void main(String[] args) {
		String s1 = "I love java";
		String s2 = "i live in gurgaon";

		Thread t1 = new Thread() {// t1 need lock of both s1 and s2 to complete
									// the run method and same is the case with
									// t2 also.
			// t1 acquire lock on s1 first and t2 acquire lock on s2 and they
			// both cant release the same as they are waiting for each other

			public void run() {

				synchronized (s1) {
					System.out.println("t1 locked s1");

					try {
						sleep(2000);
					} catch (Exception e) {
					}
					synchronized (s2) {
						System.out.println("t1 locked s2");

					}
				}
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				synchronized (s2) {
					System.out.println("t2 locked s2");

					try {
						Thread.sleep(2000);
					} catch (Exception e) {
					}
					synchronized (s1) {
						System.out.println("t2 locked s1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}
