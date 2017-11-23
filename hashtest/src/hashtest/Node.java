package hashtest;

public class Node {
	Object value;
	Node next;

	public Node(Object obj) {
		value = obj;
	}

	public String toString() {
		return next == null ? value.toString() : value + "," + next;
	}
}
