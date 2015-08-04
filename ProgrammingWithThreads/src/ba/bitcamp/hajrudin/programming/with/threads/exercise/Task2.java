package ba.bitcamp.hajrudin.programming.with.threads.exercise;

public class Task2{

	private static Integer counter = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			try {
				startCount();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(counter);
			counter = 0;
		}

	}

	public static void startCount() throws InterruptedException {
		Thread t1 = new Thread(new MyThreadd());
		Thread t2 = new Thread(new MyThreadd());
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

	public static class MyThreadd implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				
				synchronized(counter){
					counter = counter + 10;
				}
				
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		}
	}

}
