package com.threads;

class Shared {

	int i;

	public void share() {
		for (int j = 0; j < 100000; j++) {
			i++;
			// System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}
}

public class Join {

	public static void main(String[] args) throws InterruptedException {

		Shared s = new Shared();
		Thread t1 = new Thread("t1") {

			public void run() {
				s.share();
				// System.out.println(s.i);
			}
		};

		Thread t2 = new Thread("t2") {

			public void run() {
				s.share();
			}
		};

		t1.start();
		t2.start();

		t1.join();// as we know join(millis) method is synchronized so here
		// main
		// thread will acquire the lock on t1 object and in inside
		// join method it wait(), it means thread which was
		// executing join method i.e main thread will be in WAITiNG
		// state and will be notified on completion of t1 only
		t2.join();
		// Thread.sleep(1000);
		System.out.println(s.i);
	}
}