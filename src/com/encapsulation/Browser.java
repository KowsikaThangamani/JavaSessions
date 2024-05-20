package com.encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launch browser");
		checkBrowserVersion();
		checkOSCompatibility();
		checkRAMSpace();
		checkUpdatesAvailability();
		System.out.println("browser is launched");
	}

	private void checkBrowserVersion() {
		System.out.println("check browser version");
	}

	private void checkOSCompatibility() {
		System.out.println("Check OS compatibility");
	}

	private void checkRAMSpace() {
		System.out.println("check RAm space");
	}

	private void checkUpdatesAvailability() {
		System.out.println("checking for updates");
	}

}
