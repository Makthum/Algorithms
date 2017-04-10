package com.zarroc.multithreading.concurrency.threadlocal;

public class ThreadOne implements Runnable {

	private int i;
	private ThreadLocal<Integer> one = new ThreadLocal<Integer>();

	public ThreadOne() {
		one.set(0);
	}

	@Override
	public void run() {
		if (this.one.get() == null) {
			this.one.set(145);
		}
		System.out.println(i++);
		Integer val = one.get();
		Integer val1 = val;
		System.out.println(val++);
		System.out.println(val--);
		System.out.println(val1 == val);
	}

}
