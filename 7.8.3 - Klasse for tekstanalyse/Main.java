/**
* Tekstanalyse.java
*
* Oppgave 7.8.3
*
* Klasse for tekstanalyse
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		// Får inn teskten fra bruker
		String teksten = showInputDialog("Skriv inn teksten du vil analysere: ");
		String hvilkenBokstavLest = showInputDialog("Hvilken bokstav vil du sjekke antall forekomster av: ");
		char hvilkenBokstav = hvilkenBokstavLest.charAt(0);
		String bokstaven = hvilkenBokstavLest.toUpperCase();

		while (teksten != null && hvilkenBokstavLest != null) {


			System.out.println("Teksten:\n" + teksten);

			Tekstanalyse test = new Tekstanalyse(teksten);

			System.out.println();
			System.out.println("Antall forskjellige bokstaver er: " + test.finnAntallForskjelligeBokstaver());
			System.out.println("Totalt antall bokstaver er: " + test.finnTotaltAntallBokstaver());
			System.out.println("Prosent ikke bokstaver: " + test.finnProsentIkkeBokstav());
			System.out.println("Antall ganger bokstaven '" + bokstaven + "' forekommer: " + test.finnAntallForekomsterBokstav(hvilkenBokstav));
			System.out.println("Bokstaven(e) med flest forekomster, hadde " + test.maxVerdiForkomster() + " forekomster og bokstaven(e) er: " + test.forekommerOftest());
			System.out.println();


			teksten = showInputDialog("Skriv inn teksten du vil analysere: ");
			hvilkenBokstavLest = showInputDialog("Hvilken bokstav vil du sjekke antall forekomster av: ");
			hvilkenBokstav = hvilkenBokstavLest.charAt(0);
		    bokstaven = hvilkenBokstavLest.toUpperCase();
		}
	}
}