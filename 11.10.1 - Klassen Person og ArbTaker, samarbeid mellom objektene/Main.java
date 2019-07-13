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

		System.out.println("Han blir trekt i skatt (kroner): " + arbTaker.skattetrekkKronerMåned());
		System.out.println("Bruttolønn i året: " + arbTaker.bruttoLønnÅr());
		System.out.println("Han blir trekt i skatt (kroner) året: " + arbTaker.skattetrekkKronerÅr());
		System.out.println("Fullt navn: " + arbTaker.hentNavn());
		System.out.println("Alder: " + arbTaker.arbTakerAlder());
		System.out.println("Antall år ansatt: " + arbTaker.antallÅrAnsatt());
		System.out.println(arbTaker.equals(arbTaker));


		Object[] options = {"Avlsutt", "Månedslønn", "Skatteprosent"};
		int valg;
		int verdi;
		do {
			valg = showOptionDialog(null,
								   arbTaker.hentNavn() + " " + arbTaker.arbTakerAlder() + " år\n" +
								   arbTaker.antallÅrAnsatt() + "\n" +
								   "\n" +
								   "Månedslønn: " + arbTaker.getMånedslønn() + " kr\n" +
								   "Skatteprosent: " + arbTaker.getSkatteprosent() + " %\n" +
								   "\n" +
								   "Skattetrekk i måneden: " + arbTaker.skattetrekkKronerMåned() + " kr\n" +
								   "Skattetrekk i året: " + arbTaker.skattetrekkKronerÅr() + " kr\n" +
								   "Bruttolønn: " + arbTaker.bruttoLønnÅr() + "\n" +
								   "\n" +
	                               "Vil du endre månedslønn eller skatteprosent?",
	                               "Endre månedslønn eller skatteprosent",
	                               YES_NO_CANCEL_OPTION,
	                               INFORMATION_MESSAGE,
	                               null,
	                               options,
	                               null);

			switch (valg) {
				case 1:
					verdi = Integer.parseInt(showInputDialog("Ny månedslønn:"));
					arbTaker.setMånedslønn(verdi);
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