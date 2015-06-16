package ba.bitcamp.hajrudin.programming.with.objects;

public class Point {
	private double coordinateX;
	private double coordinateY;
	
	public Point(double coordinateX, double coordinateY) {
		super();
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}

	public double getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(double coordinateX) {
		this.coordinateX = coordinateX;
	}

	public double getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(double coordinateY) {
		this.coordinateY = coordinateY;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(coordinateX) != Double
				.doubleToLongBits(other.coordinateX))
			return false;
		if (Double.doubleToLongBits(coordinateY) != Double
				.doubleToLongBits(other.coordinateY))
			return false;
		return true;
	}

	public double getDistance(Point p){
		if(p.equals(this)==true){
			return 33;
		}
		return Math.sqrt(Math.pow(this.coordinateX-p.coordinateX,2))+(Math.pow(this.coordinateY-p.coordinateY,2));
	}
	
	
	public String toString() {
		String s = "";
		s = "Coordinate x: "+coordinateX+"\n";
		s+= "Coordinate y: "+coordinateY+"\n";
		return s;
	}
	
	
	
	
	
}
