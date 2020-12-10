package week3;

public class ArrayTester2 {

	public static void main(String[] args) {
		// declaring a 2D array of integers
		int data1[][] = { {1,2,3}, {4,5,6}, {7,8,9} }; 
		System.out.println("data1 :");
		System.out.println(printArray2D(data1));
		
		// we can refer to a single element ...
		int row = 1, col = 1;
		System.out.print("Value at row:"+row+" col:"+col+" is ");
		System.out.println(data1[row][col]);
	}

	public static String printArray2D(int values[][]) {
		String str = "";
		for(int row=0; row<values.length; row++) {
			str += printArray1D(values[row]) + "\n";
		}
		return str;
	}
	
	public static String printArray1D(int values[]) {
		String str;
		if ( values != null && values.length > 0 ) {
			str = "[ " + values[0];
			for(int index=1; index<values.length; index++) {
				str += ", " + values[index];
			}
			str += " ]";
		}
		else {
			str = "No data to display.";
		}
		return str;
	}
}
