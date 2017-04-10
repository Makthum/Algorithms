package com.zarroc.multithreading.concurrenttwo;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {
			ThreadOne one = new ThreadOne(i);
			ThreadTwo two = new ThreadTwo(i + 50);
			one.start();
			two.start();
		}
	}

}
