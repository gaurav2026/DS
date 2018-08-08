package com.dlh.zambas.dp;

public class LCS {
	public static void main(String[] args) {
		System.out.println(lcs("ABCDGH","AEDFHR"));
	}
	
	private static int lcs(String a, String b) {
		if (a.length() == 0 || b.length() == 0)
			return 0;

		int max = 0;
		int dp[][] = new int[a.length() + 1][b.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
				if(dp[i][j]>max){
					max = dp[i][j];
				}
			}
		}

		return max;

	}
}
