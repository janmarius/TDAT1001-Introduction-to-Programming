/**
* Vindu.java
*
* Oppgave 10.9.2
*
* Klassen Vindu lager et vindu man kan tegne inni.
*/

import javax.swing.JFrame;


class Vindu extends JFrame {
	public Vindu(String tittel, int xPos, int yPos, int bredde, int høyde) {
		setTitle(tittel);
		setSize(500, 500); // bredde, høyde
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning tegning = new Tegning(xPos, yPos, bredde, høyde);
		add(tegning);
	}
}
