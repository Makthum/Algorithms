package com.zarroc.multithreading.concurrent.sync;

public class ThreadOne extends Thread {
	private DummyObject number;

	public ThreadOne(DummyObject o) {
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
