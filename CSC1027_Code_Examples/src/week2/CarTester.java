package week2;

public class CarTester {

	public static void main(String[] args) {
		Car myC = new Car();	// create a Car object
		myC.make = "Mini";		// set the make
		myC.model = "Cooper";	// set the model
		myC.colour = "Red";		// set the colour
		myC.engineSize = 1.6;	// set the engineSize
		
		myC.start();			// start the car
		myC.changeGear(1);		// into 1st
		myC.drive();			// use drive method
		myC.changeGear(2);		// into 2nd		
		myC.stop();				// stop the car
	}

}
