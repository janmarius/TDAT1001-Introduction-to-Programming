/**
* Skoleklasse.java
*
* Oppgave 7.8.2
*
* Klassen Skoleklasse.java holder orden p� frav�ret til elevene i en skoleklasse.
*/

class Skoleklasse {
	private int[] frav�r;

	public Skoleklasse(int antElever) {
		if (antElever >= 0) {
			frav�r = new int[antElever];
		} else {
			throw new IllegalArgumentException("Antall elever kan ikke v�re negativt!");
		}
	}

	public int finnAntElever() {
		return frav�r.length;
	}

	public int finnFrav�r(int elevNr) {
		int indeks = elevNr - 1;
		if (indeks >= 0 && indeks < frav�r.length) {
			return frav�r[indeks];
		} else {
			return -1;
		}
	}

	public int endreFrav�r(int elevNr, int nyttFrav�r) {
		int indeks = elevNr - 1;
		if (indeks >= 0 && indeks <= frav�r.length) {
			return frav�r[indeks] += nyttFrav�r;
		}
		else {
			return -1;
		}
	}

	public double finnSnittFrav�r() {
		double totalSum = 0;
		for (int i = 0; i < frav�r.length; i++) {
			totalSum += frav�r[i];
		}
		if (frav�r.length > 0) {
			return totalSum / (double) frav�r.length;
		} else {
			return 0.0;
		}

	}


	public int finnAntEleverUtenFrav�r() {
		int teller = 0;
		for (int i = 0; i < frav�r.length; i++) {
			if (frav�r[i] == 0) {
				teller++;
			}
		}
		return teller;
	}









	public static void main(String[] args) {

		//Test kode hentet fra L�sningsforslag til oppgave 7.8.2


		final double TOLERANSE = 0.00001; // for kontroll av beregnede gjennomsnittsverdier
		System.out.println("Antall tester: 5");

		// Testdatasett 1
		Skoleklasse klasse1 = new Skoleklasse(0);
		if (klasse1.finnAntElever() == 0 &&
		  klasse1.finnFrav�r(1) == -1 &&
		  (Math.abs(klasse1.finnSnittFrav�r()) < TOLERANSE) &&
		  klasse1.finnAntEleverUtenFrav�r() == 0 &&
		  klasse1.endreFrav�r(7, 3) == -1) {
		System.out.println("Skoleklasse: Test 1 vellykket");
		}

		// Testdatasett 2
		Skoleklasse klasse2 = new Skoleklasse(1);
		if (klasse2.endreFrav�r(1, 5) == 5 &&
		  klasse2.finnAntElever() == 1 &&
		  klasse2.finnFrav�r(1) == 5 &&
		  (Math.abs(klasse2.finnSnittFrav�r() - 5) < TOLERANSE) &&
		  klasse2.finnAntEleverUtenFrav�r() == 0 &&
		  klasse2.endreFrav�r(7, 3) == -1) {
		System.out.println("Skoleklasse: Test 2 vellykket");
		}

		// Testdatasett 3
		Skoleklasse klasse3 = new Skoleklasse(5);
		if (klasse3.finnAntElever() == 5 &&
		  klasse3.finnFrav�r(1) == 0 &&
		  (Math.abs(klasse3.finnSnittFrav�r()) < TOLERANSE) &&
		  klasse3.finnAntEleverUtenFrav�r() == 5 &&
		  klasse3.endreFrav�r(7, 3) == -1) {
		System.out.println("Skoleklasse: Test 3 vellykket");
		}

		// Testdatasett 4, fortsetter med klasse3
		klasse3.endreFrav�r(1, 5);
		klasse3.endreFrav�r(3, 2);
		klasse3.endreFrav�r(5, 1);
		if (klasse3.finnAntElever() == 5 &&
		  klasse3.finnFrav�r(1) == 5 &&
		  (Math.abs(klasse3.finnSnittFrav�r() - 1.6) < TOLERANSE) &&
		  klasse3.finnAntEleverUtenFrav�r() == 2 &&
		  klasse3.endreFrav�r(7, 3) == -1) {
		System.out.println("Skoleklasse: Test 4 vellykket");
		}

		// Testdatasett 5, fortsetter med klasse 3
		klasse3.endreFrav�r(1, 2);
		klasse3.endreFrav�r(2, 1);
		klasse3.endreFrav�r(3, 4);
		klasse3.endreFrav�r(4, 2);
		klasse3.endreFrav�r(5, 1);
		if (klasse3.finnAntElever() == 5 &&
		  klasse3.finnFrav�r(1) == 7 &&
		  (Math.abs(klasse3.finnSnittFrav�r() - 3.6) < TOLERANSE) &&
		  klasse3.finnAntEleverUtenFrav�r() == 0 &&
		  klasse3.endreFrav�r(7, 3) == -1) {
		System.out.println("Skoleklasse: Test 5 vellykket");
		}
	}
}