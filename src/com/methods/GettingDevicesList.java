package com.methods;

import java.util.ArrayList;

public class GettingDevicesList {

//	WAF : Function name : getDevicesList (name)
//	Input param : empName
//	return : ArrayList<String>

	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("Getting Devices List for Employee : " + empName);

		ArrayList<String> devicesList = new ArrayList<String>();

		switch (empName.trim().toLowerCase()) {
		case "pallavi" :
			devicesList.add("MacbookPro");
			devicesList.add("Macbook Air");
			devicesList.add("iPhone 14");
			break;
		case "sudheer" :
			devicesList.add("Lenovo");
			devicesList.add("samsung");
			break;
		case "saida" :
			devicesList.add("Airtel SIM");
			break;
		default :
			System.out.println("Employee name not found : " + empName);
			break;
		}

		return devicesList;
	}

	public ArrayList<String> getDevices(String empName) {
		System.out.println("Getting Devices List for Employee : " + empName);

		ArrayList<String> devicesList = new ArrayList<String>();

		switch (empName.trim().toLowerCase()) {
		case "pallavi" :
			devicesList.add("MacbookPro");
			devicesList.add("Macbook Air");
			devicesList.add("iPhone 14");
			return devicesList;
		case "sudheer" :
			devicesList.add("Lenovo");
			devicesList.add("samsung");
			return devicesList;
		case "saida" :
			devicesList.add("Airtel SIM");
			return devicesList;
		default :
			System.out.println("Employee name not found : " + empName);
			return devicesList;
		}

	}

	public static void main(String[] args) {

		GettingDevicesList obj = new GettingDevicesList();

		ArrayList<String> devicesList = obj.getDevices("pallavi");
		System.out.println(devicesList);
		System.out.println(devicesList.size());

	}

}
