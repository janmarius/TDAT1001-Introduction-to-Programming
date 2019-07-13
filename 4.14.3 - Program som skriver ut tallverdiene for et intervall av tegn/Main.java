/**
* Main.java
*
* Oppgave 4.14.3
*
* Program som skriver ut tallverdiene for et intervall av tegn.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		String tegn1Lest = showInputDialog("Skriv inn første tall i intervallet: ");
		String tegn2Lest = showInputDialog("Skriv inn andre tall i intervallet: ");

		char tegn1 = tegn1Lest.charAt(0);
		char tegn2 = tegn2Lest.charAt(0);

		if (tegn1 <= tegn2) {
			for (char i = tegn1; i <= tegn2; i++) {
				int tegnTall = i;
				System.out.println("Tegnet " + i + " har tallverdien " + tegnTall);
			}
		} else if (tegn1 >= tegn2) {
			for (char i = tegn2; i <= tegn1; i++) {
				int tegnTall = i;
				System.out.println("Tegnet " + i + " har tallverdien " + tegnTall);
			}
		} else {
			showMessageDialog(null, "Ugyldig verdi!");
		}
	}
}