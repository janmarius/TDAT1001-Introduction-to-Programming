/**
* Vindu.java
*
* Oppgave 10.9.2
*
* Klassen Vindu lager et vindu man kan tegne inni.
*/

import javax.swing.JFrame;


class Vindu extends JFrame {
	public Vindu(String tittel, int xPos, int yPos, int bredde, int h�yde) {
		setTitle(tittel);
		setSize(500, 500); // bredde, h�yde
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning tegning = new Tegning(xPos, yPos, bredde, h�yde);
		add(tegning);
	}
}
