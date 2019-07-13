/**
* Main.java
*
* Oppgave 3.12.4
*
* Lag et program som hjelper oss i forhold til følgende problemstilling:
* Kjøttdeig av merke A koster kr 35,90 for 450 gram,
* mens kjøttdeig av merke B koster kr 39,50 for 500 gram.
* Hvilket er billigst?
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		//Leser inn pris og vekt for merke A og B
		String merkeAprisLest = showInputDialog("Skriv inn pris på merke A: ");
		String merkeAvektLest = showInputDialog("Skriv inn antall gram for prisen for merke A: ");
		String merkeBprisLest = showInputDialog("Skriv inn pris på merke B: ");
		String merkeBvektLest = showInputDialog("Skriv inn antall gram for prisen for merke B: ");
		double merkeApris = Double.parseDouble(merkeAprisLest);
		double merkeAvekt = Double.parseDouble(merkeAvektLest);
		double merkeBpris = Double.parseDouble(merkeBprisLest);
		double merkeBvekt = Double.parseDouble(merkeBvektLest);

		//Regner ut pris per gram
		double prisPerGramA = merkeApris / merkeAvekt;
		double prisPerGramB = merkeBpris / merkeBvekt;

		//Formaterer pris per gram, slik de får fem desimaler
		java.util.Formatter f = new java.util.Formatter();
		java.util.Formatter f2 = new java.util.Formatter();
		f.format("%.5f", prisPerGramA);
		f2.format("%.5f", prisPerGramB);
		String prisPerGramAFormatert = f.toString();
		String prisPerGramBFormatert = f2.toString();

		if (prisPerGramA > prisPerGramB) {
			showMessageDialog(null, "Merke B er billigst, og prisen er " + prisPerGramBFormatert + " per gram!");
		} else if (prisPerGramB > prisPerGramA) {
			showMessageDialog(null, "Merke A er billigst, og prisen er " + prisPerGramAFormatert + " per gram!");
		} else {
			showMessageDialog(null, "Merke A og B har lik pris, og prisen er " + prisPerGramAFormatert + " per gram!");
		}
	}
}

/*
* Merke B er billigst.
*/