package com.zarroc.multithreading.util.concurrent.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecutor {

	public static void main(String[] args) {
		Executor e = Executors.newFixedThreadPool(2);
		ThreadOne one = new ThreadOne(5);
		for (int i = 0; i < 10; i++)
			e.execute(one);

	}

}
