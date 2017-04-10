package com.zarroc.multithreading.util.concurrent.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorService {

	public static void main(String[] args) {
		ExecutorService e = Executors.newSingleThreadExecutor();
		ThreadOne one = new ThreadOne(5);
		for (int i = 0; i < 10; i++) {
			e.submit(one);
		}
		e.shutdown();
		
		
	}

}
