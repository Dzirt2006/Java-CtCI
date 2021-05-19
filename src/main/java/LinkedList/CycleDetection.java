package LinkedList;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class CycleDetection {

	public Node loopDetector(Node node) {
		Set<Node> set = new HashSet<Node>();
		while (node != null) {
			if (set.contains(node.next)) {
				return node.next;
			}
			set.add(node);
			node = node.next;
		}
		return null;
	}

	@Test
	private void t() {
		Node lList = new Node(2);
		int[] arr = { 3, 1, 15, 3, 4, 54, 0, 398, 8, 2, 5 };
		Node storage = null;
		for (int i : arr) { // create loop in a list
			Node tempNode = lList.addToTail(i);
			if (i == 15) {
				storage = tempNode;
			}
			if (i == 5) {
				tempNode.next = storage;
			}
		}
		System.out.println(loopDetector(lList).val);
	}
}
