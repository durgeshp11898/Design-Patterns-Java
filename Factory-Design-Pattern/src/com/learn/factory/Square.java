package com.learn.factory;

import com.learn.factory.interfac.Shape;

//Concrete class: Square
public class Square implements Shape {
	
	@Override
	public void draw() {
		
		System.out.println("Drawing a Square");
	}
}