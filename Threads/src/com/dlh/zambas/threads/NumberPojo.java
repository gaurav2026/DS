package com.dlh.zambas.threads;

import java.util.ArrayList;

public class NumberPojo {

	private static ArrayList<Integer> list = null;

	public static ArrayList<Integer> getList() {
		return list;
	}

	public static void setList(ArrayList<Integer> list) {
		NumberPojo.list = list;
	}

}
