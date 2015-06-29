package ba.bitcamp.hajrudin.graphics.and.painting.and.mouse.events;

import java.awt.Color;

public class Point {
	private int x;
	private int y;
	private Color color;
	private int weight;
	
	public Point(int x, int y, Color color,int weight){
		this.x=x;
		this.y=y;
		this.weight=weight;
		this.color=color;
	}

	
	
	
	public int getWeight() {
		return weight;
	}




	public void setWeight(int weight) {
		this.weight = weight;
	}




	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
