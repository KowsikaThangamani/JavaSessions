package com.interfaceconcept;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {

	@Override
	public void physioServices() {
		System.out.println("FH ---- phsio Services");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH ---- oncology Services");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH ---- Pediatric services");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH ---- Cardiology services");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH ---- Dental services");
	}

	@Override
	public void gynecServices() {
		System.out.println("FH ---- Gynec services");
	}

	@Override
	public void radiologyServices() {
		System.out.println("FH ---- Radiology services");
	}

	//FH --- Individual methods
	public void OPTServices() {
		System.out.println("FH ---- OPT services");
	}

	public void pathologyServices() {
		System.out.println("FH ---- Pathology services");
	}

	//Common method -- for all the interface
	@Override
	public void emergencyServices() {
		System.out.println("FH ---- emergencyServices");
	}

	//default method from USMedical overridden with public keyword
	@Override
	public void medicalInsurance() {
		System.out.println("FH ---- Medical Insurance");
	}

	//WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH --- covid Vaccination");
	}

}
