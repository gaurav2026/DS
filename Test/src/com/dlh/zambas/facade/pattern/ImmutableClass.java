package com.dlh.zambas.facade.pattern;

public final class ImmutableClass {

	private final int id;
	private final String[] address;

	public ImmutableClass(int id, String[] address) {
		this.id = id;
		//this.address = address;
		this.address = address.clone();
	}

	public int getId() {
		return id;
	}

	public String[] getAddress() {
		return address;
	}

	public static void main(String[] args) {
		String arr[] = { "a", "b" };
		ImmutableClass im = new ImmutableClass(1, arr);
		System.out.println(im.getId() + " " + im.getAddress()[0] + " " + im.getAddress()[1]);

		arr[0] = "d";
		arr[1] = "c";
		//im = new ImmutableClass(5, arr);
		System.out.println(im.getId() + " " + im.getAddress()[0] + " " + im.getAddress()[1]);

		String arr1[] = { "a", "b" };
		ImmutableClass im1 = new ImmutableClass(2, arr1);
		System.out.println(im1.getId() + " " + im1.getAddress()[0] + " " + im.getAddress()[1]);
	}
}
