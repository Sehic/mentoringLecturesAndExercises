package ba.bitcamp.hajrudin.programming.with.objects;

public class MainTask2 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10);
		Point p2 = new Point(20, 20);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println("Distance: "+p1.getDistance(p2));
		
		Circle c1 = new Circle(p1, 100);
		Circle c2 = new Circle(p2, 100);
		c1.intersect(c2);
	}

}
