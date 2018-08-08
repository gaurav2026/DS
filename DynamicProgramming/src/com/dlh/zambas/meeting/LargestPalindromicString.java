package com.dlh.zambas.meeting;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LargestPalindromicString {
	public static void main(String[] args) {
		String s = "forgeeksskeegfor";
		Stack<Character> str = new Stack<Character>();
		for (int i = 0; i < s.length(); i++)
			str.push(s.charAt(i));

		Stack<Character> revereStr = new Stack<Character>();
		for (int i = s.length() - 1; i >= 0; i--)
			revereStr.push(s.charAt(i));
		findLargestPalindrome(str, revereStr);
	}

	private static void findLargestPalindrome(Stack<Character> str, Stack<Character> revereStr) {
		StringBuilder s = new StringBuilder();
		List<String> list = new ArrayList<String>();
		while (!str.isEmpty() && !revereStr.isEmpty()) {
			if (str.peek() == revereStr.peek()) {
				s.append(str.pop());
			} else {
				if (s.length() > 0) {
					list.add(s.toString());
					s = new StringBuilder();
				}
				str.pop();
			}
			revereStr.pop();
		}
		String maxString = null;
		if (list.size() > 0) {
			maxString = list.get(0);
			for (String finalString : list) {
				if (maxString.length() < finalString.length()) {
					maxString = finalString;
				}
			}
		}

		System.out.println(maxString);
	}
}
