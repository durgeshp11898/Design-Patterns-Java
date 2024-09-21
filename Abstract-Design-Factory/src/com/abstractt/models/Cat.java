package com.abstractt.models;

import com.abstractt.service.Animal;

//Concrete class: Cat
public class Cat implements Animal {

	@Override
	public String getType() {
		return "Cat";
	}

	@Override
	public String makeSound() {
		return "Meow";
	}

}