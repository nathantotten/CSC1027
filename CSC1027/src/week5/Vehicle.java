package week5;

public class Vehicle {
	private int numberOfTires;
	private double engineSize;
	private String colour;

	public Vehicle(int numberOfTires, double engineSize, String colour) {
		this.numberOfTires = numberOfTires;
		this.engineSize = engineSize;
		this.colour = colour;
	}

	public int getNumberOfTires() {
		return numberOfTires;
	}

	public void setNumberOfTires(int numberOfTires) {
		this.numberOfTires = numberOfTires;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String printDetails() {
		return "Number of Tires: " + this.numberOfTires 
				+ "\nEngine Size: " + this.engineSize
				+ "\nColour: " + this.colour; 
	}
}