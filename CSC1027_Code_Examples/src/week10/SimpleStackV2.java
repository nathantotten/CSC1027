package week10;

public class SimpleStackV2 {
	private Object myList[];
	private int count;
	private int maxSize;
	
	public SimpleStackV2(int size) {
		if ( size > 0 ) {
			this.maxSize = size;
		}
		else {
			this.maxSize = 10;
		}
		this.myList = new Object[maxSize];
		this.count = 0;
	}
	
	public boolean push(Object obj) {
		if ( this.count == this.maxSize || obj == null ) {
			return false;
		}
		
		this.myList[count] = obj ;
		this.count++;
		return true;
	}
	
	public Object pop() {
		Object result = null;
		if ( this.count > 0 ) {
			this.count--;
			result = this.myList[count];
		}
		return result;
	}
	
	public String toString() {
		String stkData = "";
		if ( count == 0) {
			stkData += "\t(No Data)\n";
		}
		else {
			for(int index = count-1;index>=0;index--) {
				stkData += "\t"+myList[index].toString()+" ";
				if ( index==count-1) {
					stkData += "<---- Top";
				}
				stkData +="\n";
			}
		}
		stkData += "------------ (count:"+count+")\n";
		return stkData;
	}
}
