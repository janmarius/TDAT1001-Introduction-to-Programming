/**
* Main.java
*
* Oppgave 4.14.2 (1)
*
* Program som tegner figur på skjermen (i kommandovinduet).
* Brukeren bestemmer antall linjer.
*/

import static javax.swing.JOptionPane.*;

class Main1 {
	public static void main(String[] args) {
		//Gjør slik bruker kan bestemme antall linjer.
		String antallLinjerLest = showInputDialog("Bestem antall linjer: ");
		int antallLinjer = Integer.parseInt(antallLinjerLest);

		//Kode som tegner figur i kommandovinduet
		if (antallLinjer > 0) {
			String stjerne = "*";
			for (int i = 0; i < antallLinjer; i++) {
				System.out.println(stjerne);
				stjerne = stjerne + "*";
			}
		} else {
			System.out.println("Antall linjer på være et heltall over 0");
		}
	}
}