/**
* Tegning.java
*
* Oppgave 10.9.3
*
* Klassen Tegning lager flekker med linjer
*/


import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.util.Random;

class Tegning extends JPanel {
	public void paintComponent(Graphics tegneflate) {
		super.paintComponent(tegneflate);
		Random random = new Random();

		// Setter bakgrunnen til hvit
		setBackground(Color.WHITE);


		// Tegner fylt sirkel 1 (Start = RØD)
		tegneflate.setColor(Color.RED);
		int xPos = random.nextInt(400);
		int yPos = random.nextInt(300);
		tegneflate.fillOval(xPos, yPos, 20, 20);

		// Lagrer startposisjon for sirkel 1
		int xPosStart = xPos;
		int yPosStart = yPos;


		for (int i = 0; i < 4; i++) {

			// Tegner neste åpen sirkel
			tegneflate.setColor(Color.BLACK);
			int xPos2 = random.nextInt(400);
			int yPos2 = random.nextInt(300);
			tegneflate.drawOval(xPos2, yPos2, 20, 20);

			// Tegner strek mellom sirklene
			tegneflate.drawLine((xPos + 10), (yPos + 10), (xPos2 + 10), (yPos2 + 10));


			// Tegner neste fylte sirkel
			int xPos3 = random.nextInt(400);
			int yPos3 = random.nextInt(300);
			tegneflate.fillOval(xPos3, yPos3, 20, 20);

			// Tegner strek mellom sirklene
			tegneflate.drawLine((xPos2 + 10), (yPos2 + 10), (xPos3 + 10), (yPos3 + 10));


			// Lagrer posisjon til siste tegnet sirkel
			xPos = xPos3;
			yPos = yPos3;


		}

		// Tegner siste åpen sirkel
		int xPos2 = random.nextInt(400);
		int yPos2 = random.nextInt(300);
		tegneflate.drawOval(xPos2, yPos2, 20, 20);

		tegneflate.drawLine((xPos + 10), (yPos + 10), (xPos2 + 10), (yPos2 + 10));





		// Tegner siste sirkel (fylt) i fargen grønn
		tegneflate.setColor(Color.GREEN);
		int xPos3 = random.nextInt(400);
		int yPos3 = random.nextInt(300);
		tegneflate.fillOval(xPos3, yPos3, 20, 20);



		// Tegner strek mellom sirkel 1 og sirkel 2
		tegneflate.setColor(Color.BLACK);
		tegneflate.drawLine((xPos2 + 10), (yPos2 + 10), (xPos3 + 10), (yPos3 + 10));
		tegneflate.drawLine((xPos3 + 10), (yPos3 + 10), (xPosStart + 10), (yPosStart + 10));








	}
}