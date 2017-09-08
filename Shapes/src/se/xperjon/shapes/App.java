package se.xperjon.shapes;

import java.util.ArrayList;
import java.util.List;

import se.xperjon.shapes.core.Circle;
import se.xperjon.shapes.core.Rectangle;
import se.xperjon.shapes.core.Shape;
import se.xperjon.shapes.core.Triangle;

public class App {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(5));
		shapes.add(new Rectangle(10,10));
		Triangle triangle = new Triangle(10,8);
		triangle.setColor("Red");
		shapes.add(triangle);
		
		for (Shape shape : shapes) {
			//Draw shape
			shape.draw();
			//Print shape area
			System.out.println("Area of shape is: "+shape.getArea());
			System.out.println("Color of shape is: "+shape.getColor());
		}
	}
}
