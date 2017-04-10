package com.zarroc.multithreading.concurrency.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tester {

	public static void main(String args[]) throws InterruptedException, ExecutionException {
		CountDownTask task = new CountDownTask();
		ExecutorService exec = Executors.newSingleThreadExecutor();
		Future<?> f =exec.submit(task);
		System.out.println(f.get());
		exec.shutdown();
	}

}
