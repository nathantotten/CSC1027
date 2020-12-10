package week9;

import java.util.ArrayList;

public class TestStorage {

	public static void main(String[] args) {
		//ArrayList<Person> list = createPersonList();
		StorageManager sman = new StorageManager();
		//sman.storePeople(list);
		ArrayList<Person> list2 = sman.restorePeople();
		display(list2);
	}
	
	public static ArrayList<Person> createPersonList() {
		ArrayList<Person> res = new ArrayList<Person>();
		res.add(new Person("Joe", "Bloggs"));
		res.add(new Person("Michael", "Smith"));
		res.add(new Person("Janet", "Price"));
		res.add(new Person("John", "McBride"));
		res.add(new Person("Christine", "Cooper"));
		return res;
	}
	
	public static void display(ArrayList<Person> data) {
		for(Person p : data) {
			System.out.println(p);
		}
	}

}
