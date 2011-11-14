public class Node {
	private int value;

	private Node next;

	public Node(int initValue, Node initNext) {
		value = initValue;
		next = initNext;
	}

	public int getValue() { 
		return value;
	}
	
	public Node getNext() {
		return next;
	}

}

