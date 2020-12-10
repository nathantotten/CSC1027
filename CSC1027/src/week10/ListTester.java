package week10;

public class ListTester {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.add("One",0);
		myList.add("Two");
		myList.add("Three");
		myList.add("Four");
		myList.add("Five");
		
		while(myList.size() > 0) {
			String str = (String)myList.remove();
			System.out.println("Removed: "+str);
			System.out.println(myList);
		}
		
		String str = (String)myList.remove(0);
		
		//myList.remove(0);
		//System.out.println(myList);
		//myList.add("One",0);

		/*
		for(int pos=0;pos<myList.size();pos++) {
			String str = (String)myList.get(pos);
			System.out.println(str);
		}
		*/
	}

}
