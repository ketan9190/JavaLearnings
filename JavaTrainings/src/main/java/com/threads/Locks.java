package com.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {
	int counter = 0;
	Lock lock = new ReentrantLock();

	void m1() {
		System.out.println(Thread.currentThread().getName());
		lock.lock();
		for (int i = 1; i <= 100000; i++) {

			counter++;
		}
		lock.unlock();
	}

	public static void main(String[] args) throws InterruptedException {

		Locks ti = new Locks();
		new Thread(() -> ti.m1(), "thread1").start();
		new Thread(() -> ti.m1(), "thread2").start();
		Thread.sleep(1000);
		System.out.println(ti.counter);

	}
}
