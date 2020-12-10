package week4;

public class TestMenu {

	public static void main(String[] args) {
		String options[] = {"One", "Two", "Three"};
		Menu myMenu = new Menu("My Title", options);
		int num = myMenu.getChoice();
		System.out.println("\nUser choice was: "+num);
	}

}
