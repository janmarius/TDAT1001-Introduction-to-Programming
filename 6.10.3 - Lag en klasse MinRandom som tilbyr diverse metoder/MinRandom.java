/**
* MinRandom.java
*
* Oppgave 6.10.3
*
* Lag en klasse MinRandom som tilbyr diverse metoder
*/

import java.util.Random;

class MinRandom {
	Random random = new Random();

	public int nesteHeltall(int nedre, int ovre) {
		ovre++;
		int randomHeltall = 0;
		boolean ikkeInnenfor = true;
		while(ikkeInnenfor) {
			randomHeltall = random.nextInt(ovre);
			if (randomHeltall >= nedre) {
				ikkeInnenfor = false;
			} else {
				ikkeInnenfor = true;
			}
		}
		return randomHeltall;
	}

	public double nesteDesimaltall(double nedre, double ovre) {
		double randomDesimaltall = 0;
		boolean ikkeInnenfor = true;
		while(ikkeInnenfor) {
			double desimaltall = random.nextDouble();
			int nyOvre = (int) ovre;
			int heltall = random.nextInt(nyOvre);
			randomDesimaltall = desimaltall + heltall;
			if ((randomDesimaltall <= ovre && randomDesimaltall >= nedre) && desimaltall > 0.0) {
				ikkeInnenfor = false;
			} else {
				ikkeInnenfor = true;
			}

		}
		return randomDesimaltall;
	}


	public static void main(String[] args) {
		MinRandom minRandom = new MinRandom();
		for(int i = 0; i < 10; i++) {
			System.out.println("Random heltall: " + minRandom.nesteHeltall(0, 10));
			System.out.println("Random desimaltall: " + minRandom.nesteDesimaltall(0, 10) + "\n\n");
		}

	}
}