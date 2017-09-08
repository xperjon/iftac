package se.xperjon.shapes.core;

public class Circle extends Shape {

	private int radius = 5;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public void draw() {
		System.out.println("A circle looks like this: \u25CB");
	}

}
