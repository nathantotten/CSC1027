package week9;

public class BubbleTest {

	public static void main(String[] args) {
		bubbleTestCase1();
		bubbleTestCase2();
		bubbleTestCase3();
		bubbleTestCase4();
		bubbleTestCase5();
	}

	private static void bubbleTestCase1() {
		int data[] = {};
		System.out.println("+++ Test Case 1: Sort empty array. +++++++");
		System.out.print("Before : ");
		SortRoutines.display(data, 0);
		SortRoutines.bubbleSort(data);
		System.out.print("After  : ");
		SortRoutines.display(data, 0);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

	private static void bubbleTestCase2() {
		int data[] = { 1, 2, 3, 4, 5 };
		System.out.println("+++ Test Case 2: Sort best case. ++++++++");
		System.out.print("Before : ");
		SortRoutines.display(data, 5);
		SortRoutines.bubbleSort(data);
		System.out.print("After  : ");
		SortRoutines.display(data, 5);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

	private static void bubbleTestCase3() {
		int data[] = { 5, 4, 3, 2, 1 };
		System.out.println("+++ Test Case 3: Sort worst case. ++++++++");
		System.out.print("Before : ");
		SortRoutines.display(data, 5);
		SortRoutines.bubbleSort(data);
		System.out.print("After  : ");
		SortRoutines.display(data, 5);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}
	
	private static void bubbleTestCase4() {
		int data[] = { 5, 4, 3, 2, 1 };
		System.out.println("+++ Test Case 4: Sort ascending. ++++++++");
		System.out.print("Before : ");
		SortRoutines.display(data, 5);
		SortRoutines.bubbleSort(data, true);
		System.out.print("After  : ");
		SortRoutines.display(data, 5);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}
	
	private static void bubbleTestCase5() {
		int data[] = { 1, 2, 3, 4, 5 };
		System.out.println("+++ Test Case 4: Sort descending. ++++++++");
		System.out.print("Before : ");
		SortRoutines.display(data, 5);
		SortRoutines.bubbleSort(data, false);
		System.out.print("After  : ");
		SortRoutines.display(data, 5);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}
}
