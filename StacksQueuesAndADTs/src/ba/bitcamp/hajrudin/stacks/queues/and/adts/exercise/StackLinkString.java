package ba.bitcamp.hajrudin.stacks.queues.and.adts.exercise;

import java.util.EmptyStackException;

public class StackLinkString {
	private Node head;
	
	public boolean isEmpty(){
		return (head==null);
	}
	
	public void push(String s){
		if (head == null) {
			head = new Node(s);
		} else {
			Node tmp = new Node(s);
			tmp.setNext(head);
			head = tmp;
	}
	}
	
	public String pop(){
		if(head == null){
			throw new EmptyStackException();
		}
		String tmp = head.getString();
		head = head.getNext();
		return tmp;
	}
	
	public String peek(){
		return head.getString();
	}
	
	public int search(String s){
		int count = 1;
		if(head == null){
			return -1;
		}else{
			Node tmp = head;
			while(tmp != null){
				if(tmp.getString().equals(s))
			return count;	
				else {
					count++;
					tmp=tmp.getNext();
				}
			}
			return -1;
		}
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "StackLinkString [head=" + head + "]";
	}




	private class Node {

		private String s;
		private Node next;

		public Node(String s) {
			this.s = s;
			next = null;
		}

		
		public String getString() {
			return s;
		}

		
		public void setString(String s) {
			this.s = s;
		}

		
		public Node getNext() {
			return next;
		}

		
		public void setNext(Node next) {
			this.next = next;
		}

		public String toString() {
			if (next == null) {
				return s + "";
			}
			return s + "\n" + next.toString();
		}
		
		

	}

	
	
	
}
