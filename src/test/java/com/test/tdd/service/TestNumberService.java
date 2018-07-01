package com.test.tdd.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.tdd.Exception.ListNullException;
import com.test.tdd.Service.NumberService;

public class TestNumberService {

	@Test
	public void ListeSimple() {
		int[] list = new int[] { 7, 8, 9 };
		NumberService numberService = new NumberService();
		int biggest = numberService.biggestNumber(list);
		assertEquals(9, biggest);

	}

	@Test
	public void ListeNegative() {
		int[] list = new int[] { -7, -8, -9 };
		NumberService numberService = new NumberService();
		int biggest = numberService.biggestNumber(list);
		assertEquals(-7, biggest);

	}

	@Test
	public void ListeUnElement() {
		int[] list = new int[] { 2 };
		NumberService numberService = new NumberService();
		int biggest = numberService.biggestNumber(list);
		assertEquals(2, biggest);

	}

	@Test(expected = ListNullException.class)
	public void Listenull() {
		NumberService numberService = new NumberService();
		@SuppressWarnings("unused")
		int biggest = numberService.biggestNumber(null);
	}

}
