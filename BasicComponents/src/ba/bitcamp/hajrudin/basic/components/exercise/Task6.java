package ba.bitcamp.hajrudin.basic.components.exercise;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Task6 extends JFrame {

	private JLabel label = new JLabel("Enter seconds");
	private JTextField text = new JTextField(5);
	private JButton button = new JButton("Start counting");
	private JLabel label2 = new JLabel("");
	int a = 0;
	Timer t = new Timer(1000, new Action());
	
	public Task6() {
		setLayout(new GridLayout(10, 1));

		add(label);
		add(text);

		add(button);
		label2.setHorizontalAlignment(NORMAL);
		add(label2);

		

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (text.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Niste unijeli vrijednost");
				} else {
					a = Integer.parseInt(text.getText());
				}
				t.start();
			}
		});
		
		setTitle("Task 6");
		setSize(400, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Action implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(a>0){
				a=a-1;
				label2.setText(Integer.toString(a));
			}
		}
	}

	public static void main(String[] args) {
		new Task6();
	}
}
