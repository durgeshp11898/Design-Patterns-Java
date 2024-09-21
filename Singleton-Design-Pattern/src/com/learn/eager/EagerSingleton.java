package com.learn.eager;

public class EagerSingleton {

    // Static variable to hold the single instance of the class
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {
        // Constructor logic here
    }

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }

    // Add some methods to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }
}
