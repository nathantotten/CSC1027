package week8;

public enum Status {
	UNREGISTERED(0), UNDERGRADUATE(1), GRADUATE(2);
	
	private int statIntValue;
	private String info[] = {"Status: Unregistered", 
			                 "Status: Undergraduate",
			                 "Status: Graduate"};
	
	private Status(int value) {
		statIntValue = value;
	}
	
	public String getStatus() {
		return info[statIntValue];
	}
	
	@Override
	public String toString() {
		return getStatus();
	}
	
}
