package com.zarroc.multithreading.concurrent;

public class ThreadOne extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("Thread one :" + this);
	}

}
