package ba.bitcamp.hajrudin.basic.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task2 extends JFrame {
	private static final long serialVersionUID = -5537129640382682405L;

	private int fullWidth = 500, fulHeight = 500;
	private int red = 0, green = 0, blue = 0;

	private JPanel panel = new JPanel();
	private JButton button = new JButton("Click me");
	private JSlider redSlider = new JSlider(0, 255);
	private JSlider blueSlider = new JSlider(0, 255);
	private JSlider greenSlider = new JSlider(0, 255);
	private JLabel redLabel = new JLabel("Red");
	private JLabel blueLabel = new JLabel("Blue");
	private JLabel greenLabel = new JLabel("Green");

	public Task2(int w, int h) {
		int sliderHeight = h / 7;
		Dimension dS = new Dimension(w - 50, sliderHeight);
		add(panel);
		
		initButton(w, h);
		panel.add(button);

		initSlider(redSlider, "RED", dS);
		initSlider(greenSlider, "GREEN", dS);
		initSlider(blueSlider, "BLUE", dS);

		panel.add(redLabel);
		panel.add(redSlider);
		panel.add(blueLabel);
		panel.add(blueSlider);
		panel.add(greenLabel);
		panel.add(greenSlider);

		setTitle("Task 2");
		setSize(fullWidth, fulHeight);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void initSlider(JSlider slider, String name, Dimension d) {
		slider.setName(name);
		slider.setPreferredSize(d);
		slider.setValue(0);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(25);
		slider.setPaintTicks(true);
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				switch(name){
				case "RED":
					red = redSlider.getValue();
					break;
				case "GREEN":
					green = greenSlider.getValue();
					break;
				case "BLUE":
					blue = blueSlider.getValue();
					break;
				}
				updateButton();
			}
		});
	}

	private void initButton(int w, int h) {
		button.setPreferredSize(new Dimension(w, h / 2));
		button.setOpaque(true);
		button.setBorderPainted(false);
		button.setFont(new Font("s", Font.BOLD, 33));
		updateButton();

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Clipboard clip = Toolkit.getDefaultToolkit()
						.getSystemClipboard();
				String copy = String.format("%d,%d,%d", red, green, blue);
				clip.setContents(new StringSelection(copy), null);
			}
		});

	}

	private void updateButton() {
		button.setBackground(new Color(red, green, blue));
		button.setForeground(new Color(255 - red, 255 - green, 255 - blue));
	}

	public static void main(String[] args) {
		new Task2(500, 500);
	}
}
