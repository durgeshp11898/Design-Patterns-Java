package com.learn.eager;

public class EagerSingletonDemo {
	public static void main(String[] args) {
		// Get the single instance of the Singleton class
		EagerSingleton eagerInstance = EagerSingleton.getInstance();

		// Call a method on the instance
		eagerInstance.showMessage();
	}
}
