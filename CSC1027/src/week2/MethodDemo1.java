package week2;

/* Methods are good for code reuse
 * 
 */
public class MethodDemo1 {

	/* A Method to display a row of stars */
	public static void printStars() {
		System.out.println("**********");
	}
	
	/* Stating point for the application */
	public static void main(String[] args) {
		for(int count=1; count<=10; count++ ) {
			printStars();
		}
	}

}
