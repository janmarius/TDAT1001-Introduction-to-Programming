/**
* Matrise.java
*
* Oppgave 9.11.3
*
* Klassen Matrise
* Inneholder metoder for å:
* - Addere en matrise til denne matrisen
* - Multiplisere denne matrisen til denne matrisen
* - Transponere matrisen
*/

class Matrise {
	private double[][] matrise;

	public Matrise(int rader, int kolonner) {
		matrise = new double[rader][kolonner];
	}


	public int antallRader() {
		return matrise.length;
	}


	public int antallKolonner() {
		return matrise[0].length;
	}


	public double finnVerdi(int rad, int kolonne) {
		return matrise[rad][kolonne];
	}


	public void settInnVerdi(int rad, int kolonne, double verdi) {
		matrise[rad][kolonne] = verdi;
	}


	public Matrise adderMatrise(Matrise matrise2) {

		if (antallRader() == matrise2.antallRader() && antallKolonner() == matrise2.antallKolonner()) {
			Matrise nyMatrise = new Matrise(antallRader(), antallKolonner());
			for (int i = 0; i < antallRader(); i++) {
				for (int j = 0; j < antallKolonner(); j++) {
					nyMatrise.settInnVerdi(i, j, matrise[i][j] + matrise2.finnVerdi(i, j));
				}
			}
			return nyMatrise;
		}
		return null;
	}


	public Matrise multipliserMatrise(Matrise matrise2) {

		if (antallKolonner() == matrise2.antallRader()){


			Matrise nyMatrise = new Matrise(antallRader(), matrise2.antallKolonner());
			for (int i = 0; i < antallRader(); i++) {
				for (int j = 0; j < antallKolonner(); j++) {
					for (int k = 0; k < antallKolonner(); k++) {
						nyMatrise.settInnVerdi(i, j, nyMatrise.finnVerdi(i, j) + matrise[i][k] * matrise2.finnVerdi(k, j));
					}
				}
			}
			return nyMatrise;
		}
		return null;
	}


	public Matrise transponerMatrise(Matrise matrise2) {
		Matrise nyMatrise = new Matrise(matrise2.antallKolonner(), matrise2.antallRader());

		for (int i = 0; i < nyMatrise.antallRader(); i++) {
			for (int j = 0; j < nyMatrise.antallKolonner(); j++) {
				nyMatrise.settInnVerdi(i, j, matrise2.finnVerdi(j, i));
			}
		}
		return nyMatrise;

	}


	public String toString() {
		String res = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				res += matrise[i][j] + "\t";
			}
			res += "\n";
		}
		return res;
	}
}