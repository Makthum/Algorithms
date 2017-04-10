package com.zarroc.multithreading.concurrent;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadOne one = new ThreadOne();
		ThreadTwo two = new ThreadTwo();
		one.start();
		two.start();

	}

}
