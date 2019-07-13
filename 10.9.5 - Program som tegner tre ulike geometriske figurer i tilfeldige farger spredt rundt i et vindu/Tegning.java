/**
* Tegning.java
*
* Oppgave 10.9.5
*
* Klassen Tegning tegner tre ulike geometriske figurer i tilfeldige farger spredt rundt i et vindu
*/


import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.util.Random;


class Tegning extends JPanel {
	public final int ANTALL_FIGURER = 150;


	public void paintComponent(Graphics tegneflate) {
		super.paintComponent(tegneflate);
		Random random = new Random();

		Color[] farger = {Color.GRAY, Color.ORANGE, Color.YELLOW,
		                  Color.BLUE, Color.GREEN, Color.PINK, Color.CYAN, Color.LIGHT_GRAY,
                          Color.RED, Color.DARK_GRAY, Color.MAGENTA, Color.WHITE}; // Tar bort sort, fordi bakgrunnen er sort

		// Setter bakgrunnen til sort
		setBackground(Color.BLACK);


		for (int i = 0; i < ANTALL_FIGURER; i++) {
			int valg = random.nextInt(3);
			int xPos = random.nextInt(1000);
			int yPos = random.nextInt(1000);
			int randomFarge = random.nextInt(farger.length);
		    tegneflate.setColor(farger[randomFarge]);

			switch(valg) {
				case 0:
					tegneflate.drawOval(xPos, yPos, 75, 75);
					break;

				case 1:
					tegneflate.drawRect(xPos, yPos, 100, 100);
					break;

				case 2:
					tegneflate.drawRect(xPos, yPos, 150, 50);
					break;
				default:
					System.out.println("Noe gikk galt, start program på nytt!");
					break;
			}
		}
	}
}