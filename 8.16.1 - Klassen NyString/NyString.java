/**
* NyString.java
*
* Oppgave 8.16.1
*
* Klassen NyString
*/


class NyString {
	private static String tekst;


	public NyString(String tekst) {
		this.tekst = tekst;
	}


	public String getTekst() {
		return tekst;
	}


	public String forkortString() {
		String[] ord = tekst.split(" ");
		String forkortet = "";
		char tegn = 0;
		for (int i = 0; i < ord.length; i++) {
			tegn = ord[i].charAt(0);
			forkortet += tegn;
		}
		return forkortet;
	}


	public String fjernTegn(char tegn) {
		String nyString = tekst;
		int startPos = 0;
		int sluttPos = tekst.indexOf(tegn);
		if(sluttPos >= 0) {
			nyString = "";
			boolean tegnEksisterer = true;
			while (tegnEksisterer) {
				if(sluttPos >= 0) {
					String deltekst = tekst.substring(startPos, sluttPos);
					nyString += deltekst;
					startPos = sluttPos + 1;
					sluttPos = tekst.indexOf(tegn, sluttPos + 1);
				} else {
					tegnEksisterer = false;
				}
			}
			nyString += tekst.substring(startPos, tekst.length());
			return nyString;
		} else {
			return nyString;
		}
	}


	public static void main(String[] args) {
		NyString tekst = new NyString("denne setningen kan forkortes");
		System.out.println("Teksten: " + tekst.getTekst());
		System.out.println();
		System.out.println("forkortString(): " + tekst.forkortString());
		System.out.println("fjernTegn(): " + tekst.fjernTegn('e'));
	}
}