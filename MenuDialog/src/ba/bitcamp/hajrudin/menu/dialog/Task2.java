package ba.bitcamp.hajrudin.menu.dialog;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Task2 extends JFrame{
	
	private static JTextArea area = new JTextArea();
	private JLabel label1 = new JLabel("Enter email");
	private JButton button1 = new JButton("OK");
	private JPanel panel1 = new JPanel();
	private static String[] arr = {"mail1@gmail.com", "mail2@gmail.com", "mail3@gmail.com"};
	
	public Task2(){
		add(panel1);
		panel1.setLayout(new GridLayout(3,1));
		
		panel1.add(label1);
		panel1.add(area);
		panel1.add(button1);	
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();
			}
		});
		
		
		setTitle("Task 2");
		setSize(400,150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static boolean isBusy(){
		for(int i = 0; i< arr.length;i++ ){
			if(arr[i].equals(area.getText())){
				return true;
			}
		}
		return false;
	}
	
	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -4070623060379881616L;
		
	
		
		private JTextField field = new JTextField();
		
		public MyDialog() {
			
			setLayout(new BorderLayout());
			setModalityType(ModalityType.MODELESS);
			if(isBusy()){
			field.setText("Zauzet");
			} else {
				field.setText("Nije zauzet");
			}
			add(field);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(200, 100);
			setLocationRelativeTo(null);
			setTitle("Example JDialog");
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Task2();
	}
}
