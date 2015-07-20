package ba.bitcamp.hajrudin.writing.generic.classes.and.methods;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Queue<E> extends LinkedList<E>{

	private static final long serialVersionUID = -735221416876693247L;

	public void enqueue(E s) {
		this.addFirst(s);
	}

	public E dequeue() {
		return this.removeLast();
	}
	
	public void enqueAll(Collection<? extends E> elements){
		Iterator<? extends E> it = elements.iterator();
		while(it.hasNext()){
			this.enqueue(it.next());
		}
	}
	
	public void dequeueTo(Queue<E> target){
		while(size()>0){
			target.enqueue(this.dequeue());
		}
	}

	public static void main(String[] args) {
		Queue<Integer> inte = new Queue<Integer>();
		inte.enqueue(1);
		inte.enqueue(3);
		inte.enqueue(5);
		for (int i = 0; i < 3; i++) {
			//System.out.println(inte.dequeue());
		}
		
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(7);
		nums.add(9);
		nums.add(11);
		
		inte.enqueAll(nums);
		
		System.out.println(inte);
		
		Queue<Number> num = new Queue<Number>();
		num.add(1);
		num.add(11L);
		num.add(13.33);
		
		System.out.println(num);
		
		
	}
}
