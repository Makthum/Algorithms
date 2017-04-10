package com.zarroc.multithreading.concurrenttwo;

public class ThreadTwo extends Thread {

	private int number;

	public ThreadTwo(int i) {
		this.number = i;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Thread two :" + this.number);
	}

}
