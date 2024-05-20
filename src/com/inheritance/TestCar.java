package com.inheritance;

public class TestCar {

	public static void main(String[] args) {

		Car.carDisplay();
		Car.carDisplay();

		System.out.println(Car.price);
		System.out.println(Car.price);

		System.out.println("************************************");

		BMW b = new BMW();
		b.start();//overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();//inherited from grandparent
		b.billing();
		System.out.println(b.maxSpeed);

		System.out.println(b.minSpeed);
		System.out.println("************************************");

		Car c = new Car();
		c.start();//individual
		c.stop();//individual
		c.refuel();//individual
		c.engine();//inherited from parent
//		c.aut ------------> parent cannot inherit from child

		System.out.println("************************************");

		Audi au = new Audi();
		au.start();//inherited
		au.stop();//inherited
		au.refuel();//inherited
		au.theftSafety();//individual
		au.engine();//overridden from grandparent
		au.billing();
		System.out.println(au.maxSpeed);

		System.out.println("************************************");

		Truck tu = new Truck();
		tu.engine();//inherited
		tu.heavyLoading();//Individual


	}

}
