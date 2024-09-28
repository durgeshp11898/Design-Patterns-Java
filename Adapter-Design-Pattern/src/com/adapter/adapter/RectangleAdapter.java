package com.adapter.adapter;

import com.adapter.interfacee.GeometricShape;
import com.adapter.legacy.Rectangle;

//Adapter class that implements the target interface and uses the legacy Rectangle
public class RectangleAdapter implements GeometricShape {

	private Rectangle rectangle;

	public RectangleAdapter(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	// Convert the interface of Rectangle to GeometricShape
	@Override
	public void drawShape() {
		// Example conversion: Assume default width and height
		int width = 10;
		int height = 5;
		rectangle.draw(width, height);  // Call the legacy method
	}
}
