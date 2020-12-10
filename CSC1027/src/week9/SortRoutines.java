package week9;

public class SortRoutines {

	public static void insert(int value, int data[], int count) {
		// validate
		if (data != null && count >= 0 && count < data.length) {
			if (count == 0) {
				data[0] = value;
				return;
			}
			// find insert position
			int index, position;
			for (index = 0; index < count; index++) {
				if (data[index] > value) {
					break;
				}
			}
			position = index;
			// shuffle values if required
			for (index = count; index > position; index--) {
				data[index] = data[index - 1];
			}
			// insert the value
			data[position] = value;
		}
	}

	public static void bubbleSort(int data[], boolean ascending) {
		int swaps;
		do {
			swaps = 0;
			for (int index = 0; index < data.length - 1; index++) {
				if (data[index] > data[index + 1] && ascending || data[index] < data[index + 1] && !ascending) {
					int temp = data[index];
					data[index] = data[index + 1];
					data[index + 1] = temp;
					swaps++;
				}
			}
		} while (swaps > 0);
	}

	public static void bubbleSort(int data[]) {
		int swaps;
		do {
			swaps = 0;
			for (int index = 0; index < data.length - 1; index++) {
				if (data[index] > data[index + 1]) {
					int temp = data[index];
					data[index] = data[index + 1];
					data[index + 1] = temp;
					swaps++;
				}
			}
		} while (swaps > 0);
	}

	public static void bubbleSort(Comparable data[], boolean ascending) {
		int swaps;
		do {
			swaps = 0;
			for (int index = 0; index < data.length - 1; index++) {
				if (data[index].compare(data[index + 1]) < 0 && !ascending
						|| data[index].compare(data[index + 1]) > 0 && ascending) {
					Comparable temp = data[index];
					data[index] = data[index + 1];
					data[index + 1] = temp;
					swaps++;
				}
			}
		} while (swaps > 0);
	}
	
	public static void display(int data[]) {
		if (data != null && data.length > 0) {
			System.out.print("[");
			for (int index = 0; index < data.length - 1; index++) {
				System.out.print(data[index] + ", ");
			}
			System.out.println(data[data.length - 1] + "]");
		} else {
			System.out.println("No data to display.");
		}
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
}
