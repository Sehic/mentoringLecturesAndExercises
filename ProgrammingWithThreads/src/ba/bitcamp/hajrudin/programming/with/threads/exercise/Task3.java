package ba.bitcamp.hajrudin.programming.with.threads.exercise;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task3 extends JFrame {
	private static final long serialVersionUID = 2744262597443249865L;

	private JPanel panel = new JPanel();
	private JButton button = new JButton("Start");
	private JLabel label = new JLabel();

	public Task3() {
		panel.setLayout(new BorderLayout());
		add(panel);

		panel.add(label, BorderLayout.CENTER);
		panel.add(button, BorderLayout.SOUTH);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread t = new Thread(new MyThread());
				t.start();
			}
		});

		setTitle("Task 3");
		setSize(800, 600);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static class MyThread implements Runnable {
		Integer count = 0;

		@Override
		public void run() {
			for (int i = 10; i < 100; i++) {
				if (isPrime(i)) {
					synchronized (count) {
						count++;
						System.out.println(count);
					}
				}
			}
		}

		private boolean isPrime(int num) {
			for (int i = 2; i < num / 2; i++)
				if (num % i == 0)
					return false;
			return true;
		}

	}

	public static void main(String[] args) {
		new Task3();
	}
}
