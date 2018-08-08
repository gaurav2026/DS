package com.dlh.zambas.dp;

public class EggProblem {
	public static void main(String[] args) {
		int floor = 100;
		int eggs = 2;
		
		System.out.println(calculate(eggs,floor));
	}

	private static int calculate(int eggs, int floor) {
		if(floor ==0 && floor==1)
			return floor;
		int T[][] = new int[eggs+1][floor+1];
		
		for(int i=0;i<=floor;i++){
			T[1][i] = i;
		}
		
		int res = 0;
		
		for(int e=2;e<=eggs;e++){
			for(int f=2;f<=floor;f++){
				T[e][f] = Integer.MAX_VALUE;
				for(int k=1;k<=f;k++){
					res = 1+ Math.max(T[e][f-k], T[e-1][k-1]);
					if(res < T[e][f]){
						T[e][f] = res;
					}
				}
			}
		}
		return T[eggs][floor];
		
	}
}
