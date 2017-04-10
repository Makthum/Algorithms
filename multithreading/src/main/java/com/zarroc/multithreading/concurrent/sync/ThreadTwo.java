package com.zarroc.multithreading.concurrent.sync;

public class ThreadTwo extends Thread {

	private DummyObject number;

	public ThreadTwo(DummyObject o) {

		this.number = o;
	}

	@Override
	public void run() {
		super.run();
		synchronized (number) {
			System.out.println("Thread one :" + this.number.getNumber());
		}
	}

}
