package com.dlh.zambas.threads;

public class Producer implements Runnable {

	private Message message;

	public Producer(Message message) {
		this.message = message;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			synchronized (message) {
				message.wait();
				System.out.println(Thread.currentThread().getName() + " is waiting ");
			}
			System.out.println(Thread.currentThread().getName() + "  has been notified");
			System.out.println(Thread.currentThread().getName() + " has processed " + message.getMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
