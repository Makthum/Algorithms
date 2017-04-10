package com.zarroc.multithreading.concurrentthree;

public class ThreadOne extends Thread {
	private DummyObject number;

	public ThreadOne(DummyObject o) {
		this.number = o;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Thread one :" + this.number.getNumber());
	}

}
