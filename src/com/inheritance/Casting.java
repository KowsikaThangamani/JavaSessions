package com.inheritance;

public class Casting {

	public static void main(String[] args) {

// 1. TOP CASTING : CHILD CLASS OBJECT REFERRED BY PARENT CLASS REFERENCE VARIABLE:

//		through top casting we will be able to access parent class methods and parent class methods if it is overridden in child
//		class it will give preference to the overridden method. this is achieved through a concept called "Reference Type Check"
		Car ch = new BMW();
		ch.start();
		ch.stop();
		ch.refuel();
		ch.billing();
		ch.engine();
		ch.carShow();
		Car.carDisplay();

//		CHILD CLASS OBJECT REFERRED BY GRAND PARENT CLASS REFERENCE VARIABLE:
		Vehicle vh = new BMW();
		vh.billing();
		vh.engine();


//	2. DOWN CASTING : PARENT CLASS OBJECT REFERRED BY CHILD CLASS REFERENCE VARIABLE
		BMW h = (BMW)new Car();
		h.autoParking(); // CLASS CAST EXCEPTION




	}

}
