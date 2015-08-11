package ba.bitcamp.hajrudin.weekend.homework23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Task1 extends JFrame {
	private static final long serialVersionUID = 6115713211684889821L;

	private JPanel mainPanel = new JPanel();
	private JButton addButton = new JButton("ADD");
	private JButton deleteButton = new JButton("DELETE");
	public static TextArea text = new TextArea();
	private JScrollPane scroll = new JScrollPane();
	private JPanel buttonsPanel = new JPanel();

	public Task1() {
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);

		mainPanel.add(text, BorderLayout.CENTER);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
		buttonsPanel.setLayout(new GridLayout(1, 2));
		buttonsPanel.add(addButton);
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser open = new JFileChooser();
				open.showOpenDialog(null);
				File f = open.getSelectedFile();
				saveFile(f);
				addToLabel();
			}

		});

		buttonsPanel.add(deleteButton);

		setTitle("Task 1");
		setSize(800, 600);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void saveFile(File f) {
		String ext = getExtension(f);
		switch (ext) {
		case "png":
		case "jpg":
		case "bmp":
		case "gif":
			File dir = new File(
					"/Users/hajrudin.sehic/Desktop/HOMEWORK/Pictures/"
							+ f.getName());
			copyFile(f, dir);
			break;
		default:
			File dir1 = new File(
					"/Users/hajrudin.sehic/Desktop/HOMEWORK/Others/"
							+ f.getName());
			copyFile(f, dir1);
		}
	}

	public static void copyFile(File f, File dir) {

		try {
			InputStream in = new FileInputStream(f);
			OutputStream out = new FileOutputStream(dir);
			int bytesRead = 0;
			byte[] moveBuff = new byte[1024];
			while ((bytesRead = in.read(moveBuff)) > 0) {

				out.write(moveBuff, 0, bytesRead);
				out.flush();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addToLabel() {
		File dir = new File("/Users/hajrudin.sehic/Desktop/HOMEWORK");
		String[] arr = dir.list();
		String s = "";
		for (int i = 1; i < arr.length; i++) {
			s += arr[i] + ": \n";
			File files = new File("/Users/hajrudin.sehic/Desktop/HOMEWORK/"
					+ arr[i]);

			File[] f = files.listFiles();
			for (int j = 0; j < f.length; j++) {
				s += f[j].getName() + "\n";
			}
		}
		text.setText(s);

	}

	public static String getExtension(File f) {
		if (f.getName().contains(".")) {
			String name = f.getName();
			String[] arr = name.split("\\.");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println(arr.length);
			return arr[1];
		}
		return "";
	}

	public static void main(String[] args) {
		new Task1();
	}
}
