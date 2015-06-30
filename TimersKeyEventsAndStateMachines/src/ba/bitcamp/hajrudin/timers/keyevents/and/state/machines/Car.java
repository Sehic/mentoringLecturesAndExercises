package ba.bitcamp.hajrudin.timers.keyevents.and.state.machines;

import java.awt.Color;
import java.awt.Graphics;

public class Car {
	private Color c;
	private int x;
	private int y;
	
	public Car(int x, int y, Color c){
		this.x=x;
		this.y=y;
		this.c=c;
	}
	
	public void drawCar(Graphics g){
		g.setColor(c);
		g.fillRect(x, y, 40, 60);
	}
	
	public void moveLeft(){
		x-=5;
	}
	
	public void moveRight(){
		x+=5;
	}
}
