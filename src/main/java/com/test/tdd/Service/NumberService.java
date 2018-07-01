package com.test.tdd.Service;

import com.test.tdd.Exception.ListNullException;

public class NumberService {

	public int biggestNumber(int[] liste) {
		if (liste == null)
			throw new ListNullException("liste ne peut pas etre null");
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < liste.length; i++) {
			if (liste[i] > max)
				max = liste[i];
		}
		return max;
	}

	public static void main(String args[]) {
		int[] tab = new int[] { -1, 98, 38, 373, -98, 298 };
		NumberService n = new NumberService();
		int i = n.biggestNumber(tab);
		System.out.println(i);
	}

}
