package com.learn.deep;

import com.learn.models.Address;
import com.learn.models.Person;

public class Shallow {

	public static void main(String[] args) {
		Address address1 = new Address("New York");
		Person person1 = new Person("John", address1);

		// Shallow Copy
		Person person2 = person1.shallowCopy();

		System.out.println("Before Modification:");
		System.out.println("Person1's city: " + person1.address.city);  // Output: New York
		System.out.println("Person2's city: " + person2.address.city);  // Output: New York

		// Modify the city in the copied object
		person2.address.city = "Los Angeles";

		System.out.println("\nAfter Modification:");
		System.out.println("Person1's city: " + person1.address.city);  // Output: Los Angeles (changed)
		System.out.println("Person2's city: " + person2.address.city);  // Output: Los Angeles (same reference)
	}
}
