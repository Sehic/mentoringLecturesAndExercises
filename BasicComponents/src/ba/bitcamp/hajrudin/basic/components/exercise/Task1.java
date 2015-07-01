package ba.bitcamp.hajrudin.basic.components.exercise;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task1 extends JFrame{
	
	private static final long serialVersionUID = -3404328301926185840L;
	
	private int size = 15;
	
	private JLabel label = new JLabel("Neki tekst");
	private JSlider slider = new JSlider(15,33,size);
	
	public Task1(){
		BorderLayout layout = new BorderLayout();
		setLayout(new BorderLayout());
		label.setHorizontalAlignment(NORMAL);
		add(label, BorderLayout.CENTER);

		add(slider, BorderLayout.SOUTH);
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				label.setFont(new Font("SS", Font.ITALIC, slider.getValue()));
				
			}
		});
		
		setTitle("Task 1");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task1();
	}
}
