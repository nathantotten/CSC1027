package week8;

public class SearchDemo {

	public static void main(String[] args) {
		int numbers[] = { 5, 4, 6, 1, 8, 0, 3 };
		String names[] = {"Homer", "Lisa", "Wiggum", "Bob"};
		
		int value = 42;
		if ( search( numbers, value ) ) {
			System.out.println(value + " was in the numbers array.");
		}
		else {
			System.out.println(value + " was not in the numbers array.");
		}
		
		String str = "Bob";
		
		if ( search( names, str ) ) {
			System.out.println(str + " was in the names array.");
		}
		else {
			System.out.println(str + " was not in the names array.");
		}
	}
	
	public static boolean search(int data[], int target) {
		for( int index=0; index<data.length; index++  ) {
			if ( data[index] ==  target ) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean search(String data[], String target) {
		for( int index=0; index<data.length; index++  ) {
			if ( data[index].equals(target) ) {
				return true;
			}
		}
		return false;
	}

}
