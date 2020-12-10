package week10;

public class StackTester {

	static SimpleStack myStack = new SimpleStack();

	public static void main(String[] args) {

		SimpleStack myStack = new SimpleStack();

		myStack.push("One");
		myStack.push("Two");
		myStack.push("Three");
		myStack.push("Four");
		myStack.push("Five");

		System.out.println();
		String str = (String) myStack.pop();
		while (str != null) {
			System.out.println("Pop: " + str + " from the stack.");
			str = (String) myStack.pop();
		}
		//Comment

	}

}
