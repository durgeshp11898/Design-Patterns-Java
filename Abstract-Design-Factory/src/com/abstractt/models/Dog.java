package com.abstractt.models;

import com.abstractt.service.Animal;

//Concrete class: Dog
public class Dog implements Animal {

	@Override
	public String getType() {
		return "Dog";

	}

	@Override
	public String makeSound() {
		return "Bark";

	}

}