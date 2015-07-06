package ba.bitcamp.hajrudin.menu.dialog;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task1 extends JFrame{
	
	private JButton button1 = new JButton("MODELESS");
	private JButton button2 = new JButton("MODAL");
	private JPanel panel1 = new JPanel();
	private boolean temp = false;
	
	public Task1(){
		add(panel1);
		panel1.add(button1);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				temp = false;
				new MyDialog();
			}
		});
		
	
		panel1.add(button2);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				temp = true;
				new MyDialog();
			}
		});
		
		setTitle("Task 1");
		setSize(400, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -4070623060379881616L;

		private JTextField field = new JTextField();
		
		public MyDialog() {
			setLayout(new BorderLayout());
			if(!temp){
			setModalityType(ModalityType.MODELESS);
			field.setText("MODELESS");
			add(field);
			} else {
				setModalityType(ModalityType.APPLICATION_MODAL);
				field.setText("MODAL");
				add(field);
			}
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(200, 100);
			setLocationRelativeTo(null);
			setTitle("Example JDialog");
			setVisible(true);
		}
	}
		
	public static void main(String[] args) {
		new Task1();
		
	}
}
