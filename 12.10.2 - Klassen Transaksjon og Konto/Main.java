/**
* Main.java
*
* Oppgave 12.10.2
*
* Program som vedlikeholder en konto (Hentet fra l�sningsforslag).
*/

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto("1234.56.78910", "Gunnar", 10_000);
        BGS bgs = new BGS(konto);

        int valg = bgs.lesValg();
        while (valg >= 0) {
            bgs.utf�rValgtOppgave(valg);
            valg = bgs.lesValg();
        }
    }
}
