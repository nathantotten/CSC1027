package week7;

public class Circle extends Shape {
	private final double PI = 3.14;
	private double radius;
	
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return PI*radius*radius;
	}
	
	@Override
	public String getSummary() {
		String result = "";
		result += super.getSummary() + "\n";
		result += "\tRadius: " + radius;
		return result;
	}
}
