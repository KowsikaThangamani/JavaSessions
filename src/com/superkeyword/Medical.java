package com.superkeyword;

public interface Medical {

	int min_fee = 10;

	public void covid();

	public static void testing() {
		System.out.println("Medical -- testing");
	}

	default void bloodTest() {
		System.out.println("Medical -- blood test");
	}

}
