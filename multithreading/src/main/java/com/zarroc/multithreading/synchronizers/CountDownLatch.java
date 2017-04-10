package com.zarroc.multithreading.synchronizers;

public class CountDownLatch {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String args[]) throws InterruptedException {
		java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(3);
		CountDownLatchTask thread = new CountDownLatchTask(latch);
		for (int i = 0; i < 3; i++) {
			Thread t = new Thread(thread);
			t.start();
			latch.countDown();
		}
	}

}

class CountDownLatchTask implements Runnable {

	java.util.concurrent.CountDownLatch latch;

	public CountDownLatchTask(java.util.concurrent.CountDownLatch latch) {
		super();
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Starting Thread parallely" + System.currentTimeMillis());
	}

}
