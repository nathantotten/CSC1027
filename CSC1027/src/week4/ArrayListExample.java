package week4;

import java.util.ArrayList;

public class ArrayListExample {
	/**
	 * A small application to demonstrate the use of ArrayLists
	 * 
	 * @author Paul Sage
	 *
	 */
	public static void main(String args[]) {
		demo1();
		demo2();
	}

	private static void demo1() {
		// Declare a basic ArrayList ...
		ArrayList myList = new ArrayList();

		// Add some String objects to this list
		myList.add("Homer");
		myList.add("Marge");
		myList.add("Bart");
		myList.add("Lisa");
		myList.add("Maggie");

		// Get the number of object in the list
		int count = myList.size();

		// Process a list with a loop
		for (int index = 0; index < count; index++) {
			String name = (String) myList.get(index);
			System.out.println("Name :" + name);
		}
		System.out.println();

		// Alternatively, use the enhanced for loop
		for (Object obj : myList) {
			System.out.println("Name : " + (String) obj);
		}
	}

	private static void demo2() {
		// Declare a parameterised ArrayList ...
		ArrayList<String> myList = new ArrayList<String>();

		// Add some String objects to this list
		myList.add("Homer");
		myList.add("Marge");
		myList.add("Bart");
		myList.add("Lisa");
		myList.add("Maggie");

		// Get the number of object in the list
		int count = myList.size();

		// Process a list with a loop
		for (int index = 0; index < count; index++) {
			String name = myList.get(index);
			System.out.println("Name :" + name);
		}
		System.out.println();

		// Alternatively, use the enhanced for loop
		for (String str : myList) {
			System.out.println("Name : " + str);
		}
	}
}
