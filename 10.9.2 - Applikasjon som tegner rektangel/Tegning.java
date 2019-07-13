/**
* Tegning.java
*
* Oppgave 10.9.2
*
* Klassen Tegning lager et rektangel og skriver ut areal og omkrets
*/


import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;


class Tegning extends JPanel {
	private int xPos;
	private int yPos;
	private int bredde;
	private int h�yde;
	private int areal;
	private int omkrets;

	public Tegning(int xPos, int yPos, int bredde, int h�yde) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.bredde = bredde;
		this.h�yde = h�yde;
		areal = h�yde * bredde;
		omkrets = (h�yde * 2) + (bredde * 2);
	}


	public void paintComponent(Graphics tegneflate) {
		super.paintComponent(tegneflate);

		// Setter bakgrunnen til hvit
		setBackground(Color.WHITE);

		// Tegner rektangel
		tegneflate.drawRect(xPos, yPos, bredde, h�yde);

		// Skriver ut areal og omkrets
		tegneflate.setColor(Color.BLACK);
		Font tekst = new Font("SansSerif", Font.BOLD, 18);
		tegneflate.setFont(tekst);
		tegneflate.drawString("Arealet er: " + bredde + " x " + h�yde + " = " + areal, 20, 435);
		tegneflate.drawString("Omkretsen er: " + omkrets , 20, 455);
	}
}