package ba.bitcamp.hajrudin.basic.layout.exercise;

import java.awt.Color;
import java.awt.Graphics;

public class Tank {
	
	

		private Color c;
		private int x;
		private int y;
		
		public Tank(int x, int y, Color c){
			this.x=x;
			this.y=y;
			this.c=c;
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



		public void riseY(int y) {
			this.y += y;
		}
		
		public void setY(int y){
			this.y=y;
		}



		public void drawTank(Graphics g){
			g.setColor(c);
			g.fillRect(x, y, 40, 60);
		}
		
		public void moveLeft(){
			x-=5;
			if(x<=0){
				x+=5;
			}
		}
		
		public void moveRight(){
			x+=5;
			if(x>=730){
				x-=5;
			}
		}
	}

