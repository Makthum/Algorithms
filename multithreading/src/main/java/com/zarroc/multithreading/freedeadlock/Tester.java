package com.zarroc.multithreading.freedeadlock;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DummyObject o = new DummyObject();
		DummyObject p = new DummyObject();
		ThreadOne one = new ThreadOne(o, p);
		ThreadTwo two = new ThreadTwo(o, p);
		one.start();
		two.start();

	}

}
