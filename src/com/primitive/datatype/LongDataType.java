package com.primitive.datatype;

public class LongDataType {

	/*
	 * size : 8 bytes (64 bits) range : -2^63 to 2^63-1
	 */

	public static void main (String[] args) {
		//if the data we are storing is within int range
		long l = 2147483647;

		// if the data we are storing is crossing the int range
		long l1 = 2147483648L;
		long l2 = 21234345656787890l;

		System.out.println(l + " " + l1 + " " + l2);

	}
}
