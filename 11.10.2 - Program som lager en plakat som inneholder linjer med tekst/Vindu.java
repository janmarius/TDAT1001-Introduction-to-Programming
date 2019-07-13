/**
* Vindu.java
*
* Oppgave 11.10.2
*
* Klassen Vindu lager et vindu man kan tegne inni.
*/

import javax.swing.JFrame;


public class Vindu extends JFrame {
	public Vindu(String tittel, int antallLinjer, String[] linjeTekst) {
		setTitle(tittel);
		setSize(500, 500); // bredde, høyde
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Plakat plakat = new Plakat(antallLinjer, linjeTekst);
		add(plakat);
	}
}