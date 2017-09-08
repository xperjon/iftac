package se.xperjon.shapes.core;

public class Triangle extends WidthHeightShape{

	public Triangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		return width * height / 2.0;
	}


	@Override
	public void draw() {
		System.out.println("A triangle looks like this: \u25B3");
		
	}

	
}
