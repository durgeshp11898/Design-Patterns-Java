package com.learn.main;

import com.learn.builder.Car;

public class Main {
	
    public static void main(String[] args) {
    	
        Car car1 = new Car.CarBuilder("Toyota", "Camry", 2021)
                .color("Red")
                .engineType("Hybrid")
                .build();

        Car car2 = new Car.CarBuilder("Honda", "Civic", 2020)
                .color("Blue")
                .build();
        

        System.out.println(car1);
        System.out.println(car2);
    }
}
