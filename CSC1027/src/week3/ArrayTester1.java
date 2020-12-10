package week3;

public class ArrayTester1 {

	
	public static void main(String[] args) {
		// 1-D array of integer (primitive)
		int data1[] = { 1,2,3,4 };
		// data1.length is 4
		// indexed from 0 to 3
		System.out.println("data1 : " + printArray1D(data1));
		
		
		int data2[] = {};
		// data2.length is 0
		System.out.println("data2 : " + printArray1D(data2));
		
		
		int data3[] = null;
		// the variable name of an array is
		// a reference to an object
		System.out.println("data3 : " + printArray1D(data3));
		data3 = data1;
		System.out.println("data3 : " + printArray1D(data3));
		
		int data4[] = new int[4];
		// data4 references an array with
		// enough space to hold 4 integers
		System.out.println("data4 : " + printArray1D(data4));
		
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
