package ba.bitcamp.hajrudin.menu.dialog;

public class Task6 {
	public static void main(String[] args) {
		Date d = new Date();
		Date d1 = new Date(21, 02, 2011);
		Date d2 = new Date();
		Date[] dates ={d,d1,d2};
		
		for(Date d3:dates){
			System.out.println(d3.toString());
		}
		
	}
}
