package com.zarroc.multithreading.deadlock;


public class ThreadOne extends Thread {

	private DummyObject one;
	private DummyObject two;

	public ThreadOne(DummyObject one, DummyObject two) {
		super();
		this.one = one;
		this.two = two;
	}

	@Override
	public void run() {
		synchronized (one) {
			System.out.println("Holding object one");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// do nothing
			}
			System.out.println("Waiting for object two ");
			synchronized (two) {
				System.out.println("Holding object two");
			}

		}
		super.run();
	}

}
