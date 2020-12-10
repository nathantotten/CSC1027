package week4;

public class EnumDemo {

	enum Day {
		Sunday(1), Monday(2), Tuesday(3), Wednesday(4), Thursday(5), Friday(6), Saturday(7);
		
		private int dayValue;
		private String dayNames[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
										"Friday", "Saturday"};
		private Day(int i) {
			dayValue = i;
		}
		public int getValue() {
			return dayValue;
		}
		public String getName() {
			return dayNames[dayValue-1];
		}
	}
	public static void main(String[] args) {
		Day today = Day.Monday;
		System.out.println("Day Value:" + today.getValue() + " Name:"+today.getName());

	}

}
