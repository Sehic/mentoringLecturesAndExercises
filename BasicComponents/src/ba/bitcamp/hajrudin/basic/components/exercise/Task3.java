package ba.bitcamp.hajrudin.basic.components.exercise;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Task3 extends JFrame{
	
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Name");
	private JLabel label2 = new JLabel("Password");
	private JTextField text = new JTextField(5);
	private JPasswordField pass = new JPasswordField(5);
	
	public Task3(){
		
		add(panel);
		panel.add(label);
		panel.add(text);
		panel.add(label2);
		panel.add(pass);
		
		pass.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					String password = String.valueOf(pass.getPassword());
					if(text.getText().equals("Mujo") && password.equals("1234")){
						System.exit(0);
					}else{
						JOptionPane.showMessageDialog(null, "Wrong username or pass");
					}
				}
			}
		});
		
		setTitle("Task 2");
		setSize(400, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task3();
	}
}
