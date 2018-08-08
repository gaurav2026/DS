package com.dlh.zambas.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThreadMain {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable r = new WorkerThread(String.valueOf(i));
			executorService.execute(r);
		}

		executorService.shutdown();
		while (!executorService.isTerminated()) {
		}

		System.out.println("finished");
	}
}
