package week7;

public abstract class Shape {
	public String name;
	
	public Shape(String name) {
		if (name != null) {
			this.name = name;
		}
		else {
			this.name = "Unkown Shape";
		}
	}
	
	public abstract double getArea();
	
	public String getSummary() {
		return "Shape: " + name;
	}
}
