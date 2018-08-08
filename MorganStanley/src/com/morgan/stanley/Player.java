package com.morgan.stanley;

import java.util.HashMap;
import java.util.Map;

public class Player {
	public static void main(String[] args) {
		//int a[] = { 3, 2, 1 };
		//int b[] = { 3, 1, 2 };
		int yenPreference[] = { 3, 1, 2 };
		int kevinPreference[] = { 3, 2, 1 };
		// output :- KYY
		String s = new Player().simulate(a, b);
		System.out.println(s);
	}

	public String simulate(int[] yenPreference, int[] kevinPreference) {
		if (null == yenPreference || null == kevinPreference) {
			throw new NullPointerException();
		}
		if (yenPreference.length != kevinPreference.length) {
			throw new IllegalArgumentException("Length of both arrays should be equal");
		}
		StringBuilder sb = new StringBuilder();
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int yenCounter = 0;
		int kevinCounter = 0;

		for (int i = 1; i <= yenPreference.length; i++) {
			map.put(i, true);
			sb.append("i");
		}
		/**
		 * YEN should get first preference
		 */
		for (int i = 1; i <= map.size(); i++) {
			if (i % 2 != 0) {
				while (yenCounter >= 0 && yenCounter != yenPreference.length) {
					int yenTemp = yenPreference[yenCounter];
					if (map.get(yenTemp).booleanValue()) {
						sb.setCharAt(yenTemp - 1, 'Y');
						map.put(yenTemp, false);
						yenCounter++;
						break;
					}
					yenCounter++;
				}
			} else {
				while (kevinCounter >= 0 && kevinCounter != kevinPreference.length) {
					int kevinTemp = kevinPreference[kevinCounter];
					if (map.get(kevinTemp).booleanValue()) {
						sb.setCharAt(kevinTemp - 1, 'K');
						map.put(kevinTemp, false);
						kevinCounter++;
						break;
					}
					kevinCounter++;
				}

			}
		}

		return sb.toString();
	}

}
