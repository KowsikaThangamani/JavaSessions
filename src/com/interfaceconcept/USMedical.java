package com.interfaceconcept;

public interface USMedical extends WHO {

	//Interface variables are static and final by default
	int min_fee = 10;

	// method body not allowed --- abstract methods
	//only method declaration
	//only method prototype
	//cannot create object of interface
	//interface cannot have business logic
	//100% abstraction

	//Interface methods cannot be private, because private methods cannot be overridden and without overriding we cannot
		// write business logic

	public void physioServices();

	public void oncologyServices();

	public void pediaServices();

	public void emergencyServices();

	//After jdk 1.8 two major changes happened

	//1. Interface methods can be static with method body
	public static void billing() {
		System.out.println("USMedical --- Billing");
	}

	//2. We can have a default method with method body
	//we can override this method in child class, but we cannot use default keyword in classes and hence change it to public
	default void medicalInsurance() {
		System.out.println("USMedical --- Medical Insurance");
	}

}
