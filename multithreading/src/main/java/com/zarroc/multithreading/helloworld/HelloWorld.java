package com.zarroc.multithreading.helloworld;

public class HelloWorld implements Runnable {

	public void run() {
		System.out.println("Hello World");

	}

	public static void main(String args[]) {
		HelloWorld h = new HelloWorld();
		Thread t = new Thread(h);
		t.start();
	}

}
