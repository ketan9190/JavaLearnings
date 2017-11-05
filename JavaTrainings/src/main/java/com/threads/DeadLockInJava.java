package com.threads;

public class DeadLockInJava {
	public static void main(String[] args) {
		final Shared2 s1 = new Shared2();

		final Shared2 s2 = new Shared2();

		Thread t1 = new Thread() {
			public void run() {
				s1.methodOne(s2);
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				s2.methodTwo(s1);
			}
		};

		t1.start();

		t2.start();
	}
}

class Shared2 {
	synchronized void methodOne(Shared2 s) {
		Thread t = Thread.currentThread();

		System.out.println(t.getName() + "is executing methodOne...");

		System.out.println(t.getName() + "is calling methodTwo...");

		s.methodTwo(this);

		System.out.println(t.getName() + "is finished executing methodOne...");
	}

	synchronized void methodTwo(Shared2 s) {
		Thread t = Thread.currentThread();

		System.out.println(t.getName() + "is executing methodTwo...");

		System.out.println(t.getName() + "is calling methodOne...");

		s.methodOne(this);

		System.out.println(t.getName() + "is finished executing methodTwo...");
	}
}