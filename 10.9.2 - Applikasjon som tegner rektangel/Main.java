/**
* Main.java
*
* Oppgave 10.9.2
*
* Applikasjon som tegner rektangel.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		String tittelLest = showInputDialog("Hva er tittelen p� tegningen din: ");
		String xPosLest = showInputDialog("Oppgi x-pos innenfor 500: ");
		String yPosLest = showInputDialog("Oppgi y-pos innenfor 500: ");
		String breddeLest = showInputDialog("Oppgi rektangelets bredde: ");
		String h�ydeLest = showInputDialog("Oppgi rektangelets h�yde: ");

		int xPos = Integer.parseInt(xPosLest);
		int yPos = Integer.parseInt(yPosLest);
		int bredde = Integer.parseInt(breddeLest);
		int h�yde = Integer.parseInt(h�ydeLest);

		Vindu vindu = new Vindu(tittelLest, xPos, yPos, bredde, h�yde);
		vindu.setVisible(true);
	}
}


