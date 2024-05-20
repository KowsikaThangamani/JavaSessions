package com.encapsulation;

public class EmpTest {

	public static void main(String[] args) {

//		Employee e1 = new Employee();
//
//		e1.setName("Gaurav");
//		e1.setAge(32);
//		e1.setSalary(25.11);
//		e1.setActive(true);
//

		Employee e1 = new Employee("Gaurav", 32, 25.11, true);
		e1.dob = "07-09-1992";
		System.out.println(e1.getName() + " , " + e1.getAge() + " , " + e1.getSalary() + " , " + e1.isActive() + " , " + e1.dob);
		e1.setAge(30);
		e1.setSalary(30.11);
		System.out.println(e1.getName() + " , " + e1.getAge() + " , " + e1.getSalary() + " , " + e1.isActive() + " , " + e1.dob);

		System.out.println("********************************************************************************************************");

		Employee e2 = new Employee("shiva", 35, 45.11, true);
		System.out.println(e2.getName() + " , " + e2.getAge() + " , " + e2.getSalary() + " , " + e2.isActive() + " , " + e2.dob);
		e2.setAge(30);
		e2.setSalary(50.11);
		System.out.println(e2.getName() + " , " + e2.getAge() + " , " + e2.getSalary() + " , " + e2.isActive() + " , " + e2.dob);

	}

}
