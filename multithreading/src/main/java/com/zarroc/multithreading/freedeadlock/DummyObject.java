package com.zarroc.multithreading.freedeadlock;

public class DummyObject {

	private int number;

	public int getNumber() {
		return number++;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
