/**
* Tekstanalyse.java
*
* Oppgave 7.8.3
*
* Klasse for tekstanalyse
*/

class Tekstanalyse {
	public int[] antallTegn = new int[30];

	public Tekstanalyse(String tekst) {
		tekst = tekst.toUpperCase();
		for (int i = 0; i < tekst.length(); i++) {

			char tegn = tekst.charAt(i);
			int verdi = tegn;
			if (verdi >= 65 && verdi <= 90) {
				int[] sjekkTabell = new int[26];
				for (int j = 0; j < sjekkTabell.length; j++) {
					sjekkTabell[j] = j + 65;
				}
				for (int j = 0; j < (antallTegn.length - 4); j++) {
					if (sjekkTabell[j] == verdi) {
					antallTegn[j]++;
					}
				}
			} else if (verdi == 198) { //Æ
				antallTegn[26]++;
			} else if (verdi == 216) { //Ø
				antallTegn[27]++;
			} else if (verdi == 197) { //Å
				antallTegn[28]++;
			} else {
				antallTegn[29]++;
			}
		}
	}

	public int finnAntallForskjelligeBokstaver() {
		int teller = 0;
		for (int i = 0; i < (antallTegn.length - 1); i++) {
			if (antallTegn[i] != 0) {
				teller++;
			}
		}
		return teller;
	}


	public int finnTotaltAntallBokstaver() {
		int teller = 0;
		for (int i = 0; i < (antallTegn.length - 1); i++) {
			if (antallTegn[i] != 0) {
				teller += antallTegn[i];
			}
		}
		return teller;
	}


	public double finnProsentIkkeBokstav() {
		double antallBokstaver = (double) finnTotaltAntallBokstaver();
		double antallIkkeBokstaver = (double) antallTegn[29];
		double tekstLengde = antallBokstaver + antallIkkeBokstaver;
		double prosentIkkeBokstaver = (antallIkkeBokstaver * 100) / tekstLengde;
		return prosentIkkeBokstaver;
	}

	public int finnAntallForekomsterBokstav(char bokstav) {
		char bokstavUpperCase = Character.toUpperCase(bokstav);
		int verdi = bokstavUpperCase;
		if (verdi >= 65 && verdi <= 90) {
			int[] sjekkTabell = new int[26];
			for (int j = 0; j < sjekkTabell.length; j++) {
				sjekkTabell[j] = j + 65;
			}
			for (int j = 0; j < (antallTegn.length - 4); j++) {
				if (sjekkTabell[j] == verdi) {
				return antallTegn[j];
				}
			}
		} else if (verdi == 198) { //Æ
			return antallTegn[26];
		} else if (verdi == 216) { //Ø
			return antallTegn[27];
		} else if (verdi == 197) { //Å
			return antallTegn[28];
		} else {
			return antallTegn[29];
		}
		return -1;
	}


	public int maxVerdiForkomster() {
		int max = antallTegn[0];

		for (int i = 1; i < antallTegn.length - 1; i++) {
			if (antallTegn[i] > max) {
			   max = antallTegn[i];
			}
		}
		return max;
	}


	public String forekommerOftest() {

		String bokstaver = "";
		int verdi = maxVerdiForkomster();

		int[] sjekkTabell = new int[30];
		for (int j = 0; j < sjekkTabell.length - 4; j++) {
			sjekkTabell[j] = j + 65;
		}
		sjekkTabell[26] = 198;
		sjekkTabell[27] = 216;
		sjekkTabell[28] = 197;

		for (int i = 0; i < antallTegn.length - 1; i++) {
			if (antallTegn[i] == verdi) {
				char nyBokstav = (char) sjekkTabell[i];
				bokstaver += nyBokstav + " ";
			}
		}
		return bokstaver;
	}
}