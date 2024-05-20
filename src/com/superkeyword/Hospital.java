package com.superkeyword;

public class Hospital implements Medical {

	int min_fee = 50;

	public void treatment() {
		System.out.println(min_fee + Medical.min_fee);
	}

	@Override
	public void covid() {

		System.out.println("Hospital --- covid vaccination");
	}

}
