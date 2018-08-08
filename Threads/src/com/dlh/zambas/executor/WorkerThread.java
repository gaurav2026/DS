package com.dlh.zambas.executor;

public class WorkerThread implements Runnable{
	
	private String command;
	
	 public WorkerThread(String command) {
		 this.command = command;
	 }

	@Override
	public void run(){
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+ " is running **** " + command);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
