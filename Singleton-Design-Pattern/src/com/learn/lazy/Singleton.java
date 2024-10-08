package com.learn.lazy;

public class Singleton {

	// Static variable to hold the single instance of the class
	private static  Singleton instance;

	// Private constructor to prevent instantiation
	private Singleton() {
		// Constructor logic here
	}

	// Public method to provide access to the instance
	public static Singleton getInstance() {
		if (instance == null) {
			// Synchronize only when the instance is null to avoid performance hit
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();  // Lazy initialization
				}
			}
		}
		return instance;
	}

	// Add some methods to demonstrate functionality
	public void showMessage() {
		System.out.println("Hello from Singleton!");
	}
}
