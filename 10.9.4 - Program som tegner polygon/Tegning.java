/**
* Tegning.java
*
* Oppgave 10.9.4
*
* Klassen Tegning lager et polygon
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

		tegneflate.setColor(Color.BLACK);
		int nPoints = random.nextInt(12);
		int[] xPoints = new int[nPoints];
		int[] yPoints = new int[nPoints];

		for (int i = 0; i < nPoints; i++) {
			xPoints[i] = random.nextInt(450);
			yPoints[i] = random.nextInt(450);
		}




		tegneflate.drawPolygon(xPoints, yPoints, nPoints);


	}
}