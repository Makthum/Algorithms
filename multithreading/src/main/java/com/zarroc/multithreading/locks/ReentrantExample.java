package com.zarroc.multithreading.locks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

	public static void main(String args[]) {
		ReentrantLock lock = new ReentrantLock();
		One one = new One(lock);
		Two two = new Two(lock);
		Thread t = new Thread(one);
		Thread t2 = new Thread(two);
		t.start();
		t2.start();
	}
}

class One implements Runnable {

	ReentrantLock lock;

	public One(ReentrantLock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Waiting for lock to be released");
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + "lock Acquired");
			Thread.sleep(1);
			run2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println(Thread.currentThread().getName() + "lock released");
			lock.unlock();

		}

	}

	public void run2() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + "No of Lock held " + lock.getHoldCount());
		} finally {
			System.out.println(Thread.currentThread().getName() + "lock released");
			lock.unlock();

		}
	}
}

class Two implements Runnable {
	ReentrantLock lock;

	public Two(ReentrantLock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "Waiting for lock to be released");
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + "lock Acquired");
		} finally {
			System.out.println(Thread.currentThread().getName() + "lock released");
			lock.unlock();
		}
	}

}