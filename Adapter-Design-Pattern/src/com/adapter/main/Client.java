package com.adapter.main;

import com.adapter.adapter.RectangleAdapter;
import com.adapter.interfacee.GeometricShape;
import com.adapter.legacy.Rectangle;

public class Client {
	
    public static void main(String[] args) {
    	
        // Create a legacy rectangle
        Rectangle rectangle = new Rectangle();
        
        // Use an adapter to make it compatible with GeometricShape
        GeometricShape shape = new RectangleAdapter(rectangle);
        
        // Now the client can use the shape as a GeometricShape
        shape.drawShape();
    }
}
