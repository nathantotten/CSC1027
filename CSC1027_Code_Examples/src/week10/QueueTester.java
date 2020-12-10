package week10;

public class QueueTester {

	public static void main(String[] args) {
		//test1();
		test2();
	}
	
	private static void test1() {
		SimpleQueue myQueue = new SimpleQueue();

		myQueue.enqueue("One");
		myQueue.enqueue("Two");
		myQueue.enqueue("Three");
		myQueue.enqueue("Four");
		myQueue.enqueue("Five");

		System.out.println();
		String str = (String) myQueue.dequeue();
		while (str != null) {
			System.out.println("Removed: " + str + " from the queue.");
			str = (String) myQueue.dequeue();
		}
	}
	
	private static void test2() {
		SimpleQueueV2 myQueue = new SimpleQueueV2(6);

		myQueue.enqueue("One");
		myQueue.enqueue("Two");
		myQueue.enqueue("Three");
		myQueue.enqueue("Four");
		myQueue.enqueue("Five");

		System.out.println(myQueue.display());
		String str = (String) myQueue.dequeue();
		while (str != null) {
			System.out.println("Removed: " + str + "->"+myQueue.display());
			str = (String) myQueue.dequeue();
		}
	}

}
