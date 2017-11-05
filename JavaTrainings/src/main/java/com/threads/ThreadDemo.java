package com.threads;

public class ThreadDemo {
	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		t1.start();

		Thread.sleep(10);
		t1.join();
		t2.start();
		System.out.println("bye");
		// t2.join();
	}
}