package com.dlh.zambas.dp;

public class CountDecoding {
	public static void main(String[] args) {
		char digits[] = { '1', '2', '3', '4' };
		int n = digits.length;
		String r = "2611055971756562";
		System.out.println("Count is " + recursiveCountDecoding(digits, n));
		System.out.println("Count is " + dynamicCountDecoding(r, r.length()));
	}

	private static int recursiveCountDecoding(char[] digits, int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		int count = 0;

		if (digits[n - 1] > '0') {
			count = recursiveCountDecoding(digits, n - 1);
		}

		if (digits[n - 2] == '1' || (digits[n - 2] == '2' && digits[n - 1] < '7')) {
			count += recursiveCountDecoding(digits, n - 2);
		}
		return count;
	}

	private static int dynamicCountDecoding(String str, int n) {
		char[] digits = str.toCharArray();
		if (n == 0)
			return 0;
		
		if (n == 1 && digits[0] == '0')
			return 0;

		if (n == 1 && digits[0] == '1')
			return 1;
		
		int count[] = new int[n + 1];
		count[0] = 1;
		count[1] = 1;

		for (int i = 2; i <= n; i++) {
			count[i] = 0;
			if (digits[i - 1] > '0') {
				count[i] = count[i - 1];
			}

			if (digits[i - 2] == '1' || (digits[i - 2] == '2' && digits[i - 1] < '7')) {
				count[i] += count[i - 2];
			}
		}

		return count[n];
	}
}
