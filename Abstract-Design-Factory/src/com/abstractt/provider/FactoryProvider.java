package com.abstractt.provider;

import com.abstractt.factory.AnimalFactory;
import com.abstractt.factory.ColorFactory;
import com.abstractt.service.AbstractFactory;

//Factory Provider
public class FactoryProvider {

	public static AbstractFactory<?> getFactory(String choice) {

		if ("Animal".equalsIgnoreCase(choice)) {

			return new AnimalFactory();
			
		} else if ("Color".equalsIgnoreCase(choice)) {

			return new ColorFactory();
		}

		return null;
	}
}