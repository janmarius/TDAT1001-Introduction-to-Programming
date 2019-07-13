/**
* Prosjekt.java
*
* Oppgave 5.9.1
*
* Klassen prosjekt
*/

class Prosjekt {
	private final String prosjekttittel;
	private final String ansvarligPerson;
	private double budsjett;

	public Prosjekt(String prosjekttittel, String ansvarligPerson, double budsjett) {
		this.prosjekttittel = prosjekttittel;
		this.ansvarligPerson = ansvarligPerson;
		this.budsjett = budsjett;
	}

	public String getProsjekttittel() {
		return prosjekttittel;
	}

	public String getAnsvarligPerson() {
		return ansvarligPerson;
	}

	public double getBudsjett() {
		return budsjett;
	}

	public boolean registrerPengebel�p(double bel�p) {
		if (budsjett - bel�p >= 0) {
			budsjett -= bel�p;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Prosjekttittel: " + prosjekttittel + "\nAnsvarlig person: " + ansvarligPerson + "\nBudsjett: " + budsjett;
	}
}