package com.learn.models;

public class Person {

	public String name;
	public Address address;

	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	// Shallow Copy Method
	public Person shallowCopy() {
		return new Person(this.name, this.address);  // Address reference is copied
	}

	// Deep Copy Method
	public Person deepCopy() {
		return new Person(this.name, new Address(this.address.city));  // New Address object is created
	}
}
