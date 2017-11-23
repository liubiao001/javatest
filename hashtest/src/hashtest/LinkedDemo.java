package hashtest;

public class LinkedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node("1");
		head.next = new Node("2");
		head.next.next = new Node("3");
		head.next.next.next = new Node("4");
		System.out.println(head);

	}

}
