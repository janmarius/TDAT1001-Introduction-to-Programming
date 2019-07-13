/**
* Main.java
*
* Oppgave 2.13.2
*
* Program som regner om timer, minutter og sekunder til totalt antall sekunder.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		String timerLest = showInputDialog("Skriv inn antall timer: ");
		String minutterLest = showInputDialog("Skriv inn antall minutter: ");
		String sekunderLest = showInputDialog(" Skriv inn antall sekunder: ");
		int timer = Integer.parseInt(timerLest);
		int minutter = Integer.parseInt(minutterLest);
		int sekunder = Integer.parseInt(sekunderLest);

		int antallSekunder = (timer * 3600) + (minutter * 60) + (sekunder);

		showMessageDialog(null, timer + ":" + minutter + ":" + sekunder + " blir " + antallSekunder + " sekunder.");
	}
}

/*
* Testdatasett:
*
* Datasett		Timer		Minutter		Sekunder		Forventet resultat
*	1			  1			   1			   1					3661
*	2			  2            2               2					7322
*	3			  4			   6               43					14 803
*	4			  0            0               0                    0
*/