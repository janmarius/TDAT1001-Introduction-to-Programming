/**
* Tegning.java
*
* Oppgave 10.9.1
*
* Klassen Tegning lager en tegning av en Smiley.
*/


import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;


class Tegning extends JPanel {
	public void paintComponent(Graphics tegneflate) {
		super.paintComponent(tegneflate);

		// Setter bakgrunnen til rosa
		setBackground(Color.PINK);

		// Tegner gult ansikt
		tegneflate.setColor(Color.YELLOW);
		tegneflate.fillOval(40, 30, 400, 400);

		// Lager et svart omrisse rundt ansiktet
		tegneflate.setColor(Color.BLACK);
		tegneflate.drawOval(40, 30, 400, 400);

		// Tegner øyner
		tegneflate.fillOval(160, 100, 40, 130);
		tegneflate.fillOval(280, 100, 40, 130);

		// Tegner munn
		tegneflate.fillArc(120, 220, 250, 130, 180, 180);

		tegneflate.setColor(Color.MAGENTA);
		Font tekst = new Font("SansSerif", Font.BOLD, 32);
		tegneflate.setFont(tekst);
		tegneflate.drawString("Dette er Kåre!", 140, 455);
	}
}
