package com.threads;

public class Sleep {

	public static void main(String[] args) {
		new Th1().start();
	}
}

class Th1 extends Thread {

	@Override
	public void run() {
		try {
			run(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run(int a) throws InterruptedException {
		System.out.println("Th1 starts");

		abc();

		System.out.println("Th1 ends");
	}

	private void abc() throws InterruptedException {
		throw new InterruptedException();
	}
}