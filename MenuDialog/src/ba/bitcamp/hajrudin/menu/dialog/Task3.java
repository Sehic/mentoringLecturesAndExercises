package ba.bitcamp.hajrudin.menu.dialog;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Task3 extends JFrame{
	
	private JPanel panel = new JPanel();
	private JTextArea text = new JTextArea("");
	private JMenuBar bar = new JMenuBar();
	private JMenu menu = new JMenu("Insert");
	private JMenuItem item = new JMenuItem("Text");
	
	public Task3(){
		
		add(panel);
		panel.setLayout(new BorderLayout());
		panel.add(bar, BorderLayout.NORTH);
		bar.add(menu);
		menu.add(item);
		panel.add(text, BorderLayout.CENTER);
		text.setEditable(false);
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();
			}
		});
		
		setTitle("Task 3");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -4070623060379881616L;
	
		private JTextField area1 = new JTextField();
		private JTextField area2 = new JTextField();
		private JButton button = new JButton("OK");
		
		public MyDialog() {
			setLayout(new GridLayout(3,1));
			add(area1);
			add(area2);
			add(button);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = text.getText();
					int a = Integer.parseInt(area2.getText());
					String newS = "";
					newS = s.substring(0, a);
					newS+=area1.getText();
					newS+=s.substring(a, s.length());
					text.setText(newS);
					
				}
			});
			setModalityType(ModalityType.MODELESS);
			
			
		
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(300, 300);
			setLocationRelativeTo(null);
			setTitle("Example JDialog");
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Task3();
	}
}
