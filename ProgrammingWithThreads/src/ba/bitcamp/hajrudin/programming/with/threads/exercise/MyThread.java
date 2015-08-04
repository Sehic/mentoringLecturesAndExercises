package ba.bitcamp.hajrudin.programming.with.threads.exercise;

public class MyThread extends Thread {

	private boolean running = true;
	private int counter = 1;

	@Override
	public void run() {
		while (running && counter <= 100) {
			System.out.println(counter);
			counter++;
			try {
				sleep(400);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void stopT() {
		this.running = false;
		this.counter = 200;
	}
}
