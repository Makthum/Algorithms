package com.zarroc.multithreading.producerconsumer;

public class Producer extends Thread {

	private SharedObject o;

	public Producer(SharedObject o) {
		super();
		this.o = o;
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
			synchronized (o) {
				if (o.isHasMessagge()) {
					try {
						o.wait();
					} catch (InterruptedException e) {
						// do nothing
					}
				}
				o.setHasMessagge(true);
				o.setMessage("Producer "+Thread.currentThread().getName() + " count :"+count++);
				o.notify();
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
