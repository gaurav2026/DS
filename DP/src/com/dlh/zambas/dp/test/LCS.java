package com.dlh.zambas.dp.test;

public class LCS {
	public static void main(String[] args) {
		System.out.println(lcs("ABCDGH", "AEDFHR"));
	}

	private static int lcs(String A, String B) {
		if (A.length() == 0 || B.length() == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int dp[][] = new int[A.length() + 1][B.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {
				if (A.charAt(i-1) == B.charAt(j-1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
				if(dp[i][j] > max){
					max = dp[i][j];
				}
			}
		}
		
		return max;
	}
}
