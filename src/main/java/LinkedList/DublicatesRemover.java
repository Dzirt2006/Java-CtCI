package LinkedList;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DublicatesRemover {

	public void remover(Node n) {
		Set<Integer> set = new HashSet<Integer>();
		Node prevNode = n;
		Node currNode = n;
		while (currNode != null) {
			Node nextNode = currNode.next;
			if (set.contains(currNode.val)) {
				prevNode.next = nextNode;
			} else {
				set.add(currNode.val);
				prevNode = currNode;
			}
			currNode = nextNode;
		}
	}

	@Test
	private void t() {
		Node lList = new Node(2);
		int[] arr = { 3, 1, 15, 8, 2, 5, 6, 15, 3, 7, 8 };
		for (int i : arr) {
			lList.addToTail(i);
		}
		remover(lList);
		lList.printNodes();
	}
}
