package com.zarroc.multithreading.synchronizers;

import java.util.concurrent.BrokenBarrierException;

public class CyclicBarrier {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String args[]) throws InterruptedException {
		java.util.concurrent.CyclicBarrier latch = new java.util.concurrent.CyclicBarrier(3, new Runnable() {

			@Override
			public void run() {
				System.out.println("Barrier action called from Thread " + Thread.currentThread().getName());

			}
		});
		Task thread = new Task(latch);
		for (int i = 0; i < 3; i++) {
			Thread t = new Thread(thread);
			t.start();
		}
	}

}

class Task implements Runnable {

	java.util.concurrent.CyclicBarrier latch;

	public Task(java.util.concurrent.CyclicBarrier latch) {
		super();
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			System.out.println("Thread started with name " + Thread.currentThread().getName());
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Starting Thread parallely" + System.currentTimeMillis());
	}

}
