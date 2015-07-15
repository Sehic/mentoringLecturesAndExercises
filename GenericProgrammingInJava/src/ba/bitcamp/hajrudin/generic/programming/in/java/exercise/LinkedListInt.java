package ba.bitcamp.hajrudin.generic.programming.in.java.exercise;

import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

public class LinkedListInt implements Collection<LinkedListInt> {
	private Node head;
	private int count;

	public void push(int value) {
		if (head == null) {
			head = new Node(value);
			this.count++;
		} else {
			Node tmp = new Node(value);
			tmp.setNextInt(head);
			head = tmp;
			this.count++;
		}
	}

	public int pop() {
		if (head == null) {
			throw new EmptyStackException();
		}
		int tmp = head.getD();
		head = head.getNextInt();
		this.count--;
		return tmp;
	}

	@Override
	public String toString() {
		return "LinkedListInt \n" + head.toString();
	}

	private class Node {
		private int d;
		private Node nextInt;

		public Node(int d) {
			this.d = d;
		}

		public int getD() {
			return d;
		}

		public Node getNextInt() {
			return nextInt;
		}

		public void setNextInt(Node nextInt) {
			this.nextInt = nextInt;
		}

		@Override
		public String toString() {
			if (nextInt == null) {
				return d + "";
			}
			return d + "\n" + nextInt.toString();
		}

	}

	@Override
	public int size() {
		return this.count;
	}

	@Override
	public boolean isEmpty() {
		if (this.count == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<LinkedListInt> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(LinkedListInt e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends LinkedListInt> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

}
