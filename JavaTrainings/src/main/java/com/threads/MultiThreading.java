package com.threads;

public class MultiThreading {

	public static void main(String[] args) {

		Resource r = new Resource();
		// whenever a new thread start executing( after calling its start
		// method) this new execution unit is given its own stack and pc
		// register which are not shared between multiple threads
		//
		// here both trying to access same r, r is allocated in heap memory, in
		// this sense we say thread share common address space
		new Thread(() -> {
			r.setI(5);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			r.setI(10);
			System.out.println(r.getI());
		}).start();

		new Thread(() -> {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("second thread: " + r.getI());
		}).start();
	}
}

class Resource {

	int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}