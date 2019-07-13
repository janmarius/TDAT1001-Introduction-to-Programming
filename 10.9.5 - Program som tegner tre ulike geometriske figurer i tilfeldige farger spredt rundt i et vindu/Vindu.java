/**
* Vindu.java
*
* Oppgave 10.9.5
*
* Klassen Vindu lager et vindu man kan tegne inni.
*/

import javax.swing.JFrame;


class Vindu extends JFrame {
	public Vindu(String tittel) {
		setTitle(tittel);
		setSize(1000, 1000); // bredde, høyde
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning tegning = new Tegning();
		add(tegning);
	}
}
