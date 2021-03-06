package com.dlh.zambas.dp.test;

public class EditDistance {
	public static void main(String[] args) {
		String str1 = "sunday";
		String str2 = "saturday";
		System.out.println(editDistDP(str1, str2, str1.length(), str2.length()));
	}

	private static int editDistDP(String A, String B, int m, int n) {
		int dp[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0) {
					dp[i][j] = j;
				}

				else if (j == 0) {
					dp[i][j] = i;
				}

				else if (A.charAt(i - 1) == B.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				}

				else {
					dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
				}
			}
		}
		return dp[m][n];
	}
}
