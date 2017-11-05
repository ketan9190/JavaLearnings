package com.threads;

public class ThreadInterference {
	int counter = 0;

	void m1() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 100000; i++) {
			counter++;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadInterference ti = new ThreadInterference();

		new Thread(() -> ti.m1(), "thread1").start();
		new Thread(() -> ti.m1(), "thread2").start();
		Thread.sleep(1000);
		System.out.println(ti.counter);

	}
}
