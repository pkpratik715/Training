package com.reformix.junit;

public class MyMath {
	
	public static void main(String[] args) {
		//System.out.println(MyMath.sum());
	}

	 int sum(int[] numbers) {

		int sum = 0;
		for (int i : numbers) {
			sum = sum + i;
		}
		return sum;
	}

}
