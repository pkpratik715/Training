package com.reformix.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyMathTest {
	
	MyMath myMath = new MyMath();

	@Test
	public void testFor3Nums() {
		int sum = myMath.sum(new int[] {1,2,3});
		System.out.println(sum);
		assertEquals(6, sum);

	}
	@Test
	public void testFor1Num() {
		int sum = myMath.sum(new int [] {2});
		System.out.println(sum);
		assertEquals(6, sum);
	}

}