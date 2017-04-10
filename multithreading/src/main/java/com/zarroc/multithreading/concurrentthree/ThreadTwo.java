package com.zarroc.multithreading.concurrentthree;

public class ThreadTwo extends Thread {

	private DummyObject number;

	public ThreadTwo(DummyObject o) {
		this.number = o;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Thread two :" + this.number.getNumber());
	}

}
