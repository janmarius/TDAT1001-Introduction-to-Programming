/**
* Main.java
*
* Oppgave 9.11.1
*
* Klasse som inneholder en tabell med priser p� varer.
*/

public class Main {
    public static void main(String[] args) {
	    Prisliste prisliste = new Prisliste();
	    VareBGS vareBGS = new VareBGS(prisliste);

	    int valg = vareBGS.lesValg();
	    while (valg >= 0) {
	        vareBGS.utf�rValgtOppgave(valg);
	        valg = vareBGS.lesValg();
        }
    }
}
