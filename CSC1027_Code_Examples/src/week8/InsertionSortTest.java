package week8;

public class InsertionSortTest {

	public static void main(String[] args) {
		//testCase1();
		//testCase2();
		//testCase3();
		//testCase4();
		testCase5();
	}

	/**
	 * Will insert value into correct place in array data
	 * 
	 * @param value - value to be inserted
	 * @param data  - the array
	 * @param count - number of elements in the array before insert
	 */
	public static void insert(int value, int data[], int count) {
		int index;
		for (index = 0; index < count; index++) {
			if (data[index] > value) {
				break;
			}
		}
		// either first value or biggest value so far
		if (index < count) {
			// shuffle needed to make room for value
			for (int pos = data.length - 1; pos > index; pos--) {
				data[pos] = data[pos - 1];
			}
		}
		data[index] = value;
	}

	public static void display(int data[], int count) {
		if (data != null && data.length > 0 && data.length >= count && count > 0) {
			System.out.print("[");
			for (int index = 0; index < count - 1; index++) {
				System.out.print(data[index] + ", ");
			}
			System.out.println(data[count - 1] + "]");
		} else {
			System.out.println("No data to display.");
		}
	}

	private static void testCase1() {
		final int SIZE = 7;
		int data[] = new int[SIZE];
		System.out.println("+++ Test Case 1: Insert   first element. +++");
		System.out.print("Before : ");
		display(data, 0);
		insert(6, data, 0);
		System.out.print("After  : ");
		display(data, 1);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

	private static void testCase2() {
		int data[] = { 1, 3, 5, 7, 9, 0, 0 };
		System.out.println("+++ Test Case 2: Insert in the middle. +++");
		System.out.print("Before : ");
		display(data, 5);
		insert(6, data, 5);
		System.out.print("After  : ");
		display(data, 6);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

	private static void testCase3() {
		int data[] = { 1, 3, 5, 7, 9, 0, 0 };
		System.out.println("+++ Test Case 3: Insert before first. ++++");
		System.out.print("Before : ");
		display(data, 5);
		insert(0, data, 5);
		System.out.print("After  : ");
		display(data, 6);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

	private static void testCase4() {
		int data[] = { 1, 3, 5, 7, 9, 0, 0 };
		System.out.println("+++ Test Case 4: Insert after last. ++++++");
		System.out.print("Before : ");
		display(data, 5);
		insert(9, data, 5);
		System.out.print("After  : ");
		display(data, 6);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

	private static void testCase5() {
		int data[] = { 1, 4, 3, 5, 7, 8, 9 };
		System.out.println("+++ Test Case 5: Insert to full array. +++");
		System.out.print("Before : ");
		display(data, 7);
		insert(6, data, 7);
		System.out.print("After  : ");
		display(data, 7);
		System.out.println("+++ End Test Case ++++++++++++++++++++++++\n");
	}

}
