package ba.bitcamp.hajrudin.threads.exercise;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ServerGUI extends JFrame {
	private static final long serialVersionUID = 4705763879186549158L;

	private JPanel mainPanel = new JPanel();
	private JLabel[][] labels = new JLabel[5][7];
	private int m = 0;
	private int n = 0;

	public ServerGUI() {

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

			setTitle("SeLver");
			setSize(800, 600);
			setResizable(false);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
	}
	

	public void paint(int m, int n) {
		labels[m][n].setBackground(Color.WHITE);
		labels[m][n].setOpaque(true);
	}

	public void paintNew(int m, int n) {
		labels[m][n].setBackground(Color.BLACK);
		labels[m][n].setOpaque(true);
	}

	//public static void main(String[] args) {
	//	new ServerGUI();
	//}
}
