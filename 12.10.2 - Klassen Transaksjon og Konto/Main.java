/**
* Main.java
*
* Oppgave 12.10.2
*
* Program som vedlikeholder en konto (Hentet fra løsningsforslag).
*/

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto("1234.56.78910", "Gunnar", 10_000);
        BGS bgs = new BGS(konto);

        int valg = bgs.lesValg();
        while (valg >= 0) {
            bgs.utførValgtOppgave(valg);
            valg = bgs.lesValg();
        }
    }
}
