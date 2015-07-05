package ba.bitcamp.hajrudin.mini.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
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

public class Game extends JFrame {
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
	private JLabel lifesLabel = new JLabel("Lifes: 3");
	private JLabel scoreLabel = new JLabel("Score: 0");
	private JLabel levelLabel = new JLabel("Level: 1");
	private JButton showScoresButton = new JButton("Show scores");
	
	private int speed = 5;
	
	private MyPanel game = new MyPanel();
	//private Tank myTank = new Tank(800/2, 600-115, Color.BLUE);
	//private Tank newTank = new Tank(800/2, 0, Color.RED);
	private JLabel playLabel = new JLabel();
	//private Bullet bullet = new Bullet(0, 0, Color.BLACK);
	private Timer t = new Timer(1000, new AnimatedTank());
	private Timer t1 = new Timer(10, new Shot());
	private Timer t2 = new Timer(50, new EnemyShot());
	
	private Rectangle myTank = new Rectangle(800/2, 600-115, 40, 60);
	private Rectangle newTank = new Rectangle(800/2, 0, 40, 60);
	
	private Rectangle myBullet = new Rectangle(myTank.x+15, myTank.y,10,10);
	private boolean temp = false;
	
	private Rectangle newBullet = new Rectangle(newTank.x+15, newTank.y+50,10,10);
	private boolean temp1 = false;
	
	
	
	
	public Game() {

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
		newTank.y = newTank.y+speed;
		if (newTank.getY() > 485) {
			newTank.y = 0;
			newTank.x = ((int) (Math.random() * 800));
		}
		t2.start();
		game.repaint();
	}
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 193885030828890505L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRect(myTank.x, myTank.y, myTank.width, myTank.height);
			
			g.drawRect(newTank.x, newTank.y, newTank.width, newTank.height);
			
			if(temp)
				g.drawRect(myBullet.x, myBullet.y, myBullet.width, myBullet.height);
			else
				g.drawRect(myTank.x+15, myTank.y,10,10);
			
			if(temp1)
				g.drawRect(newBullet.x, newBullet.y, newBullet.width, newBullet.height);
			else
				g.drawRect(newTank.x+15, newTank.y+50,10,10);
				
			
		}
	} 
	
	
	
	private class MyTankControl extends KeyAdapter{
	
		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				myTank.x-=5;
				if(myTank.x<=0){
					myTank.x+=5;
				}
			}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				myTank.x+=5;
				if(myTank.x>=750){
					myTank.x-=5;
				}
			}else if(e.getKeyCode() == KeyEvent.VK_SPACE){
				myBullet.x=myTank.x+15;				
				t1.start();
			}
			game.repaint();
		}
		
	}
	
	private int counter=0;
	
	private class Shot implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			temp=true;
			myBullet.y-=5;
			if(myBullet.intersects(newTank)){
				String arr[] = scoreLabel.getText().split(" ");
				int a = Integer.parseInt(arr[1]);
				a+=5;
				scoreLabel.setText(arr[0]+" "+a);
				counter+=1;
				if(counter == 5){
					counter = 0;
					String ar[] = levelLabel.getText().split(" ");
					int b = Integer.parseInt(ar[1]);
					b+=1;
					levelLabel.setText(ar[0]+" "+b);
					speed += 5;
				}
				t2.stop();
				temp1=false;
				newTank.y = 0;
				newTank.x = ((int) (Math.random() * 750));
				myBullet.y=myTank.y;
				newBullet.x=newTank.x+15;
				newBullet.y=newTank.y+50;
				temp=false;
				t1.stop();
			}
			if(myBullet.y < 0){
				myBullet.y=myTank.y;
				temp=false;
				t1.stop();
			}
			game.repaint();
		}
		}
	
	private class EnemyShot implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			temp1=true;
			newBullet.y+=5;
			if(newBullet.intersects(myTank)){
				String arr[] = lifesLabel.getText().split(" ");
				int a = Integer.parseInt(arr[1]);
				a-=1;
				lifesLabel.setText(arr[0]+" "+a);
				if(a==0){
				JOptionPane.showMessageDialog(null, "GAME OVER");
				t.stop();
				t1.stop();
				t2.stop();
				} else {
					newBullet.x=newTank.x+15;
					newBullet.y=newTank.y;
					temp1=false;
					game.repaint();
				}
			}
			if(newBullet.y > 485){
				newBullet.x=newTank.x+15;
				newBullet.y=newTank.y;
				temp1=false;
				//t2.start();
			}
			game.repaint();
		}
		}
	
	private class MyTankMouse extends MouseAdapter{
			public void mousePressed(MouseEvent evt) {
				playLabel.setText("");
				t.start();
				t2.start();
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
			TextIO.readFile("src/ba/bitcamp/hajrudin/mini/game/gameFile.txt");
			String s = "";
			while(!TextIO.eof()){
				s+=TextIO.getln();
				s+=",";
			}
			s+=nameText.getText();
			String []arr = s.split(",");
			TextIO.writeFile("src/ba/bitcamp/hajrudin/mini/game/gameFile.txt");
			for(int i = 0; i<arr.length; i++){
				TextIO.putln(arr[i]);
			}
			gamePanel.setVisible(true);
		}
		
	}
	
	private class ShowScoresButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			TextIO.readFile("src/ba/bitcamp/hajrudin/mini/game/gameFile.txt");
			String s = "";
			while(!TextIO.eof()){
				s+=TextIO.getln();
				s+="\n";
			}
			JOptionPane.showMessageDialog(null, s);
		}
		
	}

	public static void main(String[] args) {
		new Game();
	}
}
