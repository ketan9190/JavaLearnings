package com.threads;

/**
 * JVM will not wait fot the daemon thread to complete its execution and will
 * termiante the appliaction as soon as the user threads have finished their
 * execution.
 * 
 * @author ketan
 *
 */
public class UserVsDaemonThread {
	public static void main(String[] args) {
		new UserThread().start();
		new DaemonThread().start();
	}
}

class UserThread extends Thread {
	@Override
	public void run() {
		System.out.println("I am user thread");
	}
}

class DaemonThread extends Thread {
	DaemonThread() {
		setDaemon(true);
	}

	public void run() {
		System.out.println("daemon thread has started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("daemon thread has finished working");
	};
}