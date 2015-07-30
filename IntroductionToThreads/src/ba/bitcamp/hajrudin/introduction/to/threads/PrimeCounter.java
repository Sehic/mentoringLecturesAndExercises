package ba.bitcamp.hajrudin.introduction.to.threads;

public class PrimeCounter extends Thread {
	private static Object o = new Object();
	private int start;
	private int end;
	private static int count;

	public PrimeCounter(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void countPrimes() {
		for (int i = start; i < end; i++) {
			if (isPrime(i)) {
				synchronized (o) {
					count++;
				}
			}
		}
	}

	private boolean isPrime(int num) {
		for (int i = 2; i < num / 2; i++)
			if (num % i == 0)
				return false;
		return true;
	}

	public int getCount() {
		return this.count;
	}

	@Override
	public void run() {
		countPrimes();
	}

}
