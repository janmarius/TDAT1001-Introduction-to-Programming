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
	private int ansettelsesår;
	private double månedslønn;
	private double skatteprosent;

	public ArbTaker(Person personalia, int arbtakernr, int ansettelsesår, double månedslønn, double skatteprosent) {
		this.personalia = personalia;
		this.arbtakernr = arbtakernr;
		this.ansettelsesår = ansettelsesår;
		this.månedslønn = månedslønn;
		this.skatteprosent = skatteprosent;
	}


	public String getPersonalia() {
		return personalia.toString();
	}


	public int getArbtakernr() {
		return arbtakernr;
	}


	public int getAnsettelsesår() {
		return ansettelsesår;
	}


	public double getMånedslønn() {
		return månedslønn;
	}


	public double getSkatteprosent() {
		return skatteprosent;
	}


	public void setMånedslønn(double nyMånedslønn) {
		månedslønn = nyMånedslønn;
	}


	public void setSkatteprosent(double nySkatteprosent) {
		skatteprosent = nySkatteprosent;
	}


	public double skattetrekkKronerMåned() {
		return månedslønn * (skatteprosent / 100);
	}


	public double bruttoLønnÅr() {
		return månedslønn * 12;
	}


	public double skattetrekkKronerÅr() {
		double skattDesember = månedslønn * ((skatteprosent / 2) / 100);
		return (skattetrekkKronerMåned() * 10) + skattDesember;
	}


	public String hentNavn() {
		return personalia.getEtternavn() + ", " + personalia.getFornavn();
	}


	public int arbTakerAlder() {
		GregorianCalendar kalender = new GregorianCalendar();
		int år = kalender.get(java.util.Calendar.YEAR);
		return år - personalia.getFødselsår();
	}


	public String antallÅrAnsatt() {
		GregorianCalendar kalender = new GregorianCalendar();
		int år = kalender.get(java.util.Calendar.YEAR);
		int antallÅrAnsatt = år - ansettelsesår;
		String parameter = "Ansatt under 10 år";
		if (antallÅrAnsatt >= 10 && antallÅrAnsatt < 25) {
			parameter = "Ansatt i over 10 år";
			return parameter;
		} else if (antallÅrAnsatt >= 25) {
			parameter = "Ansatt i over 25 år";
			return parameter;
		}
		return parameter;
	}
}