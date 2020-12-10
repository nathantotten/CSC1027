package week5;

public class CarInstanceOfTester {
   
   public static void main(String[] args) {
      Vehicle aPlainCar = new Vehicle(4, 1.8, "Red"); 

      Car aLimo = new Car(8, 3.0, "White", "XXI 1234");
      
      System.out.println("\nUsing Instance of");
      System.out.println("aPlainCar is an instance of Vehicle: " + (aPlainCar instanceof Vehicle));
      System.out.println("aPlainCar is an instance of Car: " + (aPlainCar instanceof Car));
      System.out.println("aLimo is an instance of Vehicle: " + (aLimo instanceof Vehicle));
      System.out.println("aLimo is an instance of Car: " + (aLimo instanceof Car));
   }
   
}