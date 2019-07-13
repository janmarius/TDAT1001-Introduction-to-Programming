/**
* Main.java
*
* Oppgave 3.12.1
*
* Program som leser inn f�dselsdagen og skriver ut kontornummeret.
*/


import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {

		String f�dselsdagLest = showInputDialog("Skriv inn din f�dselsdag: ");
		int f�dselsdag = Integer.parseInt(f�dselsdagLest);

		if (f�dselsdag >=1 && f�dselsdag <9) {
			showMessageDialog(null, "Kontor: 113");
		} else if (f�dselsdag >=9 && f�dselsdag <15)  {
			showMessageDialog(null, "Kontor: 120");
		} else if (f�dselsdag >=15 && f�dselsdag <26)  {
			showMessageDialog(null, "Kontor: 125");
		} else if (f�dselsdag >=26 && f�dselsdag <32)  {
			showMessageDialog(null, "Kontor: 134");
		} else {
			showMessageDialog(null, "Du har skrevet inn ugyldig f�dselsdag!");
		}
	}
}

/*
* Program printer ut riktig Kontor.
* Det gir ogs� feilmelding dersom bruker skriver inn 1 > f�dselsdag > 31
*/