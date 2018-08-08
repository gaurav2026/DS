package com.non.repeating.string;

public class CountIndexTest {
	int count;
	int index;

	public CountIndexTest(int index) {
		this.index = index;
		this.count = 1;
	}

	public void incrementCount() {
		count++;
	}

	public CountIndexTest() {
	}

}
