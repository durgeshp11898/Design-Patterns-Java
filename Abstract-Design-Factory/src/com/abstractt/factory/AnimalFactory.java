package com.abstractt.factory;

import com.abstractt.models.Cat;
import com.abstractt.models.Dog;
import com.abstractt.service.AbstractFactory;
import com.abstractt.service.Animal;

//Animal Factory
public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String animalType) {

		if ("Dog".equalsIgnoreCase(animalType)) {

			return new Dog();
		} else if ("Cat".equalsIgnoreCase(animalType)) {

			return new Cat();
		}

		return null;
	}

}