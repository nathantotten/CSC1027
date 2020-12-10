package week3;

import java.util.Scanner;

public class StudentRegister {

	static final int MAX = 2;
	static Student data[] = new Student[MAX];
	static int count = 0;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String title = "Student Registration";
		String options[] = {"Add New Student", "List All Students", "Quit"};
		Menu regMenu = new Menu(title, options);
		int choice = regMenu.getUserChoice();
		while( choice != 3 ) {	// i.e. "Quit"
			processChoice(choice);
			choice = regMenu.getUserChoice();
		}
		System.out.println("Finished - Goodbye!");
	}

	private static void processChoice(int choice) {
		switch(choice) {
		case	1	: 	addNewStudent() ;
						break;
		case	2	:	listStudents() ;
						break;
		default		:	System.out.println("Error");
		}
	}
	
	private static void addNewStudent() {
		if ( count < MAX ) {
			System.out.println("Add a New Student:\n");
			System.out.print("\tEnter Id: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.print("\tEnter Name: ");
			String name = input.nextLine();
			System.out.print("\tEnter Course: ");
			String course = input.nextLine();
			System.out.print("\tEnter Faculty: ");
			String fac = input.nextLine();
			fac = fac.trim();
			char faculty = fac.charAt(0);
			Student stu = new Student(name,course,faculty);
			data[count] = stu;
			count++;
			System.out.println();
		}
		else {
			System.out.println("\tNo room for a new student.");
		}
		
	}
	
	private static void listStudents() {
		System.out.println("List of All Students");
		System.out.println("++++++++++++++++++++\n");
		if (count==0) {
			System.out.println("\tNo students available.\n");
		}
		else {
			for(int index = 1; index<=count; index++) {
				Student s = data[index-1];
				System.out.println("\t"+index+". " + s.getName());
			}
			System.out.println();
		}
	}
}
