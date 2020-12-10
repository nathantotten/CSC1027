package week8;

public class TestStudent {

	private static College initialise() {
		College aCollege = new College("QUB", "18 Malone Road");
		Student stu1 = new Student("Homer Simpson", "Springfield");
		Student stu2 = new Student("Marge Simpson", "Springfield");
		Student stu3 = new Student("Bart Simpson", "Springfield");
		Student stu4 = new Student("Lisa Simpson", "Springfield");
		Student stu5 = new Student("Maggie Simpson", "Springfield");
		aCollege.addStudent(stu1);
		aCollege.addStudent(stu2);
		aCollege.addStudent(stu3);
		aCollege.addStudent(stu4);
		aCollege.addStudent(stu5);
		return aCollege;
	}

	public static void main(String[] args) {
		College myCollege = initialise();
		// output college details
		   System.out.println(myCollege.getDetails());

		   // search for and display details of a student
		   int id = 20;
		   System.out.println("Search for student with id: "+id);
		   Student stu = myCollege.search(id);
		   if ( stu != null ) {
		      System.out.println(stu.getDetails());
		   }
		   else {
		      System.out.println("Student with id: "+id+" does not exist.");
		   }
		}
	
}
