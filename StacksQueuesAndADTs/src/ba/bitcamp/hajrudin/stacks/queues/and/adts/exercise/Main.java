package ba.bitcamp.hajrudin.stacks.queues.and.adts.exercise;

public class Main {
	public static void main(String[] args) {
		StackLinkString s = new StackLinkString();
		s.push("Text1");
		s.push("Text2");
		s.push("Text3");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("Text"));
		s.pop();
		System.out.println(s);
	}
}
