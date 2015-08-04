package ba.bitcamp.hajrudin.programming.with.threads.exercise;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task1 extends JFrame {
	private static final long serialVersionUID = -4043071439361485204L;

	private JPanel panel = new JPanel();
	private JButton button = new JButton("Add");
	private JButton button1 = new JButton("Stop");

	public Task1() {
		
		ArrayList<MyThread> list = new ArrayList<MyThread>();
		
		panel.setLayout(new GridLayout(1,2));
		add(panel);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyThread t = new MyThread();
				list.add(t);
				t.start();
			}
		});
		
		
		panel.add(button1);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < list.size(); i++) {
					list.get(i).stopT();
					System.out.println(list.get(i).isAlive());
				}
			}
		});

		setTitle("Task 1");
		setSize(300, 300);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task1();
	}
}
