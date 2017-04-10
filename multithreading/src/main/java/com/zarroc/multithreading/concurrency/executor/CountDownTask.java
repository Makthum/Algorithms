package com.zarroc.multithreading.concurrency.executor;

public class CountDownTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " value :" + i);
		}

	}

}
