package week2;

/* Using primitive & non-primitive 
 * data as method parameters
 */
public class MethodDemo4 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		displaySum(num1, num2);
		int answer = calcSum(num1, num2);
		System.out.println("The answer is: " + answer);
	}
	
	/* A method which adds 2 values and displays their sum
	 * 
	 */
	public static void displaySum(int first, int second) {
		System.out.println("Sum of " + first + " and " + second + " is " + (first+second) );
	}
	
	/* A method which adds 2 values and returns their sum
	 * 
	 */
	public static int calcSum(int first, int second) {
		return first+second;
	}

	/* A method to calculate and return the sum of
	 * an array of integers
	 */
	public static int sumAll( int data[] ) {
		int total = 0;
		for(int index = 0; index<data.length; index++) {
			total = total + data[index];
		}
		return total;
	}
}
