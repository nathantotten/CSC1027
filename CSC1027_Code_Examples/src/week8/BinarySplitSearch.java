package week8;

import java.util.Random;
import java.util.Scanner;

public class BinarySplitSearch {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int data[] = createRandomOrderedArray(11);
		int target;
		display(data);
		do {
			System.out.print("Enter value:");
			target = input.nextInt();
			if (target != -1) {
			   int pos = locationOf(target, data);
			   if (pos >= 0) {
				   System.out.println(target + " found at index" + pos);
			   }
			   else {
				   System.out.println(target + " not found.");
			   }
			}
		}
		while(target != -1);
		input.close();
	}
	
	/**
	 * Binary Split Search
	 * @param target
	 * @param data
	 * @return
	 */
	public static int locationOf(int target, int data[]) {
		int start = 0;
		int end = data.length-1;
		int pivot;
		do {
			pivot = start + ((end-start)/2);
			if (data[pivot] == target) {
				return pivot;
			}
			if (data[pivot] > target) {
				end = pivot-1;
			}
			else {
				start = pivot+1;
			}
		}
		while(start <= end);
		return -1;
	}
	
	public static void display(int data[]) {
		System.out.print("[");
		for(int index=0;index<data.length-1;index++) {
			System.out.print(data[index] + ", ");
		}
		System.out.print(data[data.length-1]);
		System.out.println("]");
	}
	
	/**
	 * Will insert value into correct place in array data
	 * @param value - value to be inserted
	 * @param data - the array
	 * @param count - number of elements in the array before insert
	 */
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
