package week2;

public class Output {
	public static void main(String[] args) {
		String fName = "Homer"; // assignment to a literal	
		String lName = new String("Simpson"); // using new
		String fullName = null; // not referencing any object, null by default?

		System.out.println("First name is: " + fName); 
		System.out.println("Last name is: " + lName); 
		System.out.println("Full name is: " + lName + ", " + fName); 

		fullName = fName + "\n" + lName;		// embed newline character
		System.out.println(fullName);
		
		fullName = fName + "\t" + lName;		// embed tab character
		System.out.println(fullName);
	}
}
