package week2;

public class Strings {

	public static void main(String[] args) {
		String fName = "Homer"; // assignment to a literal	
		String lName = new String("Simpson"); // using new
		String fullName = null; // not referencing any object, null by default?
		
		System.out.println("Name : " + fullName) ;
		
		if ( fullName == null) {
			System.out.println("Name is not yet assigned.");
		}

		fullName = fName + " "  + lName; // String concatenation
		System.out.println("Name : " + fullName);
		
		int age = 43;
		System.out.println("Age: " + age); // string + int

	}

}
