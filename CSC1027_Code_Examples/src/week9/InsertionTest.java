package week9;

public class InsertionTest {

	public static void main(String[] args) {
		insertionTestCase1();
		insertionTestCase2();
		insertionTestCase3();
		insertionTestCase4();
		insertionTestCase5();
	}
	
	private static void insertionTestCase1() {
		final int SIZE = 7;
		int data[] = new int[SIZE];
		System.out.println("+++ Test Case 1: Insert first element. +++");
		System.out.print("Before : ");
		SortRoutines.display(data, 0);
		SortRoutines.insert(6, data, 0);
		System.out.print("After  : ");
		SortRoutines.display(data, 1);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

	private static void insertionTestCase2() {
		int data[] = { 1, 3, 5, 7, 9, 0, 0 };
		System.out.println("+++ Test Case 2: Insert in the middle. +++");
		System.out.print("Before : ");
		SortRoutines.display(data, 5);
		SortRoutines.insert(6, data, 5);
		System.out.print("After  : ");
		SortRoutines.display(data, 6);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

	private static void insertionTestCase3() {
		int data[] = { 1, 3, 5, 7, 9, 0, 0 };
		System.out.println("+++ Test Case 3: Insert before first. ++++");
		System.out.print("Before : ");
		SortRoutines.display(data, 5);
		SortRoutines.insert(0, data, 5);
		System.out.print("After  : ");
		SortRoutines.display(data, 6);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

	private static void insertionTestCase4() {
		int data[] = { 1, 3, 5, 7, 9, 0, 0 };
		System.out.println("+++ Test Case 4: Insert after last. ++++++");
		System.out.print("Before : ");
		SortRoutines.display(data, 5);
		SortRoutines.insert(9, data, 5);
		System.out.print("After  : ");
		SortRoutines.display(data, 6);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

	private static void insertionTestCase5() {
		int data[] = { 1, 4, 3, 5, 7, 8, 9 };
		System.out.println("+++ Test Case 5: Insert to full array. +++");
		System.out.print("Before : ");
		SortRoutines.display(data, 7);
		SortRoutines.insert(6, data, 7);
		System.out.print("After  : ");
		SortRoutines.display(data, 7);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}


}
