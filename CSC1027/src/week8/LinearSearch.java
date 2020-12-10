package week8;

public class LinearSearch {

	public static boolean search(int data[], int target) {
		for(int index=0; index<data.length; index++) {
			if ( data[index] == target ) {
				return true;
			}
		}
		return false;
	}
	
	public static int seekPosition(int data[], int target) {
		for(int index=0; index<data.length; index++) {
			if ( data[index] == target ) {
				return index;
			}
		}
		return -1;
	}
	
	public static int findMax(int values[]) {
		int max = values[0];
		for(int index=1; index<values.length; index++) {
			if (values[index] > max) {
				max = values[index];
			}
		}
		return max;
	}
	
	public static int findMin(int values[]) {
		int min = values[0];
		for(int index=1; index<values.length; index++) {
			if (values[index] < min) {
				min = values[index];
			}
		}
		return min;
	}
	
	public static int[] findMaxMin(int values[]) {
		int result[] = new int[2];
		result[0] = findMax(values);
		result[1] = findMin(values);
		return result;
	}
	
	public static void main(String[] args) {
		int values[] = {3, 1, 6, 5, 11, 7, 2};
		
		int num = 6;
		
		// what really is 'values'?
		System.out.println(values);
		// what does this output tell us?
		
		// does the array contain the search value?
		boolean found = search(values, num);
		System.out.print("Number: "+num);
		if ( found ) {
			System.out.println(" was found.");
		}
		else {
			System.out.println(" was not found.");
		}
		
		// where is the search value located?
		int pos = seekPosition(values, 6);
		System.out.print("Number: "+num);
		if ( pos >= 0) {
			System.out.println(" was found at position: "+pos);
		}
		else {
			System.out.println(" was not found.");
		}
		
		// what are the max and min values
		int result[] = findMaxMin(values);
		System.out.println("Max value is: " + result[0]);
		System.out.println("Min value is: " + result[1]);
		
	}

}
