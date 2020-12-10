package week2;

/* Methods are good for structuring code
 * 
 */
public class MethodDemo2 {

	public static void main(String[] args) {
		drawOneBox();
	}
	
	public static void drawOneBox() {
		// draw top of box
		printStars();
		
		// draw middle of box
		for(int count = 1; count<=8; count++) {
			printStarGapStar();
		}
		
		// draw bottom of box
		printStars();
	}
	
	/* A Method to display a row of stars */
	public static void printStars() {
		System.out.println("**********");
	}
	
	/* A method to display a star - then spaces - then a star */
	public static void printStarGapStar() {
		System.out.println("*        *");
	}

}
