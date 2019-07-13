/**
* Main.java
*
* Oppgave 12.10.1
*
* Program som holder orden på hvor mange oppgaver hver enkelt student har fått godkjent.
*/


public class Main {
    public static void main(String[] args) {
        Oppgaveoversikt oppgaveoversikt = new Oppgaveoversikt(10);
        OppgaveoversiktBGS oppgaveoversiktBGS = new OppgaveoversiktBGS(oppgaveoversikt);

        int valg = oppgaveoversiktBGS.lesValg();
        while (valg >= 0) {
            oppgaveoversiktBGS.utforValgtOppgave(valg);
            valg = oppgaveoversiktBGS.lesValg();
        }
    }
}