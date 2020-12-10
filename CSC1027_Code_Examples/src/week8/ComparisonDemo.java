package week8;

public class ComparisonDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Michael", "Belfast");
		Person p2 = new Person("James", "Armagh");
		Person p3 = new Person("Anne", "Antrim");
		
		// what if we needed to compare Person objects
		// we could do this on 'name' - perhaps alphabetically
		
		String name1 = p1.getName();
		String name2 = p2.getName();
		
		// test for equality
		boolean equal1 = name1.equals(name2);
		boolean equal2 = name1.equalsIgnoreCase(name2);
		
		// comparison
		int value = name1.compareTo(name2);
		// value : 0 means equality
		// value : < 0 means name1 comes before name2
		// value : > 0 means name 1 comes after name 2
		if ( value == 0 ) {
			System.out.println(name1 + " and " + name2 + " are the same.");
		}
		else if ( value < 0) {
			System.out.println(name1 + " is before " + name2);
		}
		else {
			System.out.println(name1 + " is after " + name2);
		}
		
		// what alternative?
		if ( p1.compareTo(p2) == 0 ) {
			
		}
		// how could this be provided?
		// what are the implications?
	}
	


}
