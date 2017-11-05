package com.threads;

public class SampleThread0 {
	public static void main(String[] args) {
		T1 t = new T1(new T2());
		t.start();

	}

	{
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class T1 extends Thread {

	public T1(Runnable r) {
		super(r);
	}

	@Override
	public void run() {
		super.run();
		System.out.println("extends Thread");
	}
}

class T2 implements Runnable {

	@Override
	public void run() {
		System.out.println("implements Runnable");
	}
}