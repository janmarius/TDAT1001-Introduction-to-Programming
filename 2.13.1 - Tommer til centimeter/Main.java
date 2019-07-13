/**
* Main.java
*
* Oppgave 2.13.1
*
* Program som regner om fra tommer til centimeter. En tomme er 2,54 centimeter.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		final double CM_PER_TOMME = 2.54;

		java.util.Formatter f = new java.util.Formatter();
		java.util.Formatter f2 = new java.util.Formatter();

		String antallTommerLest = showInputDialog("Hvor mange tommer vil du regne om til centimeter: ");
		double antallTommer = Double.parseDouble(antallTommerLest);
		double antallCm = (antallTommer * CM_PER_TOMME);
		f.format("%.2f", antallTommer);
		f2.format("%.2f", antallCm);
		String antallTommerFormatert = f.toString();
		String antallCmFormatert = f2.toString();
		showMessageDialog(null, antallTommerFormatert + " tommer = " + antallCmFormatert + " centimeter.");
	}
}

/*
* Testdatasett:
*
* Datasett		Tommer		Forventet resultat
*   1			  1					2.54
*   2             2					5.08
*   3             3					7.62
*   4             4					8.89
*
*/