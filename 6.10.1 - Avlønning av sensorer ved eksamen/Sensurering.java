/**
* Sensurering.java
*
* Oppgave 6.10.1
*
* Klassen Sensurering
*/

class Sensurering {
	public final double FORBEREDELSE_MUNTLIG = 3.0;
	public final double FORBEREDELSE_SKRIFTLIG = 3.0;
	public final double MINIMUM_BESVARELSER = 0.15;
	public final double MAX_BESVARELSER = 0.10;
	public final double TIMER_PER_PROSJEKT = 8.0;


	private String fag;
	private String type;
	private double tid;
	private int antallBesvarelser;

	public Sensurering(String fag, String type, double tid, int antallBesvarelser) {
		this.fag = fag;
		this.type = type;
		this.tid = tid;
		this.antallBesvarelser = antallBesvarelser;
	}

	public Sensurering(String fag, String type, double tid) {
		this.fag = fag;
		this.type = type;
		this.tid = tid;
	}

	public Sensurering(String fag, String type, int antallBesvarelser) {
		this.fag = fag;
		this.type = type;
		this.antallBesvarelser = antallBesvarelser;
	}


	public double beregnMuntlig() {
		if ((FORBEREDELSE_MUNTLIG + tid) > 0 && tid > 0) {
			return FORBEREDELSE_MUNTLIG + tid;
		} else {
			return -1;
		}
	}


	public double beregnSkriftelig() {
		if (antallBesvarelser <= 10 && antallBesvarelser > 0 && tid > 0) {
			return FORBEREDELSE_SKRIFTLIG + (antallBesvarelser * tid * MINIMUM_BESVARELSER);
		} else if (antallBesvarelser > 10 && tid > 0) {
			return FORBEREDELSE_SKRIFTLIG + (10 * tid * MINIMUM_BESVARELSER) + ((antallBesvarelser - 10) * tid * MAX_BESVARELSER);
		}
		return -1;
	}


	public double beregnProsjekt() {
		if ((TIMER_PER_PROSJEKT * antallBesvarelser) > 0) {
			return TIMER_PER_PROSJEKT * antallBesvarelser;
		}
		return -1;
	}


	public String toString() {
		return "Fag: " + fag + "\nEksamenstype: " + type + "\nEksamenstid: " + tid + "\nAntall besvarelser: " + antallBesvarelser;
	}
}