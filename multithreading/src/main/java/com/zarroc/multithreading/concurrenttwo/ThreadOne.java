package com.zarroc.multithreading.concurrenttwo;

public class ThreadOne extends Thread {
	private int number;

	public ThreadOne(int i) {
		this.number = i;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Thread one :" + this.number);
	}

}
