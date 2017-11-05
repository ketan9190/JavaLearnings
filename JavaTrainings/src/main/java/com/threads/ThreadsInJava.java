package com.threads;

class Shared1 {
	synchronized void methodOne() {
		Thread t = Thread.currentThread();

		System.out.println(t.getName() + " is relasing the lock and going to wait");

		try {
			wait(); // releases the lock of this object and waits
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
		System.out.println(t.getName() + " got the object lock back and can continue with it's execution");
	}

	synchronized void methodTwo() {
		notify();
		System.out.println("notified");
		Thread t = Thread.currentThread();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("goig to wait");
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// notify(); //wakes up one thread randomly which is waiting for lock of
		// this object

		System.out.println("A thread which is waiting for lock of this object is notified by " + t.getName());
	}
}

public class ThreadsInJava {
	public static void main(String[] args) {
		final Shared1 s = new Shared1();

		Thread t1 = new Thread() {
			public void run() {
				s.methodOne(); // t1 calling methodOne() of 's' object
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				s.methodTwo(); // t2 calling methodTwo() of 's' object
			}
		};

		t1.start();

		t2.start();
	}
}