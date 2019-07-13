/**
* Skoleklasse.java
*
* Oppgave 7.8.2
*
* Klassen Skoleklasse.java holder orden på fraværet til elevene i en skoleklasse.
*/

class Skoleklasse {
	private int[] fravær;

	public Skoleklasse(int antElever) {
		if (antElever >= 0) {
			fravær = new int[antElever];
		} else {
			throw new IllegalArgumentException("Antall elever kan ikke være negativt!");
		}
	}

	public int finnAntElever() {
		return fravær.length;
	}

	public int finnFravær(int elevNr) {
		int indeks = elevNr - 1;
		if (indeks >= 0 && indeks < fravær.length) {
			return fravær[indeks];
		} else {
			return -1;
		}
	}

	public int endreFravær(int elevNr, int nyttFravær) {
		int indeks = elevNr - 1;
		if (indeks >= 0 && indeks <= fravær.length) {
			return fravær[indeks] += nyttFravær;
		}
		else {
			return -1;
		}
	}

	public double finnSnittFravær() {
		double totalSum = 0;
		for (int i = 0; i < fravær.length; i++) {
			totalSum += fravær[i];
		}
		if (fravær.length > 0) {
			return totalSum / (double) fravær.length;
		} else {
			return 0.0;
		}

	}


	public int finnAntEleverUtenFravær() {
		int teller = 0;
		for (int i = 0; i < fravær.length; i++) {
			if (fravær[i] == 0) {
				teller++;
			}
		}
		return teller;
	}









	public static void main(String[] args) {

		//Test kode hentet fra Løsningsforslag til oppgave 7.8.2


		final double TOLERANSE = 0.00001; // for kontroll av beregnede gjennomsnittsverdier
		System.out.println("Antall tester: 5");

		// Testdatasett 1
		Skoleklasse klasse1 = new Skoleklasse(0);
		if (klasse1.finnAntElever() == 0 &&
		  klasse1.finnFravær(1) == -1 &&
		  (Math.abs(klasse1.finnSnittFravær()) < TOLERANSE) &&
		  klasse1.finnAntEleverUtenFravær() == 0 &&
		  klasse1.endreFravær(7, 3) == -1) {
		System.out.println("Skoleklasse: Test 1 vellykket");
		}

		// Testdatasett 2
		Skoleklasse klasse2 = new Skoleklasse(1);
		if (klasse2.endreFravær(1, 5) == 5 &&
		  klasse2.finnAntElever() == 1 &&
		  klasse2.finnFravær(1) == 5 &&
		  (Math.abs(klasse2.finnSnittFravær() - 5) < TOLERANSE) &&
		  klasse2.finnAntEleverUtenFravær() == 0 &&
		  klasse2.endreFravær(7, 3) == -1) {
		System.out.println("Skoleklasse: Test 2 vellykket");
		}

		// Testdatasett 3
		Skoleklasse klasse3 = new Skoleklasse(5);
		if (klasse3.finnAntElever() == 5 &&
		  klasse3.finnFravær(1) == 0 &&
		  (Math.abs(klasse3.finnSnittFravær()) < TOLERANSE) &&
		  klasse3.finnAntEleverUtenFravær() == 5 &&
		  klasse3.endreFravær(7, 3) == -1) {
		System.out.println("Skoleklasse: Test 3 vellykket");
		}

		// Testdatasett 4, fortsetter med klasse3
		klasse3.endreFravær(1, 5);
		klasse3.endreFravær(3, 2);
		klasse3.endreFravær(5, 1);
		if (klasse3.finnAntElever() == 5 &&
		  klasse3.finnFravær(1) == 5 &&
		  (Math.abs(klasse3.finnSnittFravær() - 1.6) < TOLERANSE) &&
		  klasse3.finnAntEleverUtenFravær() == 2 &&
		  klasse3.endreFravær(7, 3) == -1) {
		System.out.println("Skoleklasse: Test 4 vellykket");
		}

		// Testdatasett 5, fortsetter med klasse 3
		klasse3.endreFravær(1, 2);
		klasse3.endreFravær(2, 1);
		klasse3.endreFravær(3, 4);
		klasse3.endreFravær(4, 2);
		klasse3.endreFravær(5, 1);
		if (klasse3.finnAntElever() == 5 &&
		  klasse3.finnFravær(1) == 7 &&
		  (Math.abs(klasse3.finnSnittFravær() - 3.6) < TOLERANSE) &&
		  klasse3.finnAntEleverUtenFravær() == 0 &&
		  klasse3.endreFravær(7, 3) == -1) {
		System.out.println("Skoleklasse: Test 5 vellykket");
		}
	}
}