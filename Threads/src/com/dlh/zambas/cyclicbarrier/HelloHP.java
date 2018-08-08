package com.dlh.zambas.cyclicbarrier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class HelloHP {

	public static void main(String[] args) throws InterruptedException {
		Party p = new Party();

		List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4);

		Runnable rA = new Party(cyclicBarrier, list);
		Thread tA = new Thread(rA, "PartyA");

		Runnable rB = new Party(cyclicBarrier, list);
		Thread tB = new Thread(rB, "PartyB");

		Runnable rC = new Party(cyclicBarrier, list);
		Thread tC = new Thread(rC, "PartyC");

		Runnable rD = new Party(cyclicBarrier, list);
		Thread tD = new Thread(rD, "PartyD");

		tA.start();
		tB.start();
		tC.start();
		tD.start();

	}
}
