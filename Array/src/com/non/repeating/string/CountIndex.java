package com.non.repeating.string;

public class CountIndex {
	int count, index;

	// constructor for first occurrence
	public CountIndex(int index) {
		this.count = 1;
		this.index = index;
	}

	// method for updating count
	public void incCount() {
		this.count++;
	}
}
