/**
* Main.java
*
* Oppgave 2.13.3
*
* Program som leser inn et antall sekunder og beregner hvor mange timer,
* minutter og sekunder dette er.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		final int SEK_PER_TIME = 3600;
		final int SEK_PER_MINUTT = 60;

		String antallSekunderLest = showInputDialog("Skriv inn antall sekunder: ");
		int antallSekunder = Integer.parseInt(antallSekunderLest);

		int antallTimer = antallSekunder / SEK_PER_TIME;
		antallSekunder = antallSekunder - (antallTimer * SEK_PER_TIME);

		int antallMinutter = antallSekunder / SEK_PER_MINUTT;
		antallSekunder = antallSekunder - (antallMinutter * SEK_PER_MINUTT);

		showMessageDialog(null, "Timer: " + antallTimer +
								"\nMinutter: " + antallMinutter +
								"\nSekunder: " + antallSekunder);
	}
}

/*
* Testdatasett:
*
* Datasett		Sekunder		Forventet resultat
*	1			  3661			1 timer 1 minutter 1 sekunder
*	2			    1			0 timer 0 minutter 1 sekunder
*	3			  8000			2 timer 13 minutter 20 sekunder
*	4		      15.5			Feilmelding
*	5		      -3661         -1 timer -1 minutter -1 sekunder (Programmet burde gi feilmelding)
*/