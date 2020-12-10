package week9;

import java.util.ArrayList;

public class StudentTester {

	public static void main(String[] args) {
		Student list[] = createStudentList();
		
		System.out.println("Original List:");
		displayStudents(list);
		System.out.println();
		SortRoutines.bubbleSort(list, true);
		System.out.println("In alphabetical order:");
		displayStudents(list);
		System.out.println();
		SortRoutines.bubbleSort(list, false);
		System.out.println("In reverse order:");
		displayStudents(list);
	}

	public static void displayStudents(Student data[]) {
		for(Student stu : data) {
			System.out.println(stu);
		}
	}
	
	public static Student[] createStudentList() {
		Student list[] = new Student[5];
		list[0] = new Student("Joe", "Bloggs");
		list[1] = new Student("Michael", "Smith");
		list[2] = new Student("Janet", "Price");
		list[3] = new Student("John", "McBride");
		list[4] = new Student("Christine", "Cooper");
		return list;
	}
}
