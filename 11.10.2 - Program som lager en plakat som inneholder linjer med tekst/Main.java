/**
* Main.java
*
* Oppgave 11.10.2
*
* Program som lager en plakat som inneholder linjer med tekst.
*/

import static javax.swing.JOptionPane.*;

public class Main {
	public static void main(String[] args) {

		String antallLinjerLest = showInputDialog("Hvor mange linjer vil du ha på plakaten din?");
		int antallLinjer = Integer.parseInt(antallLinjerLest);
		String[] linjeTekst = new String[antallLinjer];

		for (int i = 0; i < antallLinjer; i++) {
			linjeTekst[i] = showInputDialog("Skriv tekst i linje " + (i + 1) + ":");
		}


		Vindu vindu = new Vindu("Smiley", antallLinjer, linjeTekst);
		vindu.setVisible(true);
	}
}
