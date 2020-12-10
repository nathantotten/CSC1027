package week3;

public class MenuTester {

	public static void main(String[] args) {
		String title = "Student Registration";
		String options[] = {"Add New Student", "List All Students", "Quit"};
		Menu regMenu = new Menu(title, options);
		int choice = regMenu.getUserChoice();
		System.out.println("User picked option: " + choice);
	}

}
