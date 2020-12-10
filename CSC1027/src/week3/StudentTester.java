package week3;

public class StudentTester {

	public static void main(String[] args) {
		Student s1 = new Student("Homer Simpson", "Computer Science", 'S');
		Student s2 = new Student("Bart Simpson", "Software Engineering", 'S');
		
		
		System.out.println(s1);
		System.out.println();
		System.out.println(s2); // will automatically call toString() 
	}

}
