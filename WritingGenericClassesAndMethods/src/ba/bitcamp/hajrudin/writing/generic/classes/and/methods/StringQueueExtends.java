package ba.bitcamp.hajrudin.writing.generic.classes.and.methods;

import java.util.LinkedList;

public class StringQueueExtends extends LinkedList<String> {

	private static final long serialVersionUID = -6317717348335731304L;

	public void enqueue(String s) {
		this.addFirst(s);
	}

	public String dequeue() {
		return this.removeLast();
	}

	public static void main(String[] args) {
		StringQueueExtends str = new StringQueueExtends();
		str.enqueue("A");
		str.enqueue("B");
		str.enqueue("C");
		for (int i = 0; i < 3; i++) {
			System.out.println(str.dequeue());
			System.out.println(str.size());
		}
	}
}
