package week10;

public class StackTestV2 {

	public static void main(String[] args) {
		SimpleStackV2 stk = new SimpleStackV2(5) ;
		
		stk.push("A");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		stk.push("E");
		stk.push("F"); // shouldn't work
		
		System.out.println(stk);
		
		String value = (String)stk.pop();
		while ( value != null ) {
			System.out.println("Value:"+value);
			value = (String)stk.pop();
		}
		
		System.out.println(stk);
	}

	
}
