package ba.bitcamp.hajrudin.exercise.networking.part.I;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Chat extends JFrame {

	private JPanel panel = new JPanel();
	private TextArea text = new TextArea();
	private JButton button = new JButton("Send");

	public Chat() {
		panel.setLayout(new BorderLayout());
		add(panel);

		panel.add(text, BorderLayout.CENTER);
		panel.add(button, BorderLayout.SOUTH);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Socket socket;
				try {
					socket = new Socket("10.0.82.98", 7777);
					BufferedWriter writer = new BufferedWriter(
							new OutputStreamWriter(socket.getOutputStream()));
					writer.write(text.getText());
					writer.newLine();
					writer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		Chat c = new Chat();

	}
}
