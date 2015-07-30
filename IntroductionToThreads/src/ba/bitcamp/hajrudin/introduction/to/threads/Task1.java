package ba.bitcamp.hajrudin.introduction.to.threads;

public class Task1 implements Runnable {

	public static void main(String[] args) {
		Task1 t = new Task1();
		Thread t1 = new Thread(t);
		t1.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("Main");
		}

	}

	@Override
	public void run() {
		System.out.println("Going to sleep");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Play");
	}
}
