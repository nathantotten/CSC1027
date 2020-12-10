package week10;

public class SimpleQueue {
	private LinkedList myList;
	
	public SimpleQueue() {
		myList = new LinkedList();
	}
	
	public boolean enqueue(Object obj) {
		// Join the back of the queue
		// Standard LinkedList add() will do the job
		if ( obj != null ) {
			myList.add(obj);
			return true;
		}
		return false;
	}
	
	public Object dequeue() {
		// Remove from the head of the queue
		// LinkedList remove(0) used here
		Object res = myList.remove(0);
		return res;
	}
	
	public boolean isEmpty() {
		return myList.size() == 0;
	}
	
	public Object peek() {
		return myList.get(0);
	}
}
