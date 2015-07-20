package ba.bitcamp.hajrudin.writing.generic.classes.and.methods;

import java.util.LinkedList;

public class StringQueue {
	private LinkedList<String> s;

	public StringQueue() {
		this.s = new LinkedList<String>();
	}

	public void add(String s) {
		this.s.addFirst(s);
	}

	public String remove() {
		return this.s.removeLast();
	}

	public int size() {
		return s.size();
	}

	public static void main(String[] args) {
		StringQueue str = new StringQueue();
		str.add("A");
		str.add("B");
		str.add("C");
		for (int i = 0; i < 3; i++) {
			System.out.println(str.remove());
			System.out.println(str.size());
		}
	}
}
