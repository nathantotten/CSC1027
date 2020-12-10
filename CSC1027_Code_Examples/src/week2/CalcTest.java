package week2;

public class CalcTest {

	public static void main(String[] args) {
		int value1 = 2;
		int value2 = 3;
		
		int answer = Calculator.add(value1,  value2);
		System.out.println(value1 + " + " + value2 + " = " + answer);
		
		answer = Calculator.subtract(value1,  value2);
		System.out.println(value1 + " - " + value2 + " = " + answer);
		
		answer = Calculator.multiply(value1,  value2);
		System.out.println(value1 + " X " + value2 + " = " + answer);
		
		double dblValue = Calculator.divide(value1,  value2);
		System.out.println(value1 + " / " + value2 + " = " + dblValue);
	}

}
