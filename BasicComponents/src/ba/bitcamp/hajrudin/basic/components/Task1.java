package ba.bitcamp.hajrudin.basic.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Task1 extends JFrame {

	private static final long serialVersionUID = -5537129640382682405L;
	
	private int fullWidth = 400, fulHeight = 600;
	
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Name");
	private JLabel label2 = new JLabel("Email");
	private JTextField text = new JTextField(30);
	private JTextField text2 = new JTextField(30);
	private JTextArea area = new JTextArea(10, 30);
	private JCheckBox box = new JCheckBox("I accept the terms and conditions!");
	private JButton button = new JButton("OK");

	public Task1() {

		panel.setBackground(Color.WHITE);

		add(panel);
		panel.add(label);
		panel.add(text);
		panel.add(label2);
		panel.add(text2);

		area.setText("SIGNUP/ Its free and allways will be. Za obavjesti o indikacijama mjerama opreza posavjetujte se sa ljekarom ili farmaceutom");
		area.setLineWrap(true);
		area.setEditable(false);
		panel.add(area);
		
		//button.setEnabled(false);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(box.isSelected()==false){
					JOptionPane.showMessageDialog(null,"Niste prihvatili uslove");
					text.setText("");
					text2.setText("");
				}
			}
		});
		
		panel.add(box);
		/*box.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(box.isSelected()){
					button.setEnabled(true);
				}else {
					button.setEnabled(false);
				}
			}
		});*/
		
		setTitle("Task 1");
		setSize(fullWidth, fulHeight);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task1();
	}
}
