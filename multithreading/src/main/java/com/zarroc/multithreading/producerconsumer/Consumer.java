package com.zarroc.multithreading.producerconsumer;

public class Consumer extends Thread {

	private SharedObject o;

	public Consumer(SharedObject o) {
		super();
		this.o = o;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (o) {
				if (!o.isHasMessagge()) {
					try {
						o.wait();
					} catch (InterruptedException e) {
						// do nothing
					}
				}
				o.setHasMessagge(false);
				System.out.println(o.getMessage());
				o.notify();
			}
		}
	}
}
