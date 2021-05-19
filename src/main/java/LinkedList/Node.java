package LinkedList;

public class Node {
	Node next = null;
	int val;

	Node(int d) {
		this.val = d;
	}

	public void addToTail(int d) {
		Node temp = this;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node(d);
	}

	public void printNodes() {
		Node currNode = this;
		while (currNode != null) {
			System.out.print(currNode.val);
			if (currNode.next != null) {
				System.out.print(" -> ");
			}else {
				System.out.println();
			}
				
			currNode = currNode.next;
		}
	}
}
