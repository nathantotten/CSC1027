package week5;

public class Car extends Vehicle {
   private String carRegistrationNumber;
   
   public Car(int numberOfTires, double engineSize, String colour, String carRegistrationNumber) {
	   super(numberOfTires, engineSize, colour);
	   this.carRegistrationNumber = carRegistrationNumber;
   }

   public String getCarRegistrationNumber() {
	   return carRegistrationNumber;
   }
   
   public void setCarRegistrationNumber(String carRegistrationNumber) {
	   this.carRegistrationNumber = carRegistrationNumber;
   }

   public String getDescription() {
      return "Car Description: \n" + printDetails() 
    		  + "\nCar Registration Number: " + this.carRegistrationNumber;
   }
}