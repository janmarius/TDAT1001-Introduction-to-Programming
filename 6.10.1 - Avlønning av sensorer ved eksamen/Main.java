/**
* Main.java
*
* Oppgave 6.10.1
*
* Avlønning av sensorer ved eksamen
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {

		String fagLest = showInputDialog("Fag: ");
		String typeLest = showInputDialog("Hvilken eksamenstype: \n1. Skriftelig\n2. Muntlig \n3. Prosjekt\n4. Avslutt(ESC)");
		int type = Integer.parseInt(typeLest);

		while ((type != 4 && typeLest != null) || fagLest != null) {


			switch (type) {
				case 1:
					String tidLest = showInputDialog("Eksamenstid: ");
					String antallBesvarelserLest = showInputDialog("Antall besvarelser: ");
					double tid = Double.parseDouble(tidLest);
					int antallBesvarelser = Integer.parseInt(antallBesvarelserLest);
					Sensurering sensureringSkriftelig = new Sensurering(fagLest, "Skriftelig", tid, antallBesvarelser);

					if (sensureringSkriftelig.beregnSkriftelig() > 0) {
						showMessageDialog(null, sensureringSkriftelig.toString() + "\n\nAntall timer: " + sensureringSkriftelig.beregnSkriftelig());
					} else {
						showMessageDialog(null, "Noe gikk galt, vennligst prøv igjen!");
					}

					fagLest = showInputDialog("Fag: ");
			 		typeLest = showInputDialog("Hvilken eksamenstype: \n1. Skriftelig\n2. Muntlig \n3. Prosjekt\n4. Avslutt(ESC)");
			 		type = Integer.parseInt(typeLest);
					break;

				case 2:
					String tidLest2 = showInputDialog("Eksamenstid: ");
					double tid2 = Double.parseDouble(tidLest2);
					Sensurering sensureringMuntlig = new Sensurering(fagLest, "Muntlig", tid2);

					if (sensureringMuntlig.beregnMuntlig() > 0) {
						showMessageDialog(null, sensureringMuntlig.toString() + "\n\nAntall timer: " + sensureringMuntlig.beregnMuntlig());
					} else {
						showMessageDialog(null, "Noe gikk galt, vennligst prøv igjen!");
					}

					fagLest = showInputDialog("Fag: ");
					typeLest = showInputDialog("Hvilken eksamenstype: \n1. Skriftelig\n2. Muntlig \n3. Prosjekt\n4. Avslutt(ESC)");
			 		type = Integer.parseInt(typeLest);
					break;

				case 3:
					String antallBesvarelserLest3 = showInputDialog("Antall besvarelser: ");
					int antallBesvarelser3 = Integer.parseInt(antallBesvarelserLest3);
					Sensurering sensureringProsjekt = new Sensurering(fagLest, "Prosjekt", antallBesvarelser3);

					if (sensureringProsjekt.beregnProsjekt() > 0) {
						showMessageDialog(null, sensureringProsjekt.toString() + "\n\nAntall timer: " + sensureringProsjekt.beregnProsjekt());
					} else {
						showMessageDialog(null, "Noe gikk galt, vennligst prøv igjen!");
					}

					fagLest = showInputDialog("Fag: ");
					typeLest = showInputDialog("Hvilken eksamenstype: \n1. Skriftelig\n2. Muntlig \n3. Prosjekt\n4. Avslutt(ESC)");
			 		type = Integer.parseInt(typeLest);
					break;
			}
		}
	}
}