package com.zarroc.multithreading.util.concurrent.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

	public static void main(String[] args) {
		Executor e = Executors.newSingleThreadExecutor();
		ThreadOne one = new ThreadOne(5);
		for (int i = 0; i < 10; i++)
			e.execute(one);

	}

}
