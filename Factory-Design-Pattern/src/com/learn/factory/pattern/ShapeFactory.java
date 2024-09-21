package com.learn.factory.pattern;

import com.learn.factory.Circle;
import com.learn.factory.Rectangle;
import com.learn.factory.Square;
import com.learn.factory.interfac.Shape;

//Factory Class
public class ShapeFactory {
	// Method to get shape object based on the input
	public Shape getShape(String shapeType) {
		
		if (shapeType == null) {
			return null;
		}
		
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
			
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
			
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
			
		}
		return null;
	}
}
