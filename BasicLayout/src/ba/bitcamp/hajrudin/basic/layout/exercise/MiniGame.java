package ba.bitcamp.hajrudin.basic.layout.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class MiniGame extends JFrame {
	private static final long serialVersionUID = 694570934410006456L;

	private JPanel mainPanel = new JPanel();

	private JPanel loginPanel = new JPanel();
	private JPanel hintPanel = new JPanel();
	private JTextArea hintText = new JTextArea(
			"Da bi pokrenuli igricu \n potrebno je da unesete Vas nick. \n Zatim pritisnite dugme \n START GAME! \n Uputstva za igranje: \n Pomocu tipki krecete se \n desno/lijevo. \n Tipka space sluzi \n za pucanje.");
	private JPanel login = new JPanel();
	private JTextField nameText = new JTextField(17);
	private JButton startGameButton = new JButton("ENTER GAME");

	private JPanel gamePanel = new JPanel();
	private JPanel infoPanel = new JPanel();
	private JLabel lifesLabel = new JLabel("Lifes: ");
	private JLabel scoreLabel = new JLabel("Score: ");
	private JLabel levelLabel = new JLabel("Level: ");
	private JButton showScoresButton = new JButton("Show scores");
	
	private MyPanel game = new MyPanel();
	private Tank myTank = new Tank(800/2, 600-115, Color.BLUE);
	private Tank newTank = new Tank(800/2, 0, Color.RED);
	private JLabel playLabel = new JLabel();
	private Bullet bullet = new Bullet(0, 0, Color.BLACK);
	private Timer t1 = new Timer(1000, new Shot());
	
	
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
		startGameButton.addActionListener(new StartButtonAction());
		
		mainPanel.add(gamePanel, BorderLayout.CENTER);
		
		gamePanel.setLayout(new BorderLayout());
		
		gamePanel.setVisible(false);
		gamePanel.add(infoPanel, BorderLayout.NORTH);
		infoPanel.setLayout(new GridLayout(1, 4));
		infoPanel.add(lifesLabel);
		infoPanel.add(scoreLabel);
		infoPanel.add(levelLabel);
		infoPanel.add(showScoresButton);
		showScoresButton.addActionListener(new ShowScoresButton());
		
		
		gamePanel.add(game, BorderLayout.CENTER);
		playLabel.setText("KLICK TO PLAY");
		game.add(playLabel);
		game.addKeyListener(new MyTankControl());
		game.addMouseListener(new MyTankMouse());
		game.addFocusListener(new MyTankFocus());
		
		Timer t = new Timer(1000, new AnimatedTank());
		t.start();
		
		
		setTitle("Mini Game");
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class AnimatedTank implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		newTank.riseY(5);
		if (newTank.getY() > 485) {
			newTank.setY(0);
			newTank.setX((int) (Math.random() * 800));
		}
		game.repaint();
	}
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 193885030828890505L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			myTank.drawTank(g);
			newTank.drawTank(g);
			bullet.drawBullet(g);
		}
	} 
	
	private class MyTankControl extends KeyAdapter{
	
		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				myTank.moveLeft();
			}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				myTank.moveRight();
			}else if(e.getKeyCode() == KeyEvent.VK_SPACE){
				t1.start();
			}
			game.repaint();
		}
		
	}
	
	private class Shot implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			bullet.setX(50);
			bullet.setY(50);
			game.repaint();
		}
		}
	
	private class MyTankMouse extends MouseAdapter{
			public void mousePressed(MouseEvent evt) {
				playLabel.setText("");
				game.requestFocus();
			}
		}
	
	private class MyTankFocus extends FocusAdapter{
		public void focusGained(FocusEvent evt) {
			game.repaint();
		}
		public void focusLost(FocusEvent evt) {
			game.repaint();
		}
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
	
	private class StartButtonAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			TextIO.readFile("src/ba/bitcamp/hajrudin/basic/layout/exercise/gameFile.txt");
			String s = "";
			while(!TextIO.eof()){
				s+=TextIO.getln();
				s+=",";
			}
			s+=nameText.getText();
			String []arr = s.split(",");
			TextIO.writeFile("src/ba/bitcamp/hajrudin/basic/layout/exercise/gameFile.txt");
			for(int i = 0; i<arr.length; i++){
				TextIO.putln(arr[i]);
			}
			gamePanel.setVisible(true);
		}
		
	}
	
	private class ShowScoresButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			TextIO.readFile("src/ba/bitcamp/hajrudin/basic/layout/exercise/gameFile.txt");
			String s = "";
			while(!TextIO.eof()){
				s+=TextIO.getln();
				s+="\n";
			}
			JOptionPane.showMessageDialog(null, s);
		}
		
	}

	public static void main(String[] args) {
		new MiniGame();
	}
}
