package com.zarroc.multithreading.concurrency.threadlocal;

public class Tester {

	public static void main(String args[]) {
		ThreadOne one = new ThreadOne();
		Thread a = new Thread(one);
		Thread b = new Thread(one);
		Thread c = new Thread(one);
		a.start();
		b.start();
		c.start();
	}

}
