package ba.bitcamp.hajrudin.writing.generic.classes.and.methods.exercise;

import java.util.Collection;
import java.util.Iterator;
		
	public class MyLinkedList<T> {
		
		private Node start;
		private int size;
		
		public MyLinkedList() {
			start = null;
			size = 0;
		}
		
		
		
		@Override
		public String toString() {
			return "MyLinkedList [start=" + start + ", size=" + size + "]";
		}



		public void add(T value) {
			if (start == null) {
				start = new Node(value);
			} else {
				Node last = getLast();
				
				last.next = new Node(value);
			}
			size++;
		}
		
		public void addAtIndex(T element, int index){
			
		}
		
		public void remove(int index){
			Node tmp = start;
			for(int i = 0; i<index; i++){
				tmp = tmp.next;
			}
			Node tmp1 = start;
			for(int i = 0; i<index+1; i++){
				tmp1 = tmp1.next;
			}
			tmp.next=tmp1;
		}
		
		public void addAll(Collection<T> c){
			Iterator<T> it = c.iterator();
			while(it.hasNext()){
				this.add(it.next());
			}
		}
		
		public void remove (T element){
			boolean temp = false;
			int count = 0;
			Node tmp = start;
			while(tmp.next != null){
				count++;
				if(tmp.equals(element)){
					temp = true;
					break;
				}
			}
			if(temp){
				this.remove(count);
			}else{
				System.out.println("ERROR");
			}
			
		}
		
		public int indexOf(T element){
			int count = 0;
			Node tmp = start;
			while(tmp.next != null){
				count++;
				if(tmp.equals(element)){
					return count;
				}
		}
			return -1;
		}
		
		
		public int size() {
			return size;
		}
		
		private Node getLast() {
			Node tmp = start;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			return tmp;
		}
		
		
		class Node {
			T value;
			Node next;
			
			public Node(T value) {
				this.value = value;
				this.next = null;
			}

			@Override
			public String toString() {
				return "Node [value=" + value + ", next=" + next + "]";
			}
			
			
		}
	}
