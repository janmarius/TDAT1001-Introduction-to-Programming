/**
* Main.java
*
* Oppgave 9.11.3
*
* Program som adderer, multipliserer og transponerer matriser.
*/



class Main {
	public static void main(String[] args) {
		Matrise matrise1 = new Matrise(2, 3);
		Matrise matrise2 = new Matrise(2, 3);

		matrise1.settInnVerdi(0, 0, 1);
		matrise1.settInnVerdi(0, 1, -7);
		matrise1.settInnVerdi(0, 2, 5);
		matrise1.settInnVerdi(1, 0, 0);
		matrise1.settInnVerdi(1, 1, 3);
		matrise1.settInnVerdi(1, 2, -10);
		System.out.println("Matrise 1 (" + matrise1.antallRader() + " X " + matrise1.antallKolonner() + "):");
		System.out.println(matrise1.toString());

		matrise2.settInnVerdi(0, 0, 5);
		matrise2.settInnVerdi(0, 1, 0);
		matrise2.settInnVerdi(0, 2, 3);
		matrise2.settInnVerdi(1, 0, 11);
		matrise2.settInnVerdi(1, 1, -1);
		matrise2.settInnVerdi(1, 2, 7);
		System.out.println("Matrise 2 (" + matrise2.antallRader() + " X " + matrise2.antallKolonner() + "):");
		System.out.println(matrise2.toString());


		System.out.println("Adderer Matrise 1 med Matrise 2, og får:");
		Matrise addert = matrise1.adderMatrise(matrise2);
		System.out.println(addert.toString());

		System.out.println();
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println();

		Matrise matrise3 = new Matrise(3, 2);
		Matrise matrise4 = new Matrise(2, 2);

		matrise3.settInnVerdi(0, 0, 4);
		matrise3.settInnVerdi(0, 1, 3);
		matrise3.settInnVerdi(1, 0, 7);
		matrise3.settInnVerdi(1, 1, 2);
		matrise3.settInnVerdi(2, 0, 9);
		matrise3.settInnVerdi(2, 1, 0);

		System.out.println("Matrise 3 (" + matrise3.antallRader() + " X " + matrise3.antallKolonner() + "):");
		System.out.println(matrise3.toString());


		matrise4.settInnVerdi(0, 0, 2);
		matrise4.settInnVerdi(0, 1, 5);
		matrise4.settInnVerdi(1, 0, 1);
		matrise4.settInnVerdi(1, 1, 6);

		System.out.println("Matrise 4 (" + matrise4.antallRader() + " X " + matrise4.antallKolonner() + "):");
		System.out.println(matrise4.toString());

		System.out.println("Multipliserer Matrise 3 med Matrise 4, og får:");
		Matrise multiplisert = matrise3.multipliserMatrise(matrise4);
		System.out.println(multiplisert.toString());

		System.out.println();
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println();

		System.out.println("Transponerer Matrise 3:");
		Matrise transponert = matrise4.transponerMatrise(matrise3);
		System.out.println(transponert.toString());
	}
}