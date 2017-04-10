package com.zarroc.multithreading.producerconsumer;

public class Tester {
	public static void main(String args[]) {
		SharedObject o = new SharedObject();
		Producer p = new Producer(o);
		Producer p1 = new Producer(o);
		Producer p2 = new Producer(o);
		Consumer c = new Consumer(o);
		Consumer c1 = new Consumer(o);
		p1.start();
		p.start();
		p2.start();
		c.start();
		c1.start();
	}

}
