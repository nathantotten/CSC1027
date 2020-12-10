package week3;

public class ArrayTester3 {

	public static void main(String[] args) {
		// we can define arrays of non-primitives 
		// i.e. object references
		String names1[] = {"Homer", "Marge", "Bart"};
		System.out.println("names1 : " + printArray1D(names1));
		
		// slightly different declaration...
		String[] names2 = new String[3];
		System.out.println("names2 : " + printArray1D(names2));
	}

	public static String printArray1D(String values[]) {
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
