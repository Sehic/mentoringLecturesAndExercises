package ba.bitcamp.hajrudin.stacks.queues.and.adts.exercise;

public class Main1 {

	public static void main(String[] args) {
		QueueLinkDouble d = new QueueLinkDouble();
		d.add(1);
		d.add(2);
		d.add(3);
		System.out.println(d.toString());
		System.out.println(d.poll());
		System.out.println(d);
		
		
	}

}
