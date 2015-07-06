package ba.bitcamp.hajrudin.mini.game;

import java.awt.BorderLayout;
import java.awt.Font;
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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
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
	protected static JTextField nameText = new JTextField(17);
	private JButton startGameButton = new JButton("ENTER GAME");

	private JPanel gamePanel = new JPanel();
	private JPanel infoPanel = new JPanel();
	private JLabel lifesLabel = new JLabel("Lifes: 3");
	private static JLabel scoreLabel = new JLabel("Score: 0");
	private JLabel levelLabel = new JLabel("Level: 1");
	private JButton showScoresButton = new JButton("Show scores");
	
	private int enemySpeed = 5;
	private int mySpeed = 5;
	
	private MyPanel game = new MyPanel();
	//private Tank myTank = new Tank(800/2, 600-115, Color.BLUE);
	//private Tank newTank = new Tank(800/2, 0, Color.RED);
	private JLabel playLabel = new JLabel();
	//private Bullet bullet = new Bullet(0, 0, Color.BLACK);
	private Timer t = new Timer(500, new AnimatedTank());
	private Timer t1 = new Timer(10, new Shot());
	private Timer t2 = new Timer(50, new EnemyShot());
	
	private Rectangle myTank = new Rectangle(800/2, 600-115, 40, 60);
	private Rectangle newTank = new Rectangle(800/2, -70, 40, 60);
	
	private Rectangle myBullet = new Rectangle(myTank.x+15, myTank.y,10,10);
	private boolean temp = false;
	
	private Rectangle newBullet = new Rectangle(newTank.x+15, newTank.y+50,10,10);
	private boolean temp1 = false;
	
	private Rectangle speed = new Rectangle((int)(Math.random()*400),-300,20,20);
	private Timer ts = new Timer (300, new AnimatedSpeed());

	private BufferedImage background;
	
	
	
	
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
		Font f = new Font("asd", Font.CENTER_BASELINE, 33);
		playLabel.setFont(f);
		playLabel.setText("KLICK TO PLAY");
		game.add(playLabel);
		game.addKeyListener(new MyTankControl());
		game.addMouseListener(new MyTankMouse());
		game.addFocusListener(new MyTankFocus());
		
		 try {                
	          background = ImageIO.read(new URL("http://i.ytimg.com/vi/irlHtZJl81Q/maxresdefault.jpg"));
	       } catch (IOException ex) {
	            System.out.println("aaaaaaa");
	       }
		 
		 
		
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
		newTank.y = newTank.y+enemySpeed;
		if (newTank.getY() > 485) {
			newTank.y = -70;
			newTank.x = ((int) (Math.random() * 730));
			String arr[] = lifesLabel.getText().split(" ");
			int a = Integer.parseInt(arr[1]);
			a-=1;
			lifesLabel.setText(arr[0]+" "+a);
			if(a==0){
			gameOver();
		}
		}	
		if(newTank.getY()>0){
		t2.start();
		}
		game.repaint();
	}
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 193885030828890505L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(background, game.getX()-30, game.getY()-30, null);
			
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
				
			g.drawRect(speed.x, speed.y, speed.width, speed.height);
			
		}
	} 
	
	private class AnimatedSpeed implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			speed.y+=5;
			if(speed.intersects(myTank)){
				mySpeed+=5;
				speed.y=-700;
			}
			if(speed.y>485){
				speed.y=-700;
			}
			game.repaint();
		}
		
	}
	
	private class MyTankControl extends KeyAdapter{
	
		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				myTank.x-=mySpeed;
				if(myTank.x<=0){
					myTank.x+=mySpeed;
				}
			}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				myTank.x+=mySpeed;
				if(myTank.x>=730){
					myTank.x-=mySpeed;
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
					enemySpeed += 5;
				}
				t2.stop();
				temp1=false;
				newTank.y = -70;
				newTank.x = ((int) (Math.random() * 730));
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
	
	public void gameOver(){
		writeScore();
		ts.stop();
		t.stop();
		t1.stop();
		t2.stop();	
		int tt = JOptionPane.showConfirmDialog(null, "GAME OVER \n "+scoreLabel.getText()+ "\n REPLAY?");
		if(tt == JOptionPane.YES_OPTION){
			lifesLabel.setText("Lifes: 3");
			scoreLabel.setText("Score: 0");
			levelLabel.setText("Level: 1");
			enemySpeed = 5;
			mySpeed = 5;
			myTank.x=800/2; myTank.y=600-115; myTank.width=40; myTank.height=60;
			newTank.x=800/2; newTank.y=-70; newTank.width=40; newTank.height=60;
			myBullet.x=myTank.x+15; myBullet.y=myTank.y; myBullet.width=10; myBullet.height=10;
			temp = false;
			newBullet = new Rectangle(newTank.x+15, newTank.y+50,10,10);
			temp1 = false;
			speed.x = ((int)(Math.random()*400)); speed.y=-300;
			t.start();
			ts.start();
		}else if(tt == JOptionPane.CANCEL_OPTION || tt == JOptionPane.NO_OPTION || tt == JOptionPane.CLOSED_OPTION){
			game.setVisible(false);
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
				gameOver();
				} else {
					newBullet.x=newTank.x+15;
					newBullet.y=newTank.y;
					temp1=false;
					game.repaint();
				}
			}
			if(newBullet.y > 550){
				newBullet.x=newTank.x+15;
				newBullet.y=newTank.y+50;
				temp1=false;
			}
			game.repaint();
		}
		}
	
	private class MyTankMouse extends MouseAdapter{
			public void mousePressed(MouseEvent evt) {
				playLabel.setText("");
				t.start();
				ts.start();
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
	
	public static void writeScore(){
		TextIO.readFile("src/ba/bitcamp/hajrudin/mini/game/gameFile.txt");
			String s = "";
			while(!TextIO.eof()){
				s+=TextIO.getln();
				s+=",";
			}
			String ar[] = scoreLabel.getText().split(" ");
			int a = Integer.parseInt(ar[1]);
			s+=nameText.getText()+" "+a;
			String []arr = s.split(",");
			TextIO.writeFile("src/ba/bitcamp/hajrudin/mini/game/gameFile.txt");
			for(int i = 0; i<arr.length; i++){
				TextIO.putln(arr[i]);
			}
	}
	
	private class StartButtonAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
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
