package ba.bitcamp.hajrudin.mini.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
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
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

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
			"To start the game you need \n to enter your nickname. \n Then press \n ENTER THE GAME! \n Instructions for playing: \n Using the buttons you move to \n left/right. \n Button Space uses \n to shoot. \n For every passed level \n speed of the opponent is increased. \n After a while, \n arrives bonus for you, \n so be careful to catch it.");
	private JPanel login = new JPanel();
	protected static JTextField nameText = new JTextField(17);
	private JButton startGameButton = new JButton("ENTER GAME");
	private JButton gitButton = new JButton("GIT");

	private JPanel gamePanel = new JPanel();
	private JPanel infoPanel = new JPanel();
	private JLabel lifesLabel = new JLabel("Lifes: 3");
	private static JLabel scoreLabel = new JLabel("Score: 0");
	private JLabel levelLabel = new JLabel("Level: 1");
	private JButton showScoresButton = new JButton("Show scores");

	private int enemySpeed = 5;
	private int mySpeed = 5;
	private int bulletSpeed = 5;

	private MyPanel game = new MyPanel();

	private JLabel playLabel = new JLabel();

	private Timer t = new Timer(400, new AnimatedTank());
	private Timer t1 = new Timer(10, new Shot());
	private Timer t2 = new Timer(50, new EnemyShot());

	private Rectangle myTank = new Rectangle(800 / 2, 600 - 115, 60, 60);
	private Rectangle newTank = new Rectangle(800 / 2, -70, 60, 60);

	private Rectangle myBullet = new Rectangle(myTank.x + 23, myTank.y, 15, 15);
	private boolean temp = false;

	private Rectangle newBullet = new Rectangle(newTank.x + 23, newTank.y + 55,
			15, 15);
	private boolean temp1 = false;

	private Rectangle speed = new Rectangle((int) (Math.random() * 400), -300,
			20, 21);
	private Timer ts = new Timer(300, new AnimatedSpeed());

	private Font f = new Font("SERIF", Font.BOLD, 20);
	private Color c = new Color(134, 128, 118);
	private Color c1 = Color.GRAY;
	private Color c2 = Color.GRAY;

	private Font f1 = new Font("SERIF", Font.ITALIC, 17);

	private BufferedImage background;
	private BufferedImage myPlane;
	private BufferedImage myRocket;
	private BufferedImage newPlane;
	private BufferedImage newRocket;
	private BufferedImage topSpeed;

	public Game() {

		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);

		mainPanel.add(loginPanel, BorderLayout.WEST);
		loginPanel.setLayout(new GridLayout(2, 1));

		loginPanel.add(hintPanel);
		hintPanel.setBackground(c1);
		hintPanel.setLayout(new BorderLayout());
		hintPanel.setBorder(BorderFactory
				.createTitledBorder("WELCOME TO MINI GAME !!!"));
		hintText.setEditable(false);
		hintPanel.add(hintText, BorderLayout.CENTER);
		hintText.setBackground(c);
		hintText.setFont(f1);
		hintText.setForeground(Color.BLACK);

		loginPanel.add(login);
		login.setBackground(c1);
		login.setLayout(new BorderLayout());
		login.setBorder(BorderFactory.createTitledBorder("ENTER NICKNAME"));
		login.add(nameText, BorderLayout.NORTH);
		startGameButton.setEnabled(false);
		login.add(startGameButton, BorderLayout.CENTER);
		nameText.addKeyListener(new TextAction());
		startGameButton.setBackground(c);
		startGameButton.setOpaque(true);
		startGameButton.addActionListener(new StartButtonAction());
		login.add(gitButton, BorderLayout.SOUTH);
		gitButton.setBackground(c);
		gitButton.setOpaque(true);
		gitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop()
							.browse(new URL(
									"https://github.com/Sehic/mentoringLecturesAndExercises/tree/master/MiniGame/src/ba/bitcamp/hajrudin/mini/game")
									.toURI());
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});

		mainPanel.add(gamePanel, BorderLayout.CENTER);

		gamePanel.setLayout(new BorderLayout());

		gamePanel.setVisible(false);
		gamePanel.add(infoPanel, BorderLayout.NORTH);
		infoPanel.setLayout(new GridLayout(1, 4));
		infoPanel.setBackground(c2);
		lifesLabel.setFont(f);
		lifesLabel.setForeground(Color.BLACK);
		infoPanel.add(lifesLabel);
		scoreLabel.setFont(f);
		scoreLabel.setForeground(Color.BLACK);
		infoPanel.add(scoreLabel);
		levelLabel.setFont(f);
		levelLabel.setForeground(Color.BLACK);
		infoPanel.add(levelLabel);
		infoPanel.add(showScoresButton);
		showScoresButton.setBackground(c2);
		showScoresButton.setForeground(Color.BLACK);
		showScoresButton.setOpaque(true);

		showScoresButton.addActionListener(new ShowScoresButton());

		gamePanel.add(game, BorderLayout.CENTER);
		Font f = new Font("SERIF", Font.CENTER_BASELINE, 33);
		playLabel.setFont(f);
		playLabel.setForeground(Color.RED);
		playLabel.setText("CLICK TO PLAY");
		game.add(playLabel);
		game.addKeyListener(new MyTankControl());
		game.addMouseListener(new MyTankMouse());
		game.addFocusListener(new MyTankFocus());

		try {

			background = ImageIO
					.read(new URL(
							"http://www.axsysnav.eu/wp-content/uploads/2014/07/blue-space-wallpaper-8.png"));
			myPlane = ImageIO
					.read(new URL(
							"http://s18.postimg.org/hcj11q0t1/1436280574_kspaceduel.png"));
			myRocket = ImageIO.read(new URL(
					"http://s18.postimg.org/j7shr12fp/1436281130_rocket.png"));
			newPlane = ImageIO
					.read(new URL(
							"http://s29.postimg.org/tadxmuldf/clipart_wolf_space_ship_256x256_b434.png"));
			newRocket = ImageIO.read(new URL(
					"http://s2.postimg.org/m8uzzql45/rocket.png"));
			topSpeed = ImageIO.read(new URL(
					"http://s14.postimg.org/q1ezs0359/1094748.png"));
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

	private class AnimatedTank implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			newTank.y = newTank.y + enemySpeed;
			if (newTank.getY() > 485) {
				newTank.y = 0;
				newTank.x = ((int) (Math.random() * 650));
				String arr[] = lifesLabel.getText().split(" ");
				int a = Integer.parseInt(arr[1]);
				a -= 1;
				lifesLabel.setText(arr[0] + " " + a);
				if (a == 0) {
					gameOver();
				}
			}
			if (newTank.getY() > 0) {
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

			g.drawImage(background, game.getX() - 30, game.getY() - 30, null);

			g.drawImage(myPlane, myTank.x, myTank.y, null);

			g.drawImage(newPlane, newTank.x, newTank.y, null);

			if (temp)

				g.drawImage(myRocket, myBullet.x, myBullet.y, null);
			else

				g.drawImage(myRocket, myTank.x + 23, myTank.y, null);

			if (temp1)

				g.drawImage(newRocket, newBullet.x, newBullet.y, null);
			else

				g.drawImage(newRocket, newTank.x + 23, newTank.y + 55, null);

			g.drawImage(topSpeed, speed.x, speed.y, null);

		}
	}

	private class AnimatedSpeed implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			speed.y += 5;
			if (speed.intersects(myTank)) {
				mySpeed += 5;
				speed.y = -700;
			}
			if (speed.y > 485) {
				speed.y = -700;
			}
			game.repaint();
		}

	}

	private class MyTankControl extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				myTank.x -= mySpeed;
				if (myTank.x <= 0) {
					myTank.x += mySpeed;
				}
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				myTank.x += mySpeed;
				if (myTank.x >= 670) {
					myTank.x -= mySpeed;
				}
			} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				myBullet.x = myTank.x + 23;
				t1.start();
			}
			game.repaint();
		}

	}

	private int counter = 0;

	private class Shot implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			temp = true;
			myBullet.y -= 5;
			if (myBullet.intersects(newTank)) {
				String arr[] = scoreLabel.getText().split(" ");
				int a = Integer.parseInt(arr[1]);
				a += 5;
				scoreLabel.setText(arr[0] + " " + a);
				counter += 1;
				if (counter == 5) {
					counter = 0;
					String ar[] = levelLabel.getText().split(" ");
					int b = Integer.parseInt(ar[1]);
					b += 1;
					levelLabel.setText(ar[0] + " " + b);
					enemySpeed += 5;
					bulletSpeed += 1;
				}
				t2.stop();
				temp1 = false;
				newTank.y = 0;
				newTank.x = ((int) (Math.random() * 730));
				myBullet.y = myTank.y;
				newBullet.x = newTank.x + 23;
				newBullet.y = newTank.y + 55;
				temp = false;
				t1.stop();
			}
			if (myBullet.y < 0) {
				myBullet.y = myTank.y;
				temp = false;
				t1.stop();
			}
			game.repaint();
		}
	}

	public void gameOver() {
		//writeScore();
		ts.stop();
		t.stop();
		t1.stop();
		t2.stop();
		int tt = JOptionPane.showConfirmDialog(null, "GAME OVER \n "
				+ scoreLabel.getText() + "\n REPLAY?");
		if (tt == JOptionPane.YES_OPTION) {
			lifesLabel.setText("Lifes: 3");
			scoreLabel.setText("Score: 0");
			levelLabel.setText("Level: 1");
			enemySpeed = 5;
			mySpeed = 5;
			bulletSpeed = 5;
			myTank.x = 800 / 2;
			myTank.y = 600 - 115;
			newTank.x = 800 / 2;
			newTank.y = -70;
			myBullet.x = myTank.x + 23;
			myBullet.y = myTank.y;
			temp = false;
			newBullet = new Rectangle(newTank.x + 23, newTank.y + 55, 15, 15);
			temp1 = false;
			speed.x = ((int) (Math.random() * 400));
			speed.y = -300;
			playLabel.setText("CLICK TO PLAY");
			game.addKeyListener(new MyTankControl());
			game.addMouseListener(new MyTankMouse());
			game.addFocusListener(new MyTankFocus());
		} else if (tt == JOptionPane.CANCEL_OPTION
				|| tt == JOptionPane.NO_OPTION
				|| tt == JOptionPane.CLOSED_OPTION) {
			game.setVisible(false);
		}
	}

	private class EnemyShot implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			temp1 = true;
			newBullet.y += bulletSpeed;
			if (newBullet.intersects(myTank)) {
				String arr[] = lifesLabel.getText().split(" ");
				int a = Integer.parseInt(arr[1]);
				a -= 1;
				lifesLabel.setText(arr[0] + " " + a);
				if (a == 0) {
					gameOver();
				} else {
					newBullet.x = newTank.x + 23;
					newBullet.y = newTank.y + 55;
					temp1 = false;
					game.repaint();
				}
			}
			if (newBullet.y > 550) {
				newBullet.x = newTank.x + 23;
				newBullet.y = newTank.y + 55;
				temp1 = false;
			}
			game.repaint();
		}
	}

	private class MyTankMouse extends MouseAdapter {
		public void mousePressed(MouseEvent evt) {
			playLabel.setText("");
			t.start();
			ts.start();
			game.requestFocus();
		}
	}

	private class MyTankFocus extends FocusAdapter {
		public void focusGained(FocusEvent evt) {
			game.repaint();
		}

		public void focusLost(FocusEvent evt) {
			game.repaint();
		}
	}

	private class TextAction implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
			startGameButton.setEnabled(true);
		}

		@Override
		public void keyPressed(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}
	}

	public static void writeScore() {
		TextIO.readFile("src/ba/bitcamp/hajrudin/mini/game/gameFile.txt");
		String s = "";
		while (!TextIO.eof()) {
			s += TextIO.getln();
			s += ",";
		}
		String ar[] = scoreLabel.getText().split(" ");
		int a = Integer.parseInt(ar[1]);
		s += nameText.getText() + " " + a;
		String[] arr = s.split(",");
		TextIO.writeFile("src/ba/bitcamp/hajrudin/mini/game/gameFile.txt");
		for (int i = 0; i < arr.length; i++) {
			TextIO.putln(arr[i]);
		}
	}

	private class StartButtonAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			gamePanel.setVisible(true);
		}

	}

	private class ShowScoresButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			/**
			 * TextIO.readFile("src/ba/bitcamp/hajrudin/mini/game/gameFile.txt")
			 * ; String s = ""; while (!TextIO.eof()) { s += TextIO.getln(); s
			 * += "\n"; }
			 **/
			String s = "";
			try {
				Scanner input = new Scanner(System.in);
				URL file1 = new URL(
						"http://m.uploadedit.com/ba3e/1436965292591.txt");

				input = new Scanner(file1.openStream());

				while (input.hasNextLine()) {
					String line = input.nextLine();
					System.out.println(line);
					s += line;
					
				}
				input.close();

			} catch (Exception ex) {
				ex.printStackTrace();
			}

			JOptionPane.showMessageDialog(null, s);
		}

	}

	public static void main(String[] args) {
		new Game();
	}
}