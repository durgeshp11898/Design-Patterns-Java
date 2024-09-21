package com.abstractt.demo;

import com.abstractt.provider.FactoryProvider;
import com.abstractt.service.AbstractFactory;
import com.abstractt.service.Animal;
import com.abstractt.service.Color;

//Main class to demonstrate the Abstract Factory Pattern
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		// Get Animal Factory
		AbstractFactory<Animal> animalFactory = (AbstractFactory<Animal>) FactoryProvider.getFactory("Animal");
		Animal animal1 = animalFactory.create("Dog");
		System.out.println("Animal: " + animal1.getType() + ", Sound: " + animal1.makeSound());

		// Get Color Factory
		AbstractFactory<Color> colorFactory = (AbstractFactory<Color>) FactoryProvider.getFactory("Color");
		Color color1 = colorFactory.create("brown");
		System.out.println("Color: " + color1.getColor());
	}
}
