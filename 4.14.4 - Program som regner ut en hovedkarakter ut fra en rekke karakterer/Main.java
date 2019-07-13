/**
* Main.java
*
* Oppgave 4.14.4
*
* Program som regnet ut en "hovedkarakter" ut fra en rekke karakterer.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		String karakterLest = showInputDialog("Skriv inn karakter (A-E), avslutt med Esc: ");
		double sum = 0;
		double teller = 0;

		while (karakterLest != null) {
			char karakter = karakterLest.charAt(0);
			if (karakter >= 65 && karakter <= 70) {
				karakter = karakterLest.charAt(0);
				double karakterVerdi = karakter;
				sum += karakterVerdi;
				teller++;
				karakterLest = showInputDialog("Skriv inn karakter, avslutt med Esc: ");
			} else {
				karakterLest = showInputDialog("Ugyldig karakter!\nSkriv inn karakter (A-E) , avslutt med Esc: ");
			}
		}
		double gjennomsnittsVerdi = sum / teller;
		if (gjennomsnittsVerdi >= 65 && gjennomsnittsVerdi <= 65.5) {
			showMessageDialog(null, "Du har fått karakteren A");
		} else if (gjennomsnittsVerdi > 65.5 && gjennomsnittsVerdi <= 66.5) {
			showMessageDialog(null, "Du har fått karakteren B");
		} else if (gjennomsnittsVerdi > 66.5 && gjennomsnittsVerdi <= 67.5) {
			showMessageDialog(null, "Du har fått karakteren C");
		} else if (gjennomsnittsVerdi > 67.5 && gjennomsnittsVerdi <= 68.5) {
			showMessageDialog(null, "Du har fått karakteren D");
		} else if (gjennomsnittsVerdi > 68.5 && gjennomsnittsVerdi <= 69) {
			showMessageDialog(null, "Du har fått karakteren E");
		} else {
			showMessageDialog(null, "Ingen karakter har blitt lest inn!");
		}
	}
}