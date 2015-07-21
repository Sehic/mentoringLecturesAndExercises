package ba.bitcamp.hajrudin.homework22.task01;

public class LinkedListBoolean {

	private Node start;

	public LinkedListBoolean() {
		start = null;
	}

	public void add(boolean value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node last = getLast();
			last.next = new Node(value);
		}
	}

	public void remove(int index) {
		Node tmp = start;
		for (int i = 0; i < index; i++) {
			tmp = tmp.next;
		}
		Node tmp1 = start;
		for (int i = 0; i < index + 1; i++) {
			tmp1 = tmp1.next;
		}
		tmp.next = tmp1;
	}

	public void remove(boolean value) {
		Node tmp = start;
		int count = 0;
		boolean temp = false;
		while (tmp.next != null) {
			count++;
			if (tmp.equals(value)) {
				temp = true;
				break;
			}
		}
		if (temp) {
			this.remove(count);
		} else {
			System.out.println("ERROR");
		}

	}
	
	public boolean contains(boolean value){
		Node tmp = start;
		while(tmp.next != null){
			if(tmp.value == value){
				return true;
			}
		}
		return false;
	}
	
	public boolean isAlternating(){
		Node tmp = start;
		boolean value = tmp.value;
		while(tmp.next != null){
			tmp = tmp.next;
			if(value == tmp.value){
				return false;
			}
		}
		return true;
	}

	private Node getLast() {
		Node tmp = start;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		return tmp;
	}

	class Node {
		boolean value;
		Node next;

		public Node(boolean value) {
			this.value = value;
			this.next = null;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}

	}
}
