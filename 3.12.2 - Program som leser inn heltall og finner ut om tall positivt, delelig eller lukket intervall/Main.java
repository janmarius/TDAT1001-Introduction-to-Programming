/**
* Main.java
*
* Oppgave 3.12.2
*
* Program som leser inn et heltall og finner ut følgende:
* - Er tallet positivt?
* - Er tallet delelig med gitt tall?
* - Er tallet i et gitt lukket intervall?
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		String heltallLest = showInputDialog("Skriv inn heltall: ");
		int heltall = Integer.parseInt(heltallLest);

		// Sjekker om heltallet er positivt
		String heltallPositivt = "Er ikke positivt";
		if (heltall > 0) {
			heltallPositivt = "Er positivt";
		}

		// Sjekker om heltallet er delelig med 2
		String heltallDelelig = "Er ikke delelig med 2";
		if (heltall % 2 == 0) {
			heltallDelelig = "Er delelig med 2";
		}

		// Sjekker om heltallet er i det lukket intervallet [-5,5]
		String heltallIntervall = "Er ikke i intervallet [-5,5]";
		if (heltall >= -5 && heltall <= 5) {
			heltallIntervall = "Er i intervallet [-5,5]";
		}

		showMessageDialog(null,"Heltallet: " + heltall + "\n" +
								heltallPositivt + "\n" +
								heltallDelelig + "\n" +
								heltallIntervall);
	}
}