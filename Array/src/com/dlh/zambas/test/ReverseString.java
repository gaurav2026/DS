package com.dlh.zambas.test;

public class ReverseString {
	public static void main(String[] args) {
		String s1 = "Welcome to geeksforgeeks";
		// System.out.println(reverseWords(s1));
		System.out.println(reverseWordsWithoutSpace(s1));

		String s2 = "I love Java Programming";
		System.out.println(reverseWordsWithoutSpace(s2));
		
		int arr[] = {1,2,3,4,5,6};
		int a[] = reverse(arr, 0, arr.length-1);
		System.out.println();
		for(int i :a){
			System.out.print(i+" ");
		}
	}

	private static String reverseWordsWithoutSpace(String s1) {
		String finalString = "";
		for (int i = 0; i < s1.length();) {
			String str = "";
			int j = i;
			while (j < s1.length() && s1.charAt(j) != ' ') {
				str = str + s1.charAt(j);
				j++;
			}
			i = j + 1;
			finalString = " " + str + finalString;
		}

		return finalString;
	}

	private static String reverseWords(String s1) {
		String str = "";
		String temp[] = s1.split(" ");
		for (int i = 0; i < temp.length; i++) {
			temp[i] = reverse(temp[i]);
			if (i == temp.length - 1) {
				str = temp[i] + str;
			} else {
				str = " " + temp[i] + str;
			}

		}
		return str;
	}

	private static String reverse(String s) {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i) + temp;
		}
		return temp;
	}

	private static int[] reverse(int[] arr, int low, int high) {
		if (low > high) {
			return null;
		}
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;

		reverse(arr, low + 1, high - 1);
		return arr;

	}

}
