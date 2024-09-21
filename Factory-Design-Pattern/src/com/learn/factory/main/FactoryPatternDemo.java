package com.learn.factory.main;

import com.learn.factory.interfac.Shape;
import com.learn.factory.pattern.ShapeFactory;

//Test the Factory Pattern
public class FactoryPatternDemo {
 public static void main(String[] args) {
     ShapeFactory shapeFactory = new ShapeFactory();

     // Get a Circle object and call its draw method
     Shape shape1 = shapeFactory.getShape("CIRCLE");
     shape1.draw();

     // Get a Rectangle object and call its draw method
     Shape shape2 = shapeFactory.getShape("RECTANGLE");
     shape2.draw();

     // Get a Square object and call its draw method
     Shape shape3 = shapeFactory.getShape("SQUARE");
     shape3.draw();
 }
}
