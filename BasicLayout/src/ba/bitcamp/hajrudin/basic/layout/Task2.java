package ba.bitcamp.hajrudin.basic.layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task2 extends JFrame {
	private static final long serialVersionUID = -5537129640382682405L;

	private int fullWidth = 800, fulHeight = 400;
	private int red = 0, green = 0, blue = 0;

	private JPanel panel = new JPanel();
	private JPanel colorPanel = new JPanel();
	private JPanel sliderPanel = new JPanel();
	private JButton button = new JButton("Click me");
	private JSlider redSlider = new JSlider(0, 255);
	private JSlider blueSlider = new JSlider(0, 255);
	private JSlider greenSlider = new JSlider(0, 255);
	private JButton[] buttons = new JButton [12];
	
	public Task2(int w, int h) {
		int sliderHeight = h / 7;
		Dimension dS = new Dimension(w - 50, sliderHeight);
		add(panel);
		panel.setLayout(new GridLayout(1,3));
		
		panel.add(colorPanel);
		colorPanel.setLayout(new GridLayout(4, 3));
		for(int i = 0; i<buttons.length; i++){
			buttons[i] = new JButton();
			buttons[i].setBorderPainted(false);
			buttons[i].setOpaque(true);
			colorPanel.add(buttons[i]);
		}
		
		buttons[0].setBackground(Color.BLUE);
		buttons[1].setBackground(Color.BLACK);
		buttons[2].setBackground(Color.GREEN);
		buttons[3].setBackground(Color.CYAN);
		buttons[4].setBackground(Color.DARK_GRAY);
		buttons[5].setBackground(Color.GRAY);
		buttons[6].setBackground(Color.LIGHT_GRAY);
		buttons[7].setBackground(Color.MAGENTA);
		buttons[8].setBackground(Color.ORANGE);
		buttons[9].setBackground(Color.PINK);
		buttons[10].setBackground(Color.RED);
		buttons[11].setBackground(Color.YELLOW);
		
		panel.add(button);
		initButton(w, h);
		
		GridLayout gb = new GridLayout(1, 3);
		panel.add(sliderPanel);
		sliderPanel.setLayout(gb);
		
		initSlider(redSlider, "RED", dS);
		initSlider(greenSlider, "GREEN", dS);
		initSlider(blueSlider, "BLUE", dS);

		sliderPanel.add(redSlider);
		sliderPanel.add(blueSlider);
		sliderPanel.add(greenSlider);

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
		slider.setToolTipText(name);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(25);
		slider.setPaintTicks(true);
		slider.setOrientation(JSlider.VERTICAL);
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
		new Task2(1500, 600);
	}
}
