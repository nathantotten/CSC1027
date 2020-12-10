package week3;

public class Student {
	private int studentId;
	private String name;
	private String course;
	private char faculty;
	private static int nextId = 1234;
	
	public Student(String sname, String scourse, char fac) {
		this.studentId = nextId;
		nextId++;
		this.name = sname;
		this.course = scourse;
		this.faculty = fac;
	}
	
	// Getters
	public int getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public char getFaculty() {
		return faculty;
	}
	
	// Setters
	public void setName(String aName) {
		name = aName;
	}
	
	public void setCourse(String aCourse) {
		course = aCourse;
	}
	
	public void setFaculty(char aFaculty) {
		faculty = aFaculty;
	}
	
	// toString
	public String toString() {
		String data = "Number: " + getStudentId() + "\n";
		data += "Name: " + getName() + "\n";
		data += "Course: " + getCourse() + "\n";
		data += "Faculty: " + getFaculty() + "\n";
		return data;
	}
}
