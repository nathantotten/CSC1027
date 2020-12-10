package week5;

import java.util.ArrayList;

public class TestShape {

	public static void main(String[] args) {
		Circle c1 = new Circle(2.1);
		Rectangle r1 = new Rectangle(3.4, 5.6);
		Triangle t1 = new Triangle(1.2, 6.7);
		
		ArrayList<Shape> myShapes = new ArrayList<Shape>();
		myShapes.add(c1);
		myShapes.add(r1);
		myShapes.add(t1);
		
		for(Shape s : myShapes) {
			System.out.println(s.getSummary());
			System.out.println("\tArea: " + s.getArea());
			System.out.println();
		}
	}

}
