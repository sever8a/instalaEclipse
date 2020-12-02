package com.curva;

public class Circle extends Figure {
	private double radius;

	private static final double PI = 3.1415;

	public Circle(double r, String name) {

		super(name);

		radius = r;

	}

	public String toString() {

		return "Soy un círculo de radio " + radius;

	}

	public double calculateArea() {

		return PI * radius * radius;

	}

	@Override
	public double calculatePerimeter() {
		return 2 * PI * radius;
	}

}
