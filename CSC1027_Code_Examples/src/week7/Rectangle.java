package week7;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super("Rectangle");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return this.width * this.height;
	}
	
	@Override
	public String getSummary() {
		String result = "";
		result += super.getSummary() + "\n";
		result += "\tWidth: " + width + " Height: " + height;
		return result;
	}
}
