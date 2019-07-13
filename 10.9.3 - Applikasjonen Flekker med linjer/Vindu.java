/**
* Vindu.java
*
* Oppgave 10.9.3
*
* Klassen Vindu lager et vindu man kan tegne inni.
*/

import javax.swing.JFrame;


class Vindu extends JFrame {
	public Vindu(String tittel) {
		setTitle(tittel);
		setSize(500, 400); // bredde, høyde
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning tegning = new Tegning();
		add(tegning);
	}
}
