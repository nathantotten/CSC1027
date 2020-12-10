package week5;

public class TestStudent {

	public static void main(String[] args) {
		Student stu1 = new Student(12345678, "Homer", "Simpson");
		Module prog = new Module("CSC1027", "Programming", "The basics of OOP", 20, 36);
		Module arch = new Module("CSC1036", "Architecture", "All about hardware", 20, 36);
		stu1.addModule(prog);
		stu1.addModule(arch);
		System.out.println(stu1.display());
	}
}
