/**
* Main.java
*
* Oppgave 7.8.1
*
* Program som går i løkke for eksempel 1000 ganger og henter ut tilfeldige tall.
*/

import static javax.swing.JOptionPane.*;
import java.util.Random;

class Main {
	public static void main(String[] args) {
		Random random = new Random();

		//Leser inn hvor mange ganger man vil kjøre programmet
		String antallGangerLest = showInputDialog("Hvor mange ganger vil du kjøre programmet: ");
		int antallGanger = Integer.parseInt(antallGangerLest);


		int[] antall = new int[10];
		for (int i = 0; i < antallGanger; i++) {
			int tall = random.nextInt(10);
			for (int j = 0; j < antall.length; j++) {
				if (tall == j) {
					antall[j]++;
				}
			}
		}

		System.out.println("Antall tilfeldige tall:");
		for (int i = 0; i < antall.length; i++) {
			System.out.println("Tallet " + i + " oppstod " + antall[i] + " ganger");

		}

		double stjerneRepresenterer = antallGanger / 100.0;

		System.out.println();
		System.out.println("Hvert tall får en stjerne for hver " + stjerneRepresenterer + ", tallet blir rundet oppover.");

		for (int i = 0; i < antall.length; i++) {
			int antallStjerner = 0;
			double sjekk = (double) antall[i];
			double stjerneSjekk1 = 5 * (stjerneRepresenterer / 10);
			double stjerneSjekk2 = 10 * (stjerneRepresenterer / 10);

			while ((sjekk >= stjerneRepresenterer) || ((sjekk >= stjerneSjekk1) && (sjekk < stjerneSjekk2))) {
				sjekk -= stjerneRepresenterer;
				antallStjerner++;
			}

			System.out.print("Tallet " + i + " skaffet " + antallStjerner + " stjerner: ");
			for (int j = 0; j < antallStjerner; j++) {
				System.out.print("*");
			}
			System.out.println();
			antallStjerner = 0;
		}
	}
}