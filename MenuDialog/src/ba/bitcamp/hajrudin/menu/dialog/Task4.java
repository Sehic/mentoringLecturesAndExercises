package ba.bitcamp.hajrudin.menu.dialog;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task4 extends JFrame{

	private JPanel panel = new JPanel();
	private JLabel label1 = new JLabel("Name");
	private JTextField text1 = new JTextField();
	private JLabel label2 = new JLabel("Email");
	private JTextField text2 = new JTextField();
	private JLabel label3 = new JLabel("Comment");
	private JTextField text3 = new JTextField();
	private JButton button = new JButton("SUBMIT");
	
	public Task4(){
		add(panel);
		panel.setLayout(new GridLayout(6,1));
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(label3);
		panel.add(text3);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();
				
			}
		});
		
		setTitle("Task 4");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -4070623060379881616L;
		
		private JTextField text = new JTextField();
		private boolean a = false, b = false;
		
		public MyDialog() {
			
			String s = text2.getText();
			for(int i = 0; i<s.length(); i++){
				if(s.charAt(i)=='@'){
					a=true;
				}else if(s.charAt(i)=='.'){
					b=true;
				}
			}
			if(a && b){
				text.setText("Uspjesno");
			}else {
				text.setText("Neispravan unos");
			}
			add(text);
			setModalityType(ModalityType.MODELESS);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(300, 300);
			setLocationRelativeTo(null);
			setTitle("Example JDialog");
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Task4();
	}
}
