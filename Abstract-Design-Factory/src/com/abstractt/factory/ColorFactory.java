package com.abstractt.factory;

import com.abstractt.models.Brown;
import com.abstractt.models.White;
import com.abstractt.service.AbstractFactory;
import com.abstractt.service.Color;

//Color Factory
public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String colorType) {

		if ("Brown".equalsIgnoreCase(colorType)) {

			return new Brown();
		} else if ("White".equalsIgnoreCase(colorType)) {

			return new White();
		}

		return null;
	}
}