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
		String tittelLest = showInputDialog("Hva er tittelen på tegningen din: ");
		String xPosLest = showInputDialog("Oppgi x-pos innenfor 500: ");
		String yPosLest = showInputDialog("Oppgi y-pos innenfor 500: ");
		String breddeLest = showInputDialog("Oppgi rektangelets bredde: ");
		String høydeLest = showInputDialog("Oppgi rektangelets høyde: ");

		int xPos = Integer.parseInt(xPosLest);
		int yPos = Integer.parseInt(yPosLest);
		int bredde = Integer.parseInt(breddeLest);
		int høyde = Integer.parseInt(høydeLest);

		Vindu vindu = new Vindu(tittelLest, xPos, yPos, bredde, høyde);
		vindu.setVisible(true);
	}
}


