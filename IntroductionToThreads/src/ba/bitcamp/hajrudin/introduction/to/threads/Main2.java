package ba.bitcamp.hajrudin.introduction.to.threads;

import java.util.Date;

public class Main2 {
	public static void main(String[] args) {
		Date start = new Date();

		PrimeCounter[] counters = new PrimeCounter[17];
		int start1 = 1;
		int end1 = 1000000;
		int step = end1 / counters.length;
		for (int i = 0; i < counters.length; i++) {
			counters[i] = new PrimeCounter(i * step, (i + 1) * step);
			counters[i].start();
		}

		for (int i = 0; i < counters.length; i++) {
			try {
				counters[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println("Primes count: " + counters[0].getCount());
		Date end = new Date();
		long time = (end.getTime() - start.getTime()) / 1000;
		System.out.println("Time: " + time);

		System.out.println("End of main");
	}
}
