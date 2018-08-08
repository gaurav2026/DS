package com.dlh.zambas.cyclicbarrier;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Party implements Runnable {

	private CyclicBarrier cyclicBarrier;
	private List<Integer> list = null;
	private Sum sum = null;
	private int totalSum = 0;

	public Party(CyclicBarrier cyclicBarrier, List<Integer> list) {
		this.cyclicBarrier = cyclicBarrier;
		this.list = list;
	}

	public Party() {
	}

	@Override
	public void run() {
		try {
			sum = new Sum();
			Thread.sleep(1000);
			String name = Thread.currentThread().getName();
			switch (name) {
			case "PartyA":
				System.out.println(Thread.currentThread().getName());
				list.add(sum.partyA());
				break;
			case "PartyB":
				System.out.println(Thread.currentThread().getName());
				list.add(sum.partyB());
				break;
			case "PartyC":
				System.out.println(Thread.currentThread().getName());
				list.add(sum.partyC());
				break;
			case "PartyD":
				System.out.println(Thread.currentThread().getName());
				list.add(sum.partyD());
				break;
			default:
				break;
			}
			System.out.println(name + " is calling await() " + list);
			cyclicBarrier.await();
			if(name.equalsIgnoreCase("PartyA"))
				returnList(list);
			System.out.println(name + " is calling await() ");
			cyclicBarrier.await();
			System.out.println("threads executing again");
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	private void returnList(List<Integer> list) {
		for(Integer i : list){
			totalSum +=i;
		}
		System.out.println(totalSum);
	}

}
