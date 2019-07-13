/**
* Main.java
*
* Oppgave 5.9.3
*
* Terningspillet 100 med to spillere
*/

import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		String spillerALest = showInputDialog("Spiller A:");
		String spillerBLest = showInputDialog("Spiller B:");
		Spiller spillerA = new Spiller(spillerALest);
		Spiller spillerB = new Spiller(spillerBLest);

		int antallVinnSpillerA = 0;
		int antallVinnSpillerB = 0;

		boolean spill = true;
		while (spill) {
			int teller = 0;
			while (spillerA.getSumPoeng() <= 100 && spillerB.getSumPoeng() <= 100) {
				System.out.println(spillerA.getNavn() + " kastet: " + spillerA.kastTerning() + " Total sum er nå: " + spillerA.getSumPoeng() + "\t\t\t" + spillerB.getNavn() + " kastet: " + spillerB.kastTerning() + " Total sum er nå: " + spillerB.getSumPoeng());
				teller++;
			}

			if (spillerA.getSumPoeng() > spillerB.getSumPoeng() && spillerB.getSumPoeng() <= 100) {
				antallVinnSpillerA++;
				System.out.println("\n" + spillerA.getNavn() + " vant!\nAntall kast: " + teller + "\nStillingen er når " + antallVinnSpillerA + " - " + antallVinnSpillerB);
			} else if (spillerB.getSumPoeng() > spillerA.getSumPoeng() && spillerA.getSumPoeng() <= 100) {
				antallVinnSpillerB++;
				System.out.println("\n" + spillerB.getNavn() + " vant!\nAntall kast: " + teller + "\nStillingen er når " + antallVinnSpillerA + " - " + antallVinnSpillerB);
			} else {
				System.out.println("Det ble brukt like mange kast på komme seg forbi 100, det ble uavgjort mellom " + spillerA.getNavn() + " og " + spillerB.getNavn() + "\nAntall kast:");
			}

			int spillVidere = showConfirmDialog(null, "Vil du spille igjen?", "Terningspillet 100", YES_NO_OPTION);
			spill = (spillVidere == YES_OPTION);
			spillerA.setSumPoeng(0);
			spillerB.setSumPoeng(0);

		}
	}
}