package week3;

public class ArraysAndMethods {

	public static void display(int values[]) {
		for(int i=0;i<values.length;i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	
	public static void clear(int values[]) {
		for(int i=0;i<values.length;i++) {
			values[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		// data is local to the main method
		int data[] = {9,8,7,6,5,4,3,2,1,0};
		
		display(data);
		clear(data);
		display(data);
	}

}
