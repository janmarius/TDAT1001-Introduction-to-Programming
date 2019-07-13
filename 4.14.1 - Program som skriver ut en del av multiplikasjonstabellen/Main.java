/**
* Main.java
*
* Oppgave 4.14.1
*
* Program som skriver ut en del av multiplikasjonstabellen.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		String fraLest;
		String tilLest;
		int fra;
		int til;

		do {
			fraLest = showInputDialog("Hvilken multiplikasjonstabell vil du regne fra: ");
			tilLest = showInputDialog("Hvilken multiplikasjonstabell vil du regne til: ");
			fra = Integer.parseInt(fraLest);
			til = Integer.parseInt(tilLest);
			if (fra > til) {
				System.out.println("Velg lavest multiplikasjonstabell først!");
			}

		} while (fra > til);
		for (int i = fra; i <= til; i++) {
			System.out.println(i + "-gangen:");
			for (int m = 1; m < 11; m++) {
				int sum = i * m;
				System.out.println(i + " x " + m + " = " + sum);
			}
			System.out.println("\n");
		}
	}
}