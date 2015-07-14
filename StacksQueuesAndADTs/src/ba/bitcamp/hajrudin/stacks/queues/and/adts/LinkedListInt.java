package ba.bitcamp.hajrudin.stacks.queues.and.adts;

public class LinkedListInt {
	
	class Node {
		int value;
		Node next;
		
		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}
		
		
		
	}
	
	private Node start;
	
	public void addFront(int value){
		Node newNode = new Node();
		newNode.value = value;
		newNode.next=start;
		start = newNode;
	}
	
	
	
	@Override
	public String toString() {
		return "LinkedListInt [start=" + start + "]";
	}



	public static void main(String[] args) {
		LinkedListInt list = new LinkedListInt();
		list.addFront(5);
		list.addFront(7);
		list.addFront(11);
		System.out.println(list.toString());
	}
	
}
