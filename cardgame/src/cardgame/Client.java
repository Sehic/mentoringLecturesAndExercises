package cardgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Client extends JFrame {
	private static final long serialVersionUID = -2870577041754803449L;
	public static BufferedImage img = null;
	public static BufferedImage playerImg = null;
	private static JPanel panel;

	private JMenuBar bar = new JMenuBar();
	public static JMenu menuGame = new JMenu("Game");
	public static JMenu menuHelp = new JMenu("Help");

	private JMenuItem newGame = new JMenuItem("New");
	private JMenuItem exitGame = new JMenuItem("Exit");
	private JMenuItem howToPlay = new JMenuItem("How to play");
	private static JLabel[] cardLabels = new JLabel[5];
	private JButton button = new JButton("FINISH");

	private Card choosenCard;

	public Client() {

		try {
			img = ImageIO.read(new File("greenbyrequest3.jpg"));
			playerImg = ImageIO.read(new File("player1.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		panel = new MyPanel();
		panel.setLayout(null);
		panel.add(button);
		button.setBounds(420, 380, 70, 70);
		button.setForeground(Color.BLUE);

		// Adding labels on cards
		int counter = 0;
		for (int i = 0; i < cardLabels.length; i++) {
			cardLabels[i] = new JLabel();
			cardLabels[i].setSize(105, 155);
			cardLabels[i].setFocusable(false);
			cardLabels[i].setLocation(595 - counter, 495);
			counter += 120;
			panel.add(cardLabels[i]);
			// cardLabels[i].addMouseListener(new MouseHandler());
		}

		setLayout(new BorderLayout());
		add(bar, BorderLayout.NORTH);
		bar.add(menuGame);
		bar.add(menuHelp);

		menuGame.add(newGame);
		menuGame.add(exitGame);
		menuHelp.add(howToPlay);
		add(panel, BorderLayout.CENTER);

		setSize(951, 728);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			new Client();
			// CardImages.BufferCardImages();
			// Socket socket = new Socket("localhost", 1111);
			//
			// //sendThread = new SendThread(socket);
			// //new Client();
			// Thread thread = new Thread(sendThread);
			// thread.start();
			// RecieveThread recieveThread = new RecieveThread(socket);
			// Thread thread2 = new Thread(recieveThread);
			// thread2.start();
			Socket sock = new Socket("localhost", 1111);
			// SendThread sendThread = new SendThread(sock);
			// Thread thread = new Thread(sendThread);
			// thread.start();
			RecieveThread recieveThread = new RecieveThread(sock);
			Thread thread2 = new Thread(recieveThread);
			thread2.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static class RecieveThread implements Runnable {
		Socket sock = null;
		BufferedReader recieve = null;

		public RecieveThread(Socket sock) {
			this.sock = sock;
		}// end constructor

		public void run() {
			try {
				recieve = new BufferedReader(new InputStreamReader(
						this.sock.getInputStream()));// get inputstream
				String msgRecieved = null;
				while ((msgRecieved = recieve.readLine()) != null) {
					
					System.out.println(msgRecieved);
				}
				// while ((msgRecieved = recieve.readLine()) != null) {
				// System.out.println("From Server: " + msgRecieved);
				// System.out
				// .println("Please enter something.." to send to server);
				// }
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}// end run
	}// end class recievethread

	public static class SendThread implements Runnable {
		Socket sock = null;
		PrintWriter print = null;
		BufferedReader brinput = null;

		public SendThread(Socket sock) {
			this.sock = sock;
		}// end constructor

		public void run() {
			try {
				if (sock.isConnected()) {
					System.out.println("Client connected to "
							+ sock.getInetAddress() + " on port "
							+ sock.getPort());
					this.print = new PrintWriter(sock.getOutputStream(), true);
					// while (true) {
					// System.out
					// .println("Type your message to send to server..type 'EXIT' to exit");
					// brinput = new BufferedReader(new InputStreamReader(
					// System.in));
					String msgtoServerString = null;
					// msgtoServerString = brinput.readLine();
					// this.print.println(msgtoServerString);
					// this.print.flush();
					//
					// if (msgtoServerString.equals("EXIT"))
					// break;
					// }// end while
					brinput = new BufferedReader(new InputStreamReader(
							System.in));
					int counter = 0;
					for (int i = 0; i < cardLabels.length; i++) {
						cardLabels[i] = new JLabel();
						cardLabels[i].setSize(105, 155);
						cardLabels[i].setFocusable(false);
						cardLabels[i].setLocation(595 - counter, 495);
						counter += 120;
						panel.add(cardLabels[i]);
						cardLabels[i].addMouseListener(new MouseHandler());
					}

					sock.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}// end run method
	}// end class

	/**
	 * Paint table picture on panel
	 * 
	 * @author KrisTina
	 *
	 */
	public class MyPanel extends JPanel {
		private static final long serialVersionUID = -6446634635700606218L;
		Deck d = new Deck();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			System.out.print("...");
			g.drawImage(img, 0, 0, img.getWidth(), img.getHeight(), null);

			g.drawImage(playerImg, 425, 10, 60, 60, null);
			g.drawImage(playerImg, 1, 238, 60, 60, null);
			g.drawImage(playerImg, 885, 238, 60, 60, null);

			System.out.print("*");

			int counter = 0;
			for (int i = 0; i < 5; i++) {
				System.out.print("-");
				g.drawImage(Deck.getCards().get(i).getSuitImge(),
						600 - counter, 500, 100, 150, null);
				counter += 120;
			}
			System.out.print("*");

			// g.drawImage(CardImages.Jdiamond, 600, 500, 100, 150, null);
			// g.drawImage(CardImages.Kspade, 480, 500, 100, 150, null);
			// g.drawImage(CardImages.Qtref, 360, 500, 100, 150, null);
			// g.drawImage(CardImages.Qdiamond, 240, 500, 100, 150, null);
			// g.drawImage(CardImages.Qdiamond, 120, 500, 100, 150, null);

			g.drawImage(CardImages.cardback, 520, 130, 50, 70, null);
			g.drawImage(CardImages.cardback, 460, 130, 50, 70, null);
			g.drawImage(CardImages.cardback, 400, 130, 50, 70, null);
			g.drawImage(CardImages.cardback, 340, 130, 50, 70, null);

			g.drawImage(CardImages.cardback, 720, 170, 70, 50, null);
			g.drawImage(CardImages.cardback, 720, 230, 70, 50, null);
			g.drawImage(CardImages.cardback, 720, 290, 70, 50, null);
			g.drawImage(CardImages.cardback, 720, 350, 70, 50, null);

			g.drawImage(CardImages.cardback, 140, 170, 70, 50, null);
			g.drawImage(CardImages.cardback, 140, 230, 70, 50, null);
			g.drawImage(CardImages.cardback, 140, 290, 70, 50, null);
			g.drawImage(CardImages.cardback, 140, 350, 70, 50, null);

			// repaint();
			System.out.println(":(");

		}
	}

	/**
	 * Mouse handler implements MouseListener
	 * 
	 * @author kristina.pupavac
	 *
	 */
	public static class MouseHandler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("klik");

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			for (int i = 0; i < cardLabels.length; i++) {
				System.out.println(i);
				if (e.getSource() == cardLabels[i]) {
					Border blackline = BorderFactory
							.createLineBorder(Color.CYAN);
					cardLabels[i].setBorder(blackline);

				}
			}

		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("Exit");
			for (int i = 0; i < cardLabels.length; i++) {
				if (e.getSource() == cardLabels[i]) {
					Border blackline = BorderFactory
							.createLineBorder(Color.BLACK);
					cardLabels[i].setBorder(blackline);
				}
			}
		}

	}

}
