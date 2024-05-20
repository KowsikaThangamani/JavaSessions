package com.primitive.datatype;

public class ShortDatatype {
	/*
	 * size : 2 bytes (16 bits)
	 * range : -32768 to 32767 (-2^15 to 2^15-1)
	 */
	public static void main(String[] args) {

		short s = 12345;
		/* Type mismatch : cannot convert from int to short
		 * short s1 = -43567; short s2 = 43567;
		 */

		System.out.println(s);
	}

}
