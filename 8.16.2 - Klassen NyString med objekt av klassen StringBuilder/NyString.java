/**
* NyString.java
*
* Oppgave 8.16.2
*
* Klassen NyString
*/

import static javax.swing.JOptionPane.*;

class NyString {
	private static StringBuilder tekst;


	public NyString(String tekst) {
		this.tekst = new StringBuilder(tekst);
	}


	public String getTekst() {
		return tekst.toString();
	}


	public String forkortString() {
		String tekst2 = tekst.toString();
		String[] ord = tekst2.split(" ");
		String forkortet = "";
		char tegn = 0;
		for (int i = 0; i < ord.length; i++) {
			tegn = ord[i].charAt(0);
			forkortet += tegn;
		}
		return forkortet;
	}


	public String fjernTegn(char tegn) {
		int verdi = tegn;
		for (int i = 0; i < tekst.length(); i++) {
			int verdi2 = tekst.charAt(i);
			if (verdi == verdi2) {
				tekst.deleteCharAt(i);
				i--;
			}
		}
		return tekst.toString();
	}


	public static void main(String[] args) {
		String tekstLest = showInputDialog("Skriv inn tekst under: ");

		NyString tekst = new NyString(tekstLest);
		System.out.println("Teksten: " + tekst.getTekst());
		System.out.println();
		System.out.println("forkortString(): " + tekst.forkortString());
		System.out.println("fjernTegn(): " + tekst.fjernTegn('e'));
	}
}