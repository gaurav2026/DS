package com.dlh.zambas.test;

public class ExceptionTest {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		try {
			f2();
		} catch (Exception e) {
			System.out.println("Catch f1");
		}finally{
			System.out.println("finally f1");
		}
	}

	private static void f2() {
		try {
			throw new IllegalMonitorStateException();
		} finally{
			System.out.println("finally f2");
		}
	}
}
