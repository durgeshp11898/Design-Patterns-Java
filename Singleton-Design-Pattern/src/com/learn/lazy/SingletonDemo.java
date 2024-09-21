package com.learn.lazy;

public class SingletonDemo {
	public static void main(String[] args) {
		// Get the single instance of the Singleton class
		Singleton singletonInstance = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println("Hashcode:"+singletonInstance.hashCode());
		System.out.println("Hashcode:"+s2.hashCode());
		// Call a method on the instance
		singletonInstance.showMessage();
	}
}
