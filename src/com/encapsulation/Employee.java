package com.encapsulation;

// Encapsulation means accessing a private data member via a public layer - so it doesnt mean only getter/setter, even constructor is \
// performing the encapsulation

public class Employee {

	private String name;
	private int age;
	private double salary;
	private boolean isActive;

	String dob;

//	We can also acheive the functionality of setter with a constructor we cannot update the values

	public Employee(String name, int age, double salary, boolean isActive) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
	}

//	Getter is for retreiving values
//	setter is for initialize, Set / updating the values
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
