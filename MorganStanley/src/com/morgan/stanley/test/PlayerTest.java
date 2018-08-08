package com.morgan.stanley.test;

import org.junit.Before;
import org.junit.Test;

import com.morgan.stanley.Player;

import junit.framework.Assert;

public class PlayerTest {
	Player player;

	@Before
	public void setUp() {
		player = new Player();
	}

	@Test(expected = NullPointerException.class)
	public void checkEmptyString() {
		int a[] = { 3, 2, 1 };
		// int b[] = { 3, 1, 2 };
		Assert.assertEquals("KYY", player.simulate(a, null));
	}

	@Test(expected = IllegalArgumentException.class)
	public void equalLengthInput() {
		int a[] = { 3, 2, 1, 4 };
		int b[] = { 3, 1, 2 };
		Assert.assertEquals("KYY", player.simulate(a, b));
	}

	@Test
	public void checkResult() {
		int a[] = { 3, 2, 1, };
		int b[] = { 3, 1, 2 };
		Assert.assertEquals("KYY", player.simulate(a, b));
	}
}
