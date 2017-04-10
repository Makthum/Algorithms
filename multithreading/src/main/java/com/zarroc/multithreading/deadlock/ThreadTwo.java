package com.zarroc.multithreading.deadlock;


public class ThreadTwo extends Thread {

	private DummyObject one;
	private DummyObject two;

	public ThreadTwo(DummyObject one, DummyObject two) {
		super();
		this.one = one;
		this.two = two;
	}

	@Override
	public void run() {
		synchronized (two) {
			System.out.println("Holding object two");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// do nothing
			}
			System.out.println("Waiting for object one ");
			synchronized (one) {
				System.out.println("Holding object one");
			}

		}
		super.run();
	}

}
