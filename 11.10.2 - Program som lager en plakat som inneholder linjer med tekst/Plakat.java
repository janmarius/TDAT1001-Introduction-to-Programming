/**
* Plakat.java
*
* Oppgave 11.10.2
*
* Klassen Plakat
*/

import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.util.Random;


public class Plakat extends JPanel {
	private int antallLinjer;
	private String[] linjeTekst;


	public Plakat(int antallLinjer, String[] linjeTekst) {
		this.antallLinjer = antallLinjer;
		this.linjeTekst = new String[linjeTekst.length];
		for (int i = 0; i < linjeTekst.length; i++) {
			this.linjeTekst[i] = linjeTekst[i];
		}
	}


	public void paintComponent(Graphics tegneflate) {
		super.paintComponent(tegneflate);



		Random random = new Random();


		String[] skriftType = {"SansSerif", "Serif", "Monospaced", "Dialog", "DialogInput"};

		Color[] farger = {Color.GRAY, Color.ORANGE, Color.YELLOW,
		                  Color.BLUE, Color.GREEN, Color.PINK, Color.CYAN, Color.LIGHT_GRAY,
                          Color.RED, Color.DARK_GRAY, Color.MAGENTA, Color.WHITE}; // Tar bort sort, da bakgrunnen er satt til sort
		int[] skriftStil = {Font.BOLD, Font.ITALIC, Font.PLAIN};



		setBackground(Color.BLACK);


		int plasseringY = 50;
		for (int i = 0; i < antallLinjer; i++) {

			int randomFarge = random.nextInt(farger.length);
			int randomSkriftType = random.nextInt(skriftType.length);
			int randomSkriftstørrelse = random.nextInt(40);
			randomSkriftstørrelse += 8;


			tegneflate.setColor(farger[randomFarge]);
			Font tekst = new Font(skriftType[randomSkriftType], Font.BOLD, randomSkriftstørrelse);
			tegneflate.setFont(tekst);
			tegneflate.drawString(linjeTekst[i], 10, plasseringY);
			plasseringY += 50;
		}
	}
}