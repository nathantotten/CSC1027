package week9;

public class IntegerSet {
	private int data[];
	private int numElements;
	private int maxSize;
	private static final int DEFAULT_SIZE = 20;

	public IntegerSet(int size) {
		if (size > 0) {
			data = new int[size];
			maxSize = size;
		}
		else {
			data = new int[DEFAULT_SIZE];
			maxSize = DEFAULT_SIZE;
		}
		numElements = 0;
	}

	public boolean contains(int target) {
		int start = 0;
		int end = numElements - 1;
		int pivot;
		do {
			pivot = start + ((end - start) / 2);
			if (data[pivot] == target) {
				return true;
			}
			if (data[pivot] > target) {
				end = pivot - 1;
			} else {
				start = pivot + 1;
			}
		} while (start <= end);
		return false;
	}

	public void add(int value) {
		if ( !contains(value) ) {
			boolean ok = insert(value, data, numElements);
			if (ok)
				numElements++;
		}
	}

	public int getNumElements() {
		return numElements;
	}

	public boolean isEmpty() {
		return numElements == 0;
	}
	
	public IntegerSet intersection(IntegerSet iSet) {
		IntegerSet res = new IntegerSet(maxSize);
		if (iSet != null) {
			for(int i=0; i<numElements; i++) {
				if (iSet.contains(data[i])) {
					res.add(data[i]);
				}
			}
		}
		return res;
	}
	
	private int getElement(int index) throws Exception {
		if (index>=0 && index<numElements) {
			return data[index];
		}
		else {
			throw new Exception("No such set element.");
		}
	}
	
	public IntegerSet union(IntegerSet iSet) {
		IntegerSet res = new IntegerSet(numElements+iSet.getNumElements());
		for(int i=0;i<numElements;i++) {
			res.add(data[i]);
		}
		if (iSet != null) {
			for(int i=0; i<iSet.getNumElements(); i++) {
				try {
					res.add(iSet.getElement(i));
				}
				catch(Exception ex) {
					return null;
				}
			}
		}
		return res;
	}

	public boolean equals(IntegerSet iSet) {
		if ( iSet == null ) {
			return false;
		}
		return toString().equals(iSet.toString());
	}
	
	private boolean insert(int value, int data[], int count) {
		// validate
		if (data != null && count>=0 && count < data.length) {
			if (count == 0) {
				data[0] = value;
				return true;
			}
			// find insert position
			int index, position;
			for(index=0;index<count;index++) {
				if (data[index]>value) {
					break;
				}
			}
			position = index;
			// shuffle values if required
			for(index = count; index>position; index--) {
				data[index] = data[index-1];
			}
			// insert the value
			data[position] = value;
			return true;
		}
		else {
			return false;
		}
	}
	
	private String display() {
		String res = "";
		if ( !isEmpty() ) {
			res += "[";
			for( int index=0; index<numElements-1; index++) {
				res += data[index] + ", ";
			}
			res += data[numElements-1]+"]";
		}
		else {
			res += "No data to display.";
		}
		return res;
	}
	
	@Override
	public String toString() {
		return display();
	}

}
