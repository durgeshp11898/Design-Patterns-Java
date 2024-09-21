package com.learn.factory;

import com.learn.factory.interfac.Shape;

//Concrete class: Rectangle
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}