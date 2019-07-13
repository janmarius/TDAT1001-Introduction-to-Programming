/**
* Main.java
*
* Oppgave 3.12.3
*
* Et år er skuddår dersom det er delelig med 4. Unntaket er hundreårene, de må være delelig med 400.
* Program som finner ut om et år er skuddår.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {

		String årstallLest = showInputDialog("Hvilket årstall vil du sjekke om er skuddår?");
		int årstall = Integer.parseInt(årstallLest);

		String årstallSkuddår = "";
		if (årstall % 4 == 0 && !(årstall % 100 == 0)) {
			årstallSkuddår = " er skuddår!";
		} else if (årstall % 100 == 0 && årstall % 400 == 0) {
			årstallSkuddår = " er skuddår!";
		} else {
			årstallSkuddår = " er ikke skuddår!";
		}

		showMessageDialog(null, årstall + årstallSkuddår);
	}
}

/*
* Testdatasett:
*
* Datasett		Årstall		Forventet resultat
*	 1			  2018          Ikke skuddår
*    2			  1900          Ikke skuddår
*	 3			  2000             Skuddår
*    4            2008             Skuddår
*    5            1991			Ikke skuddår
*/
