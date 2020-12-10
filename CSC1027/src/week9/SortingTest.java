package week9;

import java.util.Random;

public class SortingTest {

	public static void main(String[] args) {

	}
	
	public static void insert(int value, int data[], int count) {
		int index;
		for(index = 0; index < count; index++) {
			if ( data[index]>value) {
				break;
			}
		}
		// either first value or biggest value so far
		if (index < count) {
			// shuffle needed to make room for value
			for(int pos=data.length-1; pos>index;pos--) {
				data[pos] = data[pos-1];
			}
		}
		data[index] = value;
	}
	
	public static int[] createRandomOrderedArray(int size) {
		int data[] = new int[size];
		// create instance of Random class 
        Random rand = new Random(); 
        
		// Need this array filled with random numbers
        // in ascending order - duplicates are ok
		// between 1 and 100
		int count = 0;
		do {
			// generate a random number in range 0 to 99
			int num = rand.nextInt(100);
			// increment to bring number in range 1 to 100
			num++;
			insert(num, data, count);
			count++;
		}
		while (count < size);
		return data;
	}

}
