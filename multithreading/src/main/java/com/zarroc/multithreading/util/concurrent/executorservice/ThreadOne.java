package com.zarroc.multithreading.util.concurrent.executorservice;

public class ThreadOne implements Runnable {
	private int number;
	
	public ThreadOne(int number) {
		this.number=number;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Value :" + this.number);
	}

}
