package se.xperjon.shapes.core;

public class Rectangle extends WidthHeightShape{

	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public void draw() {
		System.out.println("A rectangle looks like this: \u25AF");
		
	}

}
