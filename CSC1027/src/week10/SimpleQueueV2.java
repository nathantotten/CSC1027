package week10;

public class SimpleQueueV2 {
	private Object data[];				// to hold an array of Object
	private static int DEFAULT_SIZE = 10;
	private int capacity;
	private int count;
	private int head;
	private int tail;

	public SimpleQueueV2() {
		data = new Object[DEFAULT_SIZE];
		capacity = DEFAULT_SIZE;
		count = 0;
		head = 0;
		tail = 0;
	}
	
	public SimpleQueueV2(int size) {
		if ( size > 0 ) {
			capacity = size;
		}
		else {
			capacity = DEFAULT_SIZE;
		}
		data = new Object[size];
		count = 0;
		head = 0;
		tail = 0;
	}

	public Object peek() {
		if (isEmpty())
			return null;
		return data[head];
	}
	
	public boolean enqueue(Object obj) {
		if (obj != null && count<capacity) {
			if (!isEmpty()) {
				if (tail+1<capacity) {
					tail++;
				}
				else {
					tail = 0;
				}
			}
			data[tail] = obj;
			count++;
			return true;
		}
		return false;
	}

	public Object dequeue() {
		Object res = null;
		if ( !isEmpty() ) {
			res = data[head];
			data[head] = null;
			if (head+1 < capacity) {
				head++;
			}
			else {
				head = 0;
			}
			count--;
		}
		return res;
	}

	public boolean isEmpty() {
		return count == 0;
	}
	
	public String display() {
		String res = "";
		res+="[";
		if ( isEmpty() ) {
			res+="Empty Queue";
		}
		else {
			res += data[0];
			for(int index=1;index<capacity;index++) {
				res += ", " + data[index];
			}
		}
		res+="]";
		return res;
	}
}
