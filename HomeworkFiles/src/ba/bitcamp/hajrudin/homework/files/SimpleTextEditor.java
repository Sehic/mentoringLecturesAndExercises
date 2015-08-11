package ba.bitcamp.hajrudin.homework.files;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SimpleTextEditor extends JFrame {

	private static final long serialVersionUID = 5322985331119705014L;

	private JPanel mainPanel = new JPanel();
	private static JTextArea text = new JTextArea();
	private JMenuBar menu = new JMenuBar();
	private JMenu file = new JMenu("File");
	private JMenuItem open = new JMenuItem("Open");
	private JMenuItem save = new JMenuItem("Save");

	public SimpleTextEditor() {
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);
		menu.add(file);
		file.add(open);
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		file.add(save);
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		mainPanel.add(menu, BorderLayout.NORTH);
		mainPanel.add(text, BorderLayout.CENTER);

		setTitle("Simple text editor");
		setSize(800, 600);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void openFile() {
		JFileChooser open = new JFileChooser();
		open.showOpenDialog(null);
		File f = open.getSelectedFile();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String s = "";
			while (reader.ready()) {
				s += reader.readLine();
				s += "\n";
			}
			reader.close();
			text.setText(s);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void saveFile() {
		JFileChooser jfc = new JFileChooser(System.getProperty("user.desktop"));
		File f = null;
		int tmp = jfc.showSaveDialog(null);
		if (tmp == JFileChooser.APPROVE_OPTION) {
			f = jfc.getSelectedFile();
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			text.write(bw);
			bw.flush();
		} catch (IOException e1) {
			e1.printStackTrace();

		} catch (NullPointerException e1) {

		}
	}

	public static void main(String[] args) {
		new SimpleTextEditor();
	}
}
