package ba.bitcamp.hajrudin.programming.with.objects;

public class Circle {
	private Point a;
	private double radius;
	
	public Circle(Point a, double radius) {
		this.a = a;
		this.radius = radius;
	}
	
	public void intersect(Circle c1){
		if(c1.a.getDistance(this.a)>this.radius+c1.radius){
			System.out.println("NO");
		}else {
		System.out.println("YES");
		}
	}
	
	
}
