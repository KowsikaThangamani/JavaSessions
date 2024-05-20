package com.primitive.datatype;

public class FloatDataType {

	//size : 4 bytes (32 bits)
	//range : no range while declaring, but while printing it will give you only 6 digits after decimal

	public static void main(String[] args) {

		//Type mismatch : cannot convert from double to float

		float f = 10.33f;
		float f1 = 10.1234567890f;
		System.out.println(f);
		System.out.println(f1);

		float f2 = (float)11.33;
		System.out.println(f2);

	}

}
