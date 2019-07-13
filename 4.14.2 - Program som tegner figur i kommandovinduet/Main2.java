/**
* Main.java
*
* Oppgave 4.14.2 (2)
*
* Program som tegner figur på skjermen (i kommandovinduet).
* Brukeren bestemmer antall linjer.
*/

import static javax.swing.JOptionPane.*;

class Main2 {
	public static void main(String[] args) {
		//Gjør slik bruker kan bestemme antall linjer.
		String antallLinjerLest = showInputDialog("Bestem antall linjer: ");
		int antallLinjer = Integer.parseInt(antallLinjerLest);

		//Kode som tegner figur i kommandovinduet
		if (antallLinjer > 0) {
			String stjerne = "*";
			int antallSpace = antallLinjer;
			for (int i = 0; i < antallLinjer; i++) {
				String space = " ";
				for (int m = 0; m < (antallSpace - 1); m++) {
					System.out.print(space);
				}
				System.out.println(stjerne);
				stjerne = stjerne + "**";
				antallSpace--;
			}
		} else {
			System.out.println("Antall linjer på være et heltall over 0");
		}
	}
}