package com.zarroc.multithreading.concurrent.sync;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DummyObject o = new DummyObject();
		for (int i = 0; i < 50; i++) {
			ThreadOne one = new ThreadOne(o);
			ThreadTwo two = new ThreadTwo(
					o);
			one.start();
			two.start();
		}
	}

}
