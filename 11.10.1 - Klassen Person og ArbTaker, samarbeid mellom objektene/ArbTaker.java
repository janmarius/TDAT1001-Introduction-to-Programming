/**
* ArbTaker.java
*
* Oppgave 11.10.1
*
* Klassen ArbTaker
*/

import java.util.GregorianCalendar;

public class ArbTaker {
	private Person personalia;
	private int arbtakernr;
	private int ansettelses�r;
	private double m�nedsl�nn;
	private double skatteprosent;

	public ArbTaker(Person personalia, int arbtakernr, int ansettelses�r, double m�nedsl�nn, double skatteprosent) {
		this.personalia = personalia;
		this.arbtakernr = arbtakernr;
		this.ansettelses�r = ansettelses�r;
		this.m�nedsl�nn = m�nedsl�nn;
		this.skatteprosent = skatteprosent;
	}


	public String getPersonalia() {
		return personalia.toString();
	}


	public int getArbtakernr() {
		return arbtakernr;
	}


	public int getAnsettelses�r() {
		return ansettelses�r;
	}


	public double getM�nedsl�nn() {
		return m�nedsl�nn;
	}


	public double getSkatteprosent() {
		return skatteprosent;
	}


	public void setM�nedsl�nn(double nyM�nedsl�nn) {
		m�nedsl�nn = nyM�nedsl�nn;
	}


	public void setSkatteprosent(double nySkatteprosent) {
		skatteprosent = nySkatteprosent;
	}


	public double skattetrekkKronerM�ned() {
		return m�nedsl�nn * (skatteprosent / 100);
	}


	public double bruttoL�nn�r() {
		return m�nedsl�nn * 12;
	}


	public double skattetrekkKroner�r() {
		double skattDesember = m�nedsl�nn * ((skatteprosent / 2) / 100);
		return (skattetrekkKronerM�ned() * 10) + skattDesember;
	}


	public String hentNavn() {
		return personalia.getEtternavn() + ", " + personalia.getFornavn();
	}


	public int arbTakerAlder() {
		GregorianCalendar kalender = new GregorianCalendar();
		int �r = kalender.get(java.util.Calendar.YEAR);
		return �r - personalia.getF�dsels�r();
	}


	public String antall�rAnsatt() {
		GregorianCalendar kalender = new GregorianCalendar();
		int �r = kalender.get(java.util.Calendar.YEAR);
		int antall�rAnsatt = �r - ansettelses�r;
		String parameter = "Ansatt under 10 �r";
		if (antall�rAnsatt >= 10 && antall�rAnsatt < 25) {
			parameter = "Ansatt i over 10 �r";
			return parameter;
		} else if (antall�rAnsatt >= 25) {
			parameter = "Ansatt i over 25 �r";
			return parameter;
		}
		return parameter;
	}
}