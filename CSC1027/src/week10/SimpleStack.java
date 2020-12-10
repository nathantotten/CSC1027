package week10;

public class SimpleStack {
	private LinkedList myList;
	
	public SimpleStack() {
		myList = new LinkedList();
	}
	
	public boolean isEmpty() {
		return myList.size() == 0;
	}
	
	public void push(Object data) {
		if (data != null) {
			myList.add(data, 0);
		}
	}
	
	public Object pop() {
		Object data = myList.remove(0);
		return data;
	}
}
