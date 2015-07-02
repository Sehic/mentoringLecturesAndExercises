package ba.bitcamp.hajrudin.basic.layout.exercise;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MiniGame extends JFrame {
	private static final long serialVersionUID = 694570934410006456L;

	private JPanel mainPanel = new JPanel();

	private JPanel loginPanel = new JPanel();
	private JPanel hintPanel = new JPanel();
	private JTextArea hintText = new JTextArea(
			"Da bi pokrenuli igricu \n potrebno je da unesete Vas nick. \n Zatim pritisnite dugme \n START GAME! \n Uputstva za igranje: \n Pomocu kursora krecete se \n desno/lijevo. \n Tipka space sluzi \n za pucanje.");
	private JPanel login = new JPanel();
	private JTextField nameText = new JTextField(17);
	private JButton startGameButton = new JButton("START GAME");

	private JPanel gamePanel = new JPanel();

	public MiniGame() {

		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);

		mainPanel.add(loginPanel, BorderLayout.WEST);
		loginPanel.setLayout(new GridLayout(2, 1));

		loginPanel.add(hintPanel);
		hintPanel.setLayout(new BorderLayout());
		hintPanel.setBorder(BorderFactory
				.createTitledBorder("WELCOME TO MINI GAME !!!"));
		hintText.setEditable(false);
		hintPanel.add(hintText, BorderLayout.CENTER);

		loginPanel.add(login);
		login.setLayout(new BorderLayout());
		login.setBorder(BorderFactory.createTitledBorder("ENTER NICKNAME"));
		login.add(nameText, BorderLayout.NORTH);
		startGameButton.setEnabled(false);
		login.add(startGameButton, BorderLayout.CENTER);
		nameText.addKeyListener(new TextAction());

		setTitle("Mini Game");
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class TextAction implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {
			startGameButton.setEnabled(true);
		}
		@Override
		public void keyPressed(KeyEvent e) {}
		@Override
		public void keyReleased(KeyEvent e) {}
	}
	
	

	public static void main(String[] args) {
		new MiniGame();
	}
}
