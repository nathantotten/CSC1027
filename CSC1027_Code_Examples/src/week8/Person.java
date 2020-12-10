package week8;

public class Person implements Comparable {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public int compareTo(Object obj) {
		Person p = (Person)obj;
		String name1 = this.name;
		String name2 = p.getName();
		
		return name1.compareTo(name2);
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDetails() {
		return "Name: " + name + ", Address: " + address;
	}
	
	@Override
	public String toString() {
		return getDetails();
	}
}
