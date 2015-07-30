package ba.bitcamp.hajrudin.introduction.to.threads;

public class Main {
	public static void main(String[] args) {

		NamedThread t1 = new NamedThread("Ross");
		NamedThread t2 = new NamedThread("Joey");
		NamedThread t3 = new NamedThread("Rachel");

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
