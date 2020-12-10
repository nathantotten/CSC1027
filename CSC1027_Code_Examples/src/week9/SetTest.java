package week9;

public class SetTest {

	private static void testCase1() {
		// TC1: display() - empty set

	}

	private static void testCase2() {
		// TC2: display() - non-empty set
	}

	private static void testCase3() {
		// TC3: equals() - 2 identical sets
	}
	
	private static void testCase4() {
		// TC4: equals() - 2 different sets
	}
	
	private static void testCase5() {
		// TC5: union() - 2 disjoint sets
	}
	
	private static void testCase6() {
		// TC6: union() - 2 identical sets
	}
	
	private static void testCase7() {
		// TC7: union() - 2 sets with some common values
	}
	
	private static void testCase8() {
		// TC8: intersection() - 2 disjoint sets
	}
	
	private static void testCase9() {
		// TC9: intersection() - 2 identical sets
	}
	
	private static void testCase10() {
		// TC10: intersection() - 2 sets with common values
	}
	
	private static void testCase11() {
		// TC11: isEmpty() - an empty set
	}
	
	private static void testCase12() {
		// TC12: isEmpty() - a non-empty set
	}
	
	private static void testCase13() {
		// TC13: add() - add to an empty set
	}
	
	private static void testCase14() {
		// TC14: add() - add to a full set
	}
	
	private static void testCase15() {
		// TC15: add() - add value that’s already present
	}
	
	public static void main(String[] args) {
		testCase1();
		testCase2();
		testCase3();
		testCase4();
		testCase5();
		testCase6();
		testCase7();
		testCase8();
		testCase9();
		testCase10();
		testCase11();
		testCase12();
		testCase13();
		testCase14 ();
	}

	private static IntegerSet createEmptySet() {
		IntegerSet iSet = new IntegerSet(10);
		return iSet;
	}

	private static IntegerSet createFullSet() {
		IntegerSet iSet = new IntegerSet(10);
		for (int count = 1; count <= 10; count++) {
			iSet.add(count);
		}
		return iSet;
	}

}
