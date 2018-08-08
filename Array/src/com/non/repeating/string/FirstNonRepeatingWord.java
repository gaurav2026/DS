package com.non.repeating.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingWord {
	Map<String, CountIndex> map = new HashMap<String, CountIndex>();

	public static void main(String[] args) {
		String arr[] = { "g", "e", "e", "k", "s", "f", "o", "r", "g", "e", "e", "k","s" };
		int index = new FirstNonRepeatingWord().firstNonRepeatingWord(arr);
		System.out.println(arr[index]);
	}

	private int firstNonRepeatingWord(String[] arr) {
		getCountOfWords(arr);
		int result = Integer.MAX_VALUE;
		for (String word : arr) {
			if (map.get(word).count == 1 && result > map.get(word).index) {
				result = map.get(word).index;
			}
		}
		return result;
	}

	private void getCountOfWords(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.get(arr[i]).incCount();
			} else {
				map.put(arr[i], new CountIndex(i));
			}
		}
	}

}
