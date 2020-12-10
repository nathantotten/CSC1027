package week5;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class EfficiencyTest {

	public static void main(String[] args) {
		final int MAX = 1000000;
		int sum;

		long t1 = (new Date()).getTime();
		
		// declare array of int
		int stdArray[] = new int[MAX];
		
		// initialise array
		for(int value=0;value<MAX;value++) {
			stdArray[value] = value+1;
		}
		
		// calculate sum of values
		sum = 0;
		for(int value=0;value<MAX;value++) {
			sum += stdArray[value];
		}
		long t2 = (new Date()).getTime();
		System.out.println("Array Sum is:" + sum + " in " + (t2-t1) + " milliseconds.");
		
		long t3 = (new Date()).getTime();
		// create an array list
		ArrayList data = new ArrayList();
		
		// initialise 
		for(int value=0;value<MAX;value++) {
			data.add(value+1);
		}
		
		//calculate sum of values
		sum = 0;
		for(int value=0;value<MAX;value++) {
			sum += (int)data.get(value);
		}
		long t4 = (new Date()).getTime();
		System.out.println("ArrayList Sum is:" + sum + " in " + (t4-t3) + " milliseconds.");
	}

}
