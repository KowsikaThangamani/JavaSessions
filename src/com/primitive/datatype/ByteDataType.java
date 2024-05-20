package com.primitive.datatype;

public class ByteDataType {

	/*
	 * size : 1 byte (8 bits)
	 * range : -128 to 127 (-2^7 to 2^7-1)
	 * usecases : Age
	 */

	public static void main (String[] args) {

		byte b = 10;
		/* If the range goes beyond the byte range it will throw error : Type mismatch : cannot convert from int to byte
		 * byte b1 = 128; byte b2 = -130;
		 */
		System.out.println(b);

	}

}
