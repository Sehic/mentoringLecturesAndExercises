package ba.bitcamp.hajrudin.threads.exercise;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientGUI extends JFrame {
	private static final long serialVersionUID = 4705763879186549158L;

	private JPanel mainPanel = new JPanel();
	private JLabel[][] labels = new JLabel[5][7];
	private int m = 0;
	private int n = 0;

	public ClientGUI() {

		mainPanel.setLayout(new GridLayout(5, 7));
		mainPanel.setBackground(Color.WHITE);
		this.add(mainPanel);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				labels[i][j] = new JLabel();
				mainPanel.add(labels[i][j]);
			}
		}
			paintNew(m, n);
			
			mainPanel.setFocusable(true);
			mainPanel.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e){
					
					super.keyPressed(e);
					if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						if (n - 1 < 0) {
							System.out.println("ERROR");
						} else {
							paint(m, n);
							n--;
							paintNew(m, n);
						}
					} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						if (n + 1 > 6) {
							System.out.println("ERROR");
						} else {
							paint(m, n);
							n=n+1;
							paintNew(m, n);
						}
					} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
						if (m + 1 > 4) {
							System.out.println("ERROR");
						} else {
							paint(m, n);
							m++;
							paintNew(m, n);
						}
					} else if (e.getKeyCode() == KeyEvent.VK_UP) {
						if (m - 1 < 0) {
							System.out.println("ERROR");
						} else {
							paint(m, n);
							m--;
							paintNew(m, n);
						}
					}
				}
			});

			setTitle("Client");
			setSize(800, 600);
			setResizable(false);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
	}
	
	
	

	public int getM() {
		return m;
	}




	public void setM(int m) {
		this.m = m;
	}




	public int getN() {
		return n;
	}




	public void setN(int n) {
		this.n = n;
	}




	public void paint(int m, int n) {
		labels[m][n].setBackground(Color.WHITE);
		labels[m][n].setOpaque(true);
	}

	public void paintNew(int m, int n) {
		labels[m][n].setBackground(Color.BLACK);
		labels[m][n].setOpaque(true);
	}

	public static void main(String[] args) {
		new ClientGUI();
	}
}
