package com.learn.main;

import com.learn.prototype.impl.ConcretePrototype;

public class Main {

	public static void main(String[] args) {

		try {

			ConcretePrototype prototype1 = new ConcretePrototype("Prototype1", 200);

			// Log the original object
			prototype1.log();

			// Clone the object
			ConcretePrototype clone1 = (ConcretePrototype) prototype1.clone();

			
			// Log the cloned object
			clone1.log();

			// Show the details
			System.out.println("Original: " + prototype1.hashCode());
			
			System.out.println("Clone: " + clone1.hashCode());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
