/**
* Main.java
*
* Oppgave 5.9.1
*
* Program som lar bruker oppdatere prosjektinformasjon
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		String prosjekttittel = showInputDialog("Prosjekttittel: ");
		String ansvarligPerson = showInputDialog("Hve er ansvarlig for prosjektet: ");
		double budsjett;

		do {
			String budsjettLest = showInputDialog("Hvor mye er budsjettet på: \nBudsjettet må være positivt!");
			budsjett = Double.parseDouble(budsjettLest);
		} while (budsjett <= 0);

		Prosjekt prosjekt = new Prosjekt(prosjekttittel, ansvarligPerson, budsjett);
		String pengebløpLest = showInputDialog(prosjekt.toString() + "\nRegistrer nytt pengebeløp: ");
		double pengebeløp = Double.parseDouble(pengebløpLest);
		prosjekt.registrerPengebeløp(pengebeløp);
		if (prosjekt.registrerPengebeløp(pengebeløp)) {
			showMessageDialog(null,"Ditt pengebeløp på " + pengebeløp + " kroner, ble trekt fra.\nDitt beløp er nå " + prosjekt.getBudsjett() + " kroner");
		} else {
			showMessageDialog(null,"Ditt pengebeløp på " + pengebeløp + " kroner, ble IKKE trekt fra.\nDitt beløp er fortsatt på " + prosjekt.getBudsjett() + " kroner");
		}
		while (prosjekt.getBudsjett() > 0) {
			pengebløpLest = showInputDialog(prosjekt.toString() + "\nRegistrer nytt pengebeløp: ");
			pengebeløp = Double.parseDouble(pengebløpLest);
			if (prosjekt.registrerPengebeløp(pengebeløp)) {
				showMessageDialog(null,"Ditt pengebeløp på " + pengebeløp + " kroner, ble trekt fra.\nDitt beløp er nå " + prosjekt.getBudsjett() + " kroner");
			} else {
				showMessageDialog(null,"Ditt pengebeløp på " + pengebeløp + " kroner, ble IKKE trekt fra.\nDitt beløp er fortsatt på " + prosjekt.getBudsjett() + " kroner");
			}
		}

		showMessageDialog(null,"Budsjettet ditt er tomt, venligst kontakt banken din");
	}
}