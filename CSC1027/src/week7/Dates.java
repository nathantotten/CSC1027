package week7;

import java.time.LocalDate;

public class Dates {

	public static void main(String[] args) {
		LocalDate dt1 = LocalDate.now();
		String str = dt1.toString();
		System.out.println("Date now is:" + str);
		LocalDate dt2 = LocalDate.of(2020, 10, 31);
		System.out.println("Halloween:" + dt2);
	}

}
