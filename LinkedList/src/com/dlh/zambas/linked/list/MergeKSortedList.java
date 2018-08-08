package com.dlh.zambas.linked.list;

import java.util.LinkedList;

public class MergeKSortedList {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(7);
		System.out.println(l1);
		System.out.println();
		Swap.swap(l1,2,2);

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(2);
		l2.add(4);
		l2.add(6);
		l2.add(8);

		LinkedList<Integer> l3 = new LinkedList<Integer>();
		l3.add(0);
		l3.add(9);
		l3.add(10);
		l3.add(11);

		LinkedList<Integer> arr[] = new LinkedList[3];
		arr[0] = l1;
		arr[1] = l2;
		arr[2] = l3;

		 LinkedList<Integer> l = merge(arr);
		 System.out.println(l);
	}

	private static Object Swap() {
		// TODO Auto-generated method stub
		return null;
	}

	private static LinkedList<Integer> merge(LinkedList<Integer>[] arr) {
		int high = arr.length - 1;
		while (high != 0) {
			int i = 0, j = high;
			while (i < j) {
				arr[i] = mergeSorted(arr[i], arr[j]);
				i++;
				j--;
			
				if(i>=j){
					high = j;
				}
			}
		}
		
		return arr[0];
	}

	private static LinkedList<Integer> mergeSorted(LinkedList<Integer> a, LinkedList<Integer> b) {
		if (null == a) {
			return b;
		}
		if (null == b) {
			return a;
		}
		LinkedList<Integer> res = new LinkedList<Integer>();
		int i = 0, j = 0;
		while (i < a.size() && j < b.size()) {
			if (a.get(i) <= b.get(j)) {
				res.add(a.get(i));
				i++;
			} else {
				res.add(b.get(j));
				j++;
			}
		}

		while (i < a.size()) {
			res.add(a.get(i));
			i++;
		}

		while (j < b.size()) {
			res.add(b.get(j));
			j++;
		}

		return res;
	}

}
