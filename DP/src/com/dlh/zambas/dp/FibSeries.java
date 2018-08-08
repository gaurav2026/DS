package com.dlh.zambas.dp;

public class FibSeries {
	
	private int fib(int n){
		int f[] = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		for(int i=2;i<=n;i++){
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
	
	public static void main(String[] args) {
		System.out.println(new FibSeries().fib(5));
	}

}