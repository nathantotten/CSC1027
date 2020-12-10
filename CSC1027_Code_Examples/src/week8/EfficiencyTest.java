package week8;

import java.util.Random;

public class EfficiencyTest {

	public static void main(String[] args) {
		int data[] = createRandomArray(100);
		testSearch(10, data);
		testSearch(100, data);
		testSearch(1000, data);
	}

	/**
	 * Returns the number of comparisons made when searching for target in array data
	 * 
	 * @param target - the value to be found
	 * @param data   - the array to search
	 * @return - the number of comparisons made searching data for target
	 */
	public static int comparisons(int target, int data[]) {
		int count = 0;
		for (int index = 0; index < data.length; index++) {
			count++;
			if (data[index] == target) {
				return count;
			}
		}
		return count;
	}

	/**
	 * Conducts a crude 'efficiency test' in searching for random values
	 * within an array.
	 * The method displays information on the average number of comparisons made in applying a search
	 * for a random value. This is compared against the theoretical average.
	 * 
	 * @param numTests - number of tests to execute
	 * @param data - the array to search through
	 */
	public static void testSearch(int numTests, int data[]) {
		int compCount = 0;
		double average;
		// conduct a series of searches, recoding the number of
		// comparisons made in each search
		
		for (int count = 0; count < numTests; count++) {
			// get a random number
			Random rand = new Random();
			// between 1 and data.length inc.
			int randNum = rand.nextInt(data.length) + 1;
			compCount += comparisons(randNum, data);
		}
		// calculate average number of comparisons
		average = compCount / (double) numTests;
		System.out.println("Efficiency Test");
		System.out.println("+++++++++++++++\n");
		System.out.println("Number of Iterations: " + numTests);
		System.out.println("Array Size: " + data.length + " (n)");
		System.out.println("Theory Average: " + (data.length / 2.0) + " (n/2)");
		System.out.println("Actual Average: " + average);
	}
	
	/**
	 * creates a randomly generated array of integers with values between
	 * 1 and size
	 * @param size
	 * @return
	 */
	public static int[] createRandomArray(int size) {
		int data[] = new int[size];
		// create instance of Random class 
        	Random rand = new Random(); 
        
		// Need this array filled with unique random numbers
		// between 1 and size
		int count = 0;
		do {
			// generate a random number in range 0 to size-1
			int num = rand.nextInt(size);
			// increment to bring number in range 1 to size
			num++;
			// don't add the same value twice!
			if ( !contains(num, data) ) {
				data[count] = num;
				count++;
			}
		}
		while (count < size);
        
		return data;
	}

	/**
	 * A basic linear search
	 * @param target
	 * @param data
	 * @return
	 */
	public static boolean contains(int target, int data[]) {
		for(int index=0; index<data.length; index++) {
			if ( data[index] == target ) {
				return true;
			}
		}
		return false;
	}


}
