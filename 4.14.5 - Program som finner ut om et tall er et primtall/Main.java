/**
* Main.java
*
* Oppgave 4.14.5
*
* Program som finner ut om et tall er primtall.
* Et primtall er et tall som kun kan deles med 1 og med seg selv uten å få rest.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		String tallLest = showInputDialog("Skriv inn et heltall du vil sjekke om er et primtall: ");

		while (tallLest != null) {
				int tall = Integer.parseInt(tallLest);
				boolean primtall = true;

				if (tall <= 1) {
					primtall = false;
				}
				for (int i = 2; i <= tall / 2; i++) {
					if (tall % i == 0) {
						primtall = false;
					}
				}
				if (primtall) {
					showMessageDialog(null, "Heltallet " + tall + " er et primtall!");
				} else {
					showMessageDialog(null, "Heltallet " + tall + " er ikke et primtall!");
				}
				tallLest = showInputDialog("Skriv inn et heltall du vil sjekke om er et primtall: ");
		}
		showMessageDialog(null, "Takk for at du brukte programmet!");
	}
}