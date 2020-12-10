package week9;

public class Student implements Comparable {
	private int number;
	private String fName;
	private String lName;
	private static int nextNum = 1;
	
	public Student(String fName, String lName) {
		this.number = nextNum;
		nextNum++;
		this.fName = fName;
		this.lName = lName;
	}
	
	public String getDetails() {
		return "Number: "+number+" Name: "+getName();
	}
	
	public String getName() {
		return lName + ", " + fName;
	}
	
	@Override
	public String toString() {
		return getDetails();
	}
	
	public int compare(Object stu) {
		Student other = (Student)stu;
		return getName().compareTo( other.getName() );
	}
}
