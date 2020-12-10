package week8;

import java.util.ArrayList;

public class College {
	private String name;
	private String address;
	private ArrayList<Student> register;

	public College(String name, String address) {
		this.name = name;
		this.address = address;
		register = new ArrayList<Student>();
	}

	public String getDetails() {
		String str = "College Name: " + name + " Address: "+address;
		return str;
	}
	
	public String getName() {
		return this.name;
	}

	public int getNumberOfStudents() {
		return register.size();
	}

	public void addStudent(Student stu) {
		if (stu != null) {
			register.add(stu);
		}
	}

	public String getInfo() {
		return "College Name: " + getName() + "\n" + "Number of Students: " + getNumberOfStudents();
	}

	public String[] getStudentNames() {
		if (register.size() > 0) {
			String[] names = new String[register.size()];
			for (int index = 0; index < register.size(); index++) {
				names[index] = register.get(index).getName();
			}
			return names;
		}
		return null;
	}

	public Student search(int id) {
		   Student target = null;
		   for(int index=0;index<register.size();index++) {
		      Student stu = register.get(index);
		      if ( stu.getNumber() == id ) {
		         target = stu;
		         break;
		      }
		   }
		   return target;
		}

	
	public boolean remove(int id) {
		Student stu = search(id);
		if (stu != null) {
			return register.remove(stu);
		}
		return false;
	}

	public String toString() {
		String res = "";
		res += getInfo() + "\n";
		if (register.size() > 0) {
			for (Student stu : register) {
				res += stu.getDetails() + "\n";
			}
		} else {
			res += "No students registered.";
		}
		return res;
	}
}
