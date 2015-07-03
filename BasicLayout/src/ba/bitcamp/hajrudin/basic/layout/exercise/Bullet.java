package ba.bitcamp.hajrudin.basic.layout.exercise;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet {
	private Color c;
	private int x;
	private int y;

	public Bullet(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
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

	public void drawBullet(Graphics g) {
		g.setColor(c);
		g.fillRect(x, y, 7, 7);
	}
}
