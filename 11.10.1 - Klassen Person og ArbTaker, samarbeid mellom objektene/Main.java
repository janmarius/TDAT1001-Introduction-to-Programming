/**
* Main.java
*
* Oppgave 11.10.1
*
* Klassen Person og ArbTaker, samarbeid mellom objektene
*/

import static javax.swing.JOptionPane.*;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("Ole", "Dal", 1959);
		ArbTaker arbTaker = new ArbTaker(person, 2233, 1999, 10_000.0, 25);

		System.out.println("Han blir trekt i skatt (kroner): " + arbTaker.skattetrekkKronerM�ned());
		System.out.println("Bruttol�nn i �ret: " + arbTaker.bruttoL�nn�r());
		System.out.println("Han blir trekt i skatt (kroner) �ret: " + arbTaker.skattetrekkKroner�r());
		System.out.println("Fullt navn: " + arbTaker.hentNavn());
		System.out.println("Alder: " + arbTaker.arbTakerAlder());
		System.out.println("Antall �r ansatt: " + arbTaker.antall�rAnsatt());
		System.out.println(arbTaker.equals(arbTaker));


		Object[] options = {"Avlsutt", "M�nedsl�nn", "Skatteprosent"};
		int valg;
		int verdi;
		do {
			valg = showOptionDialog(null,
								   arbTaker.hentNavn() + " " + arbTaker.arbTakerAlder() + " �r\n" +
								   arbTaker.antall�rAnsatt() + "\n" +
								   "\n" +
								   "M�nedsl�nn: " + arbTaker.getM�nedsl�nn() + " kr\n" +
								   "Skatteprosent: " + arbTaker.getSkatteprosent() + " %\n" +
								   "\n" +
								   "Skattetrekk i m�neden: " + arbTaker.skattetrekkKronerM�ned() + " kr\n" +
								   "Skattetrekk i �ret: " + arbTaker.skattetrekkKroner�r() + " kr\n" +
								   "Bruttol�nn: " + arbTaker.bruttoL�nn�r() + "\n" +
								   "\n" +
	                               "Vil du endre m�nedsl�nn eller skatteprosent?",
	                               "Endre m�nedsl�nn eller skatteprosent",
	                               YES_NO_CANCEL_OPTION,
	                               INFORMATION_MESSAGE,
	                               null,
	                               options,
	                               null);

			switch (valg) {
				case 1:
					verdi = Integer.parseInt(showInputDialog("Ny m�nedsl�nn:"));
					arbTaker.setM�nedsl�nn(verdi);
					break;
				case 2:
					verdi = Integer.parseInt(showInputDialog("Ny skatteprosent:"));
					arbTaker.setSkatteprosent(verdi);
					break;
				default:
					System.out.println("Program avsluttet");
			}
		} while (valg > 0);
	}
}