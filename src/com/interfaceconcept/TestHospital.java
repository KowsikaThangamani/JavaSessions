package com.interfaceconcept;

public class TestHospital {

	public static void main(String[] args) {

		System.out.println(USMedical.min_fee);

		System.out.println("********************************************************************************");

		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.oncologyServices();
		fh.pediaServices();
		fh.cardioServices();
		fh.dentalServices();
		fh.gynecServices();
		fh.radiologyServices();
		fh.OPTServices();
		fh.pathologyServices();

		System.out.println("********************************************************************************");

		//Cannot instantiate an Interface
		//but Top casting is possible - Child class object can be referred by parent interface reference variable
		USMedical usm = new FortisHospital();
		usm.physioServices();
		usm.oncologyServices();
		usm.pediaServices();

		System.out.println("********************************************************************************");

		UKMedical ukm = new FortisHospital();
		ukm.cardioServices();
		ukm.dentalServices();

		System.out.println("********************************************************************************");

		IndianMedical im = new FortisHospital();
		im.gynecServices();
		im.radiologyServices();

//		DOWN CASTING IS NOT POSSIBLE AT COMPILE TIME ITSELF FOR INTERFACES SINCE INTERFACE CANT BE INSTANTIATED

//		FortisHospital fsh = new IndianMedical();Cannot instantiate the type IndianMedical

//		Explicit Casting : Interface to Interface reference
		UKMedical uk1 = (UKMedical) usm;
		uk1.cardioServices();
		uk1.dentalServices();
		uk1.emergencyServices();



	}

}
