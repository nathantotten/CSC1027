package week7;

import java.util.ArrayList;

public class StudentApp {

	private static ArrayList<Student> learners;
	
	public static void main(String[] args) {
		createStudents();
		Student stu = selectOneStudent();
		System.out.println("Details for selected student ...");
		System.out.println("\t"+stu.getDetails());
	}
	
	private static void createStudents() {
		learners = new ArrayList<Student>();
		Student stu1 = new Student("Homer Simpson", "Springfield");
		Student stu2 = new Student("Marge Simpson", "Springfield");
		Student stu3 = new Student("Bart Simpson", "Springfield");
		Student stu4 = new Student("Lisa Simpson", "Springfield");
		Student stu5 = new Student("Maggie Simpson", "Springfield");
		learners.add(stu1);
		learners.add(stu2);
		learners.add(stu3);
		learners.add(stu4);
		learners.add(stu5);
	}
	
	private static void displayStudents() {
		System.out.println("List of Students:");
		for(Student stu : learners) {
			System.out.println("\t"+ stu.getDetails());
		}
	}
	
	public static String[] getStudentNames() {
		if ( learners.size() > 0) {
			String[] names = new String[learners.size()];
			for(int index=0; index<learners.size();index++) {
				names[index] = learners.get(index).getName();
			}
			return names;	
		}
		return null;
	}
	
	public static Student selectOneStudent() {
		Student stu = null;
		String names[] = getStudentNames();
		Menu myMenu = new Menu("Pick a Student", names);
		myMenu.display();
		int choice = myMenu.getChoice();
		if (choice>=1 && choice<=learners.size()) {
			stu = learners.get(choice-1);
		}
		return stu;
	}

}
