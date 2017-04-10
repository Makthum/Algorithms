package com.zarroc.multithreading.freedeadlock;


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
		synchronized (one) {
			System.out.println("Holding object one");
			
			System.out.println("Waiting for object two ");
			synchronized (two) {
				System.out.println("Holding object two");
			}

		}
		super.run();
	}

}
