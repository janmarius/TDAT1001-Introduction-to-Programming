/**
* Main.java
*
* Oppgave 5.9.2
*
* Valutakalkulator som regner fra og til norske kroner
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		Valuta USD = new Valuta("USD", 8.1427, 1);
		Valuta EUR = new Valuta("EUR", 9.4893, 1);
		Valuta SEK = new Valuta("SEK", 90.34, 100);



		String valgLest = showInputDialog("Hvilken valuta vil du regne med:\n1: USD \n2: EUR \n3: SEK \n\n4:Avslutt(ESC)");
		int valg = Integer.parseInt(valgLest);


		while (valg != 4 && valgLest != null) {
			if (valg >= 1 && valg <= 3) {
				String valg2 = showInputDialog("Hvor stort beløp vil du regne om: ");
				double beløp = Double.parseDouble(valg2);
				int tilEllerFra = showConfirmDialog(null, "Skal du regne fra NOK  ?", "Valuta", YES_NO_OPTION);
				boolean fraNok = (tilEllerFra == YES_OPTION);
				String valutaTil = "";
				String valutaFra = "";
				double beløpBeregnet = 0;

				switch (valg) {
					case 1:
						if (fraNok) {
							beløpBeregnet = USD.fraNok(beløp);
							valutaTil = "USD";
							valutaFra = "NOK";
						} else {
							beløpBeregnet = USD.tilNok(beløp);
							valutaTil = "NOK";
							valutaFra = "USD";
						}
						break;

					case 2:
						if (fraNok) {
							beløpBeregnet = EUR.fraNok(beløp);
							valutaTil = "EUR";
							valutaFra = "NOK";
						} else {
							beløpBeregnet = EUR.tilNok(beløp);
							valutaTil = "NOK";
							valutaFra = "EUR";
						}
						break;

					case 3:
						if (fraNok) {
							beløpBeregnet = SEK.fraNok(beløp);
							valutaTil = "SEK";
							valutaFra = "NOK";
						} else {
							beløpBeregnet = SEK.tilNok(beløp);
							valutaTil = "NOK";
							valutaFra = "SEK";
						}
						break;

					default:
						break;
				}
				showMessageDialog(null, beløp + " " + valutaFra + " = " + beløpBeregnet + " " + valutaTil);
				valgLest = showInputDialog("Hvilken valuta vil du regne med:\n1: USD \n2: EUR \n3: SEK \n\n4:Avslutt(ESC)");
				valg = Integer.parseInt(valgLest);
			} else if (valg != 4) {
				showMessageDialog(null, "Ugyldig menyvalg, vennligs prøv igjen!");
				valgLest = showInputDialog("Hvilken valuta vil du regne med:\n1: USD \n2: EUR \n3: SEK \n\n4:Avslutt(ESC)");
				valg = Integer.parseInt(valgLest);
			}
		}
	}
}

/*
* USD:
* 150 NOK = 18,36 USD
* 150 USD = 1225,20 NOK
*
* EUR
* 75 NOK = 7,88 EUR
* 75 EUR = 713,03 NOK
*
* SEK
* 350 NOK = 384,55 SEK
* 350 SEK = 318,55 NOK
*/