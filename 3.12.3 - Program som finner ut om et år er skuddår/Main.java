/**
* Main.java
*
* Oppgave 3.12.3
*
* Et �r er skudd�r dersom det er delelig med 4. Unntaket er hundre�rene, de m� v�re delelig med 400.
* Program som finner ut om et �r er skudd�r.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {

		String �rstallLest = showInputDialog("Hvilket �rstall vil du sjekke om er skudd�r?");
		int �rstall = Integer.parseInt(�rstallLest);

		String �rstallSkudd�r = "";
		if (�rstall % 4 == 0 && !(�rstall % 100 == 0)) {
			�rstallSkudd�r = " er skudd�r!";
		} else if (�rstall % 100 == 0 && �rstall % 400 == 0) {
			�rstallSkudd�r = " er skudd�r!";
		} else {
			�rstallSkudd�r = " er ikke skudd�r!";
		}

		showMessageDialog(null, �rstall + �rstallSkudd�r);
	}
}

/*
* Testdatasett:
*
* Datasett		�rstall		Forventet resultat
*	 1			  2018          Ikke skudd�r
*    2			  1900          Ikke skudd�r
*	 3			  2000             Skudd�r
*    4            2008             Skudd�r
*    5            1991			Ikke skudd�r
*/
