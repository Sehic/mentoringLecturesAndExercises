package ba.bitcamp.hajrudin.threads.and.parallel.processing;

import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

	private static LinkedBlockingQueue<Runnable> tasks = new LinkedBlockingQueue<Runnable>(
			2);

	public static void startExample() {
		new Producer().start();
		new Consumer().start();
	}

	private static class Producer extends Thread {
		@Override
		public void run() {
			tasks.offer(new Calculate(1, 10));
			tasks.offer(new Calculate(10, 20));
			tasks.offer(new Calculate(20, 30));

		}
	}

	private static class Consumer extends Thread {
		@Override
		public void run() {
			System.out.println("Consumer started");

			Thread t;
			try {
				while ((t = new Thread(tasks.take())) != null) {
					t.start();

				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static class Calculate implements Runnable {

		private int start;
		private int end;

		public Calculate(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			int result = 0;
			for (int i = start; i < end; i++) {
				result += i;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Result: " + result);
		}

	}
}
