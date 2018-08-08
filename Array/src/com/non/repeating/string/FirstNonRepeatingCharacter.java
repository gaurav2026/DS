package com.non.repeating.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	static Map<Character, CountIndexTest> map = new HashMap<Character, CountIndexTest>();

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		int index = firstNonRepeating(str);

		System.out.println(index == Integer.MAX_VALUE ? "Either all characters are repeating " + " or string is empty"
				: "First non-repeating character is " + str.charAt(index));
	}

	private static int firstNonRepeating(String str) {
		getFirstNonRepeatingIndex(str);
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (map.get(temp).count == 1 && result > map.get(temp).index) {
				result = map.get(temp).index;
			}
		}

		return result;
	}

	private static void getFirstNonRepeatingIndex(String str) {
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (map.containsKey(temp)) {
				map.get(temp).incrementCount();
			} else {
				map.put(temp, new CountIndexTest(i));
			}
		}
	}
}
