package ba.bitcamp.hajrudin.stacks.queues.and.adts.exercise;

public class QueueLinkDouble {
	private Node head;
	private Node end;
	
	public void add(double d){
		if (this.head == null) {
			this.head = new Node(d);
			this.end = new Node(d);
		} else {
			Node n = new Node(d);
			if(head.getNextDouble() == null){
				head.setNextDouble(n);
			}
			end.setNextDouble(n);
			end=n;
		}
	}
	
	public double poll(){
		if(head == null){
			return -1;
		} else {
			double d = head.getD();
			head = head.getNextDouble();
			return d;
		}
	}
	
	@Override
	public String toString() {
		return "QueueLinkDouble \n" + head.toString();
	}



	private class Node{
		private double d;
		private Node nextDouble;
		
		public Node(double d){
			this.d=d;
		}
		
		public double getD() {
			return d;
		}
		public void setD(double d) {
			this.d = d;
		}
		public Node getNextDouble() {
			return nextDouble;
		}
		public void setNextDouble(Node nextDouble) {
			this.nextDouble = nextDouble;
		}
		@Override
		public String toString() {
		if(nextDouble==null){
			return d + "";
		}
				return d + "\n" + nextDouble.toString();
		}
		
		
		
	}
}
