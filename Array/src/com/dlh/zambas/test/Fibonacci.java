package com.dlh.zambas.test;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 30;
        System.out.println("Non-neighbouring Fibonacci "
                           + " Representation of " + n + " is");
 
        printFibRepresntation(n);
	}

	private static void printFibRepresntation(int n) {
		while(n>0){
			int f = nearestFibNumber(n);
			System.out.print(f + " ");
			n = n-f;
		}
	}

	private static int nearestFibNumber(int n) {
		int f1 = 0;
		int f2 = 1;
		int f3 = 1;
		while(f3<=n){
			f1 = f2;
			f2 = f3;
			f3 = f1+f2;
		}
		return f2;
	}
}
