package com.zarroc.multithreading.concurrentthree;

public class DummyObject {

	private int number;

	public int getNumber() {
		return number++;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
