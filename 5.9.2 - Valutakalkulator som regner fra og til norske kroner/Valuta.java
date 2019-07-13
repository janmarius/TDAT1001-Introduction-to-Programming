/**
* Valuta.java
*
* Oppgave 5.9.2
*
* Klassen Valuta
*/

class Valuta {
	private String navn;
	private double kurs;
	private int enhet;

	public Valuta(String navn, double kurs, int enhet) {
		this.navn = navn;
		this.kurs = kurs;
		this.enhet = enhet;
	}

	public double fraNok(double bel�p) {
		return bel�p / (kurs / enhet);
	}

	public double tilNok(double bel�p) {
		return kurs * bel�p / enhet;
	}

	public String toString() {
		return "Valutakode: " + navn + "\nKurs: " + kurs + "\nEnhet: " + enhet;
	}
}