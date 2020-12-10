package week7;

public class Student extends Person implements Friendly {
	private int sNumber;
	private static int nextNumber = 1;
	private Status stuStatus;
	
	public Student(String name, String address) {
		super(name, address);
		stuStatus = Status.UNREGISTERED;
		this.sNumber = nextNumber;
		nextNumber++;
	}
	
	public int getNumber() {
		return sNumber;
	}
	
	public Status getStatus() {
		return stuStatus;
	}
	
	public String getDetails() {
		String result = "";
		result += "[" + stuStatus + "] ";
		result += "Number : " + sNumber + ", ";
		result += super.getDetails();
		return result;
	}
	
	public String sayHello() {
		return "Hello";
	}
	
	public String sayGoodbye() {
		return "Goodbye";
	}
	
	public void updateStatus(Status stat) {
		this.stuStatus = stat;
	}
	
}
