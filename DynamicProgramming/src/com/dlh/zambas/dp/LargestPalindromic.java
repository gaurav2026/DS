package com.dlh.zambas.dp;

public class LargestPalindromic {
	public static void main(String[] args) {
		largestPalindrome("geeksskeeg");
	}

	private static void largestPalindrome(String s) {
		if (null == s) {
			return;
		}

		String largestPalindrome = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			String palindrome = findPalindrome(s, i, i);
			if(palindrome.length() > largestPalindrome.length()){
				largestPalindrome = palindrome;
			}
			
			palindrome = findPalindrome(s, i, i+1);
			if(palindrome.length() > largestPalindrome.length()){
				largestPalindrome = palindrome;
			}
		}
		
		System.out.println(largestPalindrome);
	}

	private static String findPalindrome(String s, int left, int right) {
		if (left > right)
			return null;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}
}
