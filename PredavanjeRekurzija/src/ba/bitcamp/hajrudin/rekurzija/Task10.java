package ba.bitcamp.hajrudin.rekurzija;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class Task10 {
public static int m = 100;
public static int a = 5;
public static int b = 5;
	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();

		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		drawLine(450,10,450,50,0, g);
		w.setImage(img);

	}

	public static void drawLine(int x1, int y1, int x2, int y2, int n, Graphics g) {
		if (n == 22) {
			return;
		}
		
		
		g.drawLine(x1,y1,x2,y2);
		n+=1;
		x1=x2;
		y1=y2;
		a+=1;
		b+=1;
		g.setColor(Color.GRAY);
		drawLine(x1,y1,x2-x1/8,y2+y1/8,n, g);
		g.setColor(Color.DARK_GRAY);
		drawLine(x1,y1,x2+x1/14,y2+y1/14,n, g);
		
		
		
		m-=2;
		
	}

}