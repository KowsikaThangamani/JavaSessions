package com.inheritance;

public class Audi extends Car {

	public void theftSafety() {
		System.out.println("Audi --- theft safety");
	}

	@Override
	public void engine() {
		System.out.println("Audi --- engine");
	}

	public void autoParking () {
		BMW b = new BMW();
		b.autoParking();//The process of calling/accessing a sibling class method is called COMPOSITION
		System.out.println("BMW ---- auto parking");
	}

}
