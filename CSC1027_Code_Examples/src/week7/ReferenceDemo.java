package week7;

public class ReferenceDemo {

	public static void main(String args[]) {
		Circle c1 = new Circle(4.5);
		Rectangle r1 = new Rectangle(4,3);
		Triangle t1 = new Triangle(8,6);
		
		
		Shape s1 = c1;
		Shape s2 = r1;
		Shape s3 = t1;
		s3 = s1;
		
		// not permitted
		//t1 = s2;
		//t1 = s3;

	}
}
