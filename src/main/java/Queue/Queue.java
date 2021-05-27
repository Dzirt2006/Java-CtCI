package Queue;

import java.util.NoSuchElementException;

public class Queue<T> {
	private static class QNode<T> {
		private T data;
		private QNode<T> next;

		public QNode(T data) {
			this.data = data;
		}
	}

	private QNode<T> first;
	private QNode<T> tail;

	public void add(T item) {
		QNode<T> tData = new QNode<T>(item);
		if (tail != null) {
			tail.next = tData;
		}
		tail = tData;
		if (first == null) {
			first = tail;
		}
	}

	public T remove() {
		if (first == null)
			throw new NoSuchElementException();
		T data = first.data;
		first = first.next;
		if (first == null) {
			tail = null;
		}
		return data;
	}
	
	public T peek() {
		if(first==null) throw new NoSuchElementException();
		return first.data;
	}
}
