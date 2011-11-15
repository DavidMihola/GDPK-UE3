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
}

