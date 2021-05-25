package StackQueue;

import java.util.EmptyStackException;

public class Stack<T> {
	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> top;

	public T pop() {
		if (top == null)
			throw new EmptyStackException();
		T data = top.data;
		top = top.next;
		return data;
	}

	public void push(T data) {
		Node<T> tNode = new Node<T>(data);
		tNode.next = top;
		top = tNode;
	}

	public T peek() {
		if (top == null)
			throw new EmptyStackException();
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}
}
