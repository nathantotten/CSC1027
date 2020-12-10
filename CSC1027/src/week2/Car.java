package week2;

public class Car {
	public String make;
	public String model;
	public String colour;
	public double engineSize;
	
	public void drive() {
		System.out.println("I am driving");
	}
	
	public void start() {
		System.out.println("I am starting");
	}
	
	public void stop() {
		System.out.println("I am stopping");
	}
	
	public void changeGear(int gear) {
		System.out.println("Gear changed to " + gear);
	}
}
