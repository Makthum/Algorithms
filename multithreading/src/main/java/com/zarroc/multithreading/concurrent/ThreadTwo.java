package com.zarroc.multithreading.concurrent;

public class ThreadTwo extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("Thread two :" + this);
	}

}
