/**
* Main.java
*
* Oppgave 3.12.1
*
* Program som leser inn fødselsdagen og skriver ut kontornummeret.
*/


import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {

		String fødselsdagLest = showInputDialog("Skriv inn din fødselsdag: ");
		int fødselsdag = Integer.parseInt(fødselsdagLest);

		if (fødselsdag >=1 && fødselsdag <9) {
			showMessageDialog(null, "Kontor: 113");
		} else if (fødselsdag >=9 && fødselsdag <15)  {
			showMessageDialog(null, "Kontor: 120");
		} else if (fødselsdag >=15 && fødselsdag <26)  {
			showMessageDialog(null, "Kontor: 125");
		} else if (fødselsdag >=26 && fødselsdag <32)  {
			showMessageDialog(null, "Kontor: 134");
		} else {
			showMessageDialog(null, "Du har skrevet inn ugyldig fødselsdag!");
		}
	}
}

/*
* Program printer ut riktig Kontor.
* Det gir også feilmelding dersom bruker skriver inn 1 > fødselsdag > 31
*/