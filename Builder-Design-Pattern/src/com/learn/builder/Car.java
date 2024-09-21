package com.learn.builder;

public class Car {

	private final String make;      // required
	private final String model;     // required
	private final int year;         // required
	private final String color;     // optional
	private final String engineType; // optional

	private Car(CarBuilder builder) {
		this.make = builder.make;
		this.model = builder.model;
		this.year = builder.year;
		this.color = builder.color;
		this.engineType = builder.engineType;
	}

	public static class CarBuilder {
		private final String make;      // required
		private final String model;     // required
		private final int year;         // required
		private String color;           // optional
		private String engineType;      // optional

		public CarBuilder(String make, String model, int year) {
			this.make = make;
			this.model = model;
			this.year = year;
		}

		public CarBuilder color(String color) {
			this.color = color;
			return this;
		}

		public CarBuilder engineType(String engineType) {
			this.engineType = engineType;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}

	@Override
	public String toString() {
		return "Car{" +
				"make='" + make + '\'' +
				", model='" + model + '\'' +
				", year=" + year +
				", color='" + color + '\'' +
				", engineType='" + engineType + '\'' +
				'}';
	}
}
