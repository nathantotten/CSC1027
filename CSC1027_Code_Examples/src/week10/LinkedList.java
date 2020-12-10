package week10;

public class LinkedList {
	private class Node {
		public Object data;
		public Node next;
	}

	private Node first, last;
	private int numElements;
	
	/*
	 * Linked list constructor
	 */
	public LinkedList() {
		this.first = null;
		this.last = null;
		this.numElements = 0;
	}
	//Test
	/*
	 * Returns the length of the list
	 */
	public int size() {
		return numElements;
	}
	
	/*
	 * Returns the node at an index
	 */
	private Node select(int position) {
		if (position>=0 && position<numElements) {
			int count = 0;
			Node temp = this.first;
			while (count<position) {
				temp = temp.next;
				count++;
			}
			return temp;
		}
		else {
			return null;
		}
	}
	
	/*
	 * Returns the object at an index (How does this differ from select a node?)
	 */
	public Object get(int position)  {
		Node res = select(position);
		if (res != null)
			return res.data;
		return null;
	}
	
	/*
	 * Adds an object to the end.
	 */
	public void add(Object element) {
		if (element == null)
			return;
		Node newNode = new Node();
		newNode.data = element;
		if (this.first == null) {
			this.first = newNode;
		} else {
			this.last.next = newNode;
		}
		this.last = newNode;
		this.numElements++;
	}
	
	/*
	 * Adds an object at desired index
	 */
	public boolean add(Object element, int position) {
		if (position>=0 && position<=numElements && element != null) {
			Node newNode = new Node();
			newNode.data = element;
			if (position==0) {
				// add at start
				newNode.next = this.first;
				this.first = newNode;
				if (this.last == null) {
					this.last = this.first;
				}
			}
			else if (position == numElements) {
				// add at end
				add(element);
			}
			else {
				// add in the middle
				Node temp = select(position-1);
				newNode.next = temp.next;
				temp.next = newNode;
			}
			this.numElements++;
			return true;
		}
		return false;
	}

	/*
	 * Removes from end
	 */
	public Object remove() {
		if (numElements == 0) {
			return null;
		}
		Object res = this.last.data;
		if (numElements == 1) {
			this.first = null;
			this.last = null;
		} else {
			Node temp = select(numElements-2);
			this.last = temp;
			this.last.next = null;
		}
		this.numElements--;
		return res; // may be null;
	}
	
	/*
	 * Removes given index
	 */
	public Object remove(int position) {
		if (numElements == 0  || position<0 || position>=numElements) {
			return null;
		}
		Object res;
		if (position == 0) {
			// remove from start
			res = this.first.data;
			this.first = this.first.next;
			if (this.first == null)
				this.last = null;
		}
		else if (position == numElements-1) {
			// remove from end
			res = remove();
		}
		else {
			// remove from the middle
			Node previous = select(position - 1);
			Node target = previous.next;
			previous.next = target.next;
			res = target.data;
		}
		this.numElements--;
		return res;
	}
	
	/*
	 * Returns list as string
	 */
	public String toString() {
		String res = "";
		res += "[";
		if (first == null) {
			res += "empty";
		} else {
			Node element = this.first;
			while (element != null) {
				res += element.data.toString();
				if (element.next != null) {
					res += ",";
				}
				element = element.next;
			}
		}
		res += "]";
		return res;
	}
}
