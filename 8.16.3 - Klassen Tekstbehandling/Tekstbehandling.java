/**
* Tekstbehandling.java
*
* Oppgave 8.16.3
*
* Klassen Tekstbehandling
*/


class Tekstbehandling {
	private String tekst;

	public Tekstbehandling(String tekst) {
		this.tekst = tekst;
	}

	public String getTekst() {
		return tekst;
	}

	public int finnAntallOrd() {
		String[] ord = tekst.split("[ ,.!?]");
		int teller = 0;
		for (int i = 0; i < ord.length; i++) {
			if (!(ord[i].equals(""))){
				teller++;
			}
		}
		return teller;
	}


	public double finnSnittOrdlengde() {
		String[] ord = tekst.split("[ ,.!?]");
		String ordet = "";
		double totOrdlengde = 0;
		for (int i = 0; i < ord.length; i++) {
			ordet = ord[i];
			totOrdlengde += ordet.length();
		}
		return totOrdlengde / finnAntallOrd();
	}


	public double finnSnittAntallOrdPerPeriode() {
		String[] periode = tekst.split("[,.!?]");
		double periodeLengde = 0.0;
		double totPeriode = 0.0;
		for (int i = 0; i < periode.length; i++) {
			String[] ord = periode[i].split("[ ]");
			int teller = 0;
			for (int j = 0; j < ord.length; j++) {
				if (!(ord[j].equals(""))){
					teller++;
				}
			}
			periodeLengde += (double) teller;
			totPeriode++;
		}
		return periodeLengde / totPeriode;
	}


	public String skiftUtOrd(String ord, String nyttOrd) {
		return tekst.replaceAll(ord, nyttOrd);

	}

	public String getTekstUpperCase() {
		String tekstKopi = tekst;
		String tekstStor = tekstKopi.toUpperCase();
		return tekstStor;
	}

	public static void main(String[] args) {
		Tekstbehandling test = new Tekstbehandling("Ole går på Bakkeland-skole, og på Bakkeland-skole trives han godt!");

		System.out.println("Antall ord i teksten: " + test.finnAntallOrd());
		System.out.println("Gjennomsnittlig ordlengde: " + test.finnSnittOrdlengde());
		System.out.println("Gjennomsnittlig antall ord per periode: " + test.finnSnittAntallOrdPerPeriode());
		System.out.println("Skifter ordet 'Bakkeland' til 'Åseby: " + test.skiftUtOrd("Bakkeland", "Åseby"));
		System.out.println("Henter ut original tekst: " + test.getTekst());
		System.out.println("Henter ut original tekst, men bare i store bokstaver: " + test.getTekstUpperCase());
	}
}