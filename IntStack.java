public class IntStack {
	private Node head = null;

	public void push(int n) {
		head = new Node(n, head);
	}

	public int pop() {
		int n = head.getValue();
		head = head.getNext();
		return n;
	}

	public boolean isEmpty() {
		return head == null;
	}

	void plus() {
		int a = this.pop();
		int b = this.pop();

		this.push(a + b);
	}

	void neg() {
		this.push(this.pop() * (-1));
	}

	private String toString(Node n) {
		if (n == null)
			return " ]";
		return " , " + n.getValue() + toString(n.getNext());
	}

	public String toString() {
		if (head == null)
			return "[]";

		return "[ " + head.getValue() + toString(head.getNext());
	}

	private boolean equals(Node thisn, Node othern) {
		if (thisn == null && othern == null)
			return true;
		// an diesem Punkt sind auf keinen Fall BEIDE null.
		if (thisn == null || othern == null)
			return false;

		return (thisn.getValue() == othern.getValue()) && equals(thisn.getNext(), othern.getNext());
	}

	public boolean equals(IntStack other) {
		if (this == other)
			return true;

		return equals(this.head, other.head);
	}
}

