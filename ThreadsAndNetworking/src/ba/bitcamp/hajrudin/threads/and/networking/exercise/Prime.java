package ba.bitcamp.hajrudin.threads.and.networking.exercise;

import java.math.BigInteger;

public class Prime {

	public static void main(String[] args) {

		BigInteger n = new BigInteger("31176236472038964811");
		BigInteger j = new BigInteger("1");
		for (BigInteger i = new BigInteger("0"); i.compareTo(n) < 0; i = i
				.add(new BigInteger("1"))) {
			
			if (isPrime(i)) {
				System.out.println(i);
				if (n.mod(i).compareTo(new BigInteger("0")) == 0) {
					BigInteger c = n.divide(i);
					if (isPrime(c)) {
						System.out.println(i + ":" + c);
						return;
					}
				}
			}
		}

	}

	public static boolean isPrime(BigInteger n) {
		BigInteger _0 = new BigInteger("0");
		BigInteger _1 = new BigInteger("1");
		BigInteger _2 = new BigInteger("2");

		if (n.compareTo(_0) == 0 || n.compareTo(_1) == 0) {
			return false;
		}

		if (n.compareTo(_2) == 0) {
			return true;
		}

		if (n.remainder(_2).compareTo(_0) == 0) {
			return false;
		}

		BigInteger v = n.subtract(_1);
		while (v.remainder(_2).compareTo(_0) == 0) {
			v = v.divide(_2);
		}

		return true;
	}

}
