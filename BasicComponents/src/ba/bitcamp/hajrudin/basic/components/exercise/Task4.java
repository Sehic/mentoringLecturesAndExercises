package ba.bitcamp.hajrudin.basic.components.exercise;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Task4 extends JFrame{
	
	private int sum = 0;
	
	public Task4(){
	
		while(true){
		Integer a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		sum+=a;
		int choice = JOptionPane.showConfirmDialog(null, "Enter again?");
		
		if (choice == JOptionPane.YES_OPTION) {
			
		} else if (choice == JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(null, "Sum = "+sum);
			break;
		} else if (choice == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Sum = "+sum);
			break;
		}
		}
		
	}
	
	public static void main(String[] args) {
		new Task4();
		
	}
}
