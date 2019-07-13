/**
* Main.java
*
* Oppgave 4.14.6
*
* Program som omformer mellom 10-tallsystemet og et hvilket som helst
* annet tallsystem med grunntall 2-9.
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		String tallsystemLest = showInputDialog("Program som omformer et tall fra 10-tallsystemet til et\nhvilket som helst annet tallsystem med grunntall i intervallet [2-9].\n\nAngi grunntallet til det nye tallsystemet du vil omforme til:");

		while (tallsystemLest != null) {
			int tallsystem = Integer.parseInt(tallsystemLest);
			if (tallsystem >= 2 && tallsystem <= 9) {
				String tallLest = showInputDialog("Angi tallet du vil omforme fra 10-tallsystemet, til " + tallsystem + "-tallsystemet: ");
				int tall = Integer.parseInt(tallLest);
				String tallOmformet = "";
				while (tall > 0) {
					tallOmformet = tall % tallsystem + tallOmformet;
					tall /= tallsystem;
				}
				showMessageDialog(null, "Tallet " + tallLest + " omformet fra 10-tallsystem til " + tallsystemLest + "-tallsystemet blir: " + tallOmformet);
				tallsystemLest = showInputDialog("Program som omformer et tall fra 10-tallsystemet til et\nhvilket som helst annet tallsystem med grunntall i intervallet [2-9].\n\nAngi grunntallet til det nye tallsystemet du vil omforme til:");
			} else {
				showMessageDialog(null, "Du skrev inn et grunntall utenfor intervallet [2-9], prøv igjen!");
				tallsystemLest = showInputDialog("Program som omformer et tall fra 10-tallsystemet til et\nhvilket som helst annet tallsystem med grunntall i intervallet [2-9].\n\nAngi grunntallet til det nye tallsystemet du vil omforme til:");
			}
		}
	}
}