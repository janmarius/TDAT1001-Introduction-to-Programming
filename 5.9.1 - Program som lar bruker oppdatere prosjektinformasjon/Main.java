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
			String budsjettLest = showInputDialog("Hvor mye er budsjettet p�: \nBudsjettet m� v�re positivt!");
			budsjett = Double.parseDouble(budsjettLest);
		} while (budsjett <= 0);

		Prosjekt prosjekt = new Prosjekt(prosjekttittel, ansvarligPerson, budsjett);
		String pengebl�pLest = showInputDialog(prosjekt.toString() + "\nRegistrer nytt pengebel�p: ");
		double pengebel�p = Double.parseDouble(pengebl�pLest);
		prosjekt.registrerPengebel�p(pengebel�p);
		if (prosjekt.registrerPengebel�p(pengebel�p)) {
			showMessageDialog(null,"Ditt pengebel�p p� " + pengebel�p + " kroner, ble trekt fra.\nDitt bel�p er n� " + prosjekt.getBudsjett() + " kroner");
		} else {
			showMessageDialog(null,"Ditt pengebel�p p� " + pengebel�p + " kroner, ble IKKE trekt fra.\nDitt bel�p er fortsatt p� " + prosjekt.getBudsjett() + " kroner");
		}
		while (prosjekt.getBudsjett() > 0) {
			pengebl�pLest = showInputDialog(prosjekt.toString() + "\nRegistrer nytt pengebel�p: ");
			pengebel�p = Double.parseDouble(pengebl�pLest);
			if (prosjekt.registrerPengebel�p(pengebel�p)) {
				showMessageDialog(null,"Ditt pengebel�p p� " + pengebel�p + " kroner, ble trekt fra.\nDitt bel�p er n� " + prosjekt.getBudsjett() + " kroner");
			} else {
				showMessageDialog(null,"Ditt pengebel�p p� " + pengebel�p + " kroner, ble IKKE trekt fra.\nDitt bel�p er fortsatt p� " + prosjekt.getBudsjett() + " kroner");
			}
		}

		showMessageDialog(null,"Budsjettet ditt er tomt, venligst kontakt banken din");
	}
}