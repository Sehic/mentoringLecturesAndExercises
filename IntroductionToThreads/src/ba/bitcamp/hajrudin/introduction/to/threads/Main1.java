package ba.bitcamp.hajrudin.introduction.to.threads;

public class Main1 {
	public static void main(String[] args) {
		NamedRunnable r1 = new NamedRunnable("Joey");
		NamedRunnable r2 = new NamedRunnable("Rich");
		NamedRunnable r3 = new NamedRunnable("Kik");

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of main");
	}
}
