/**
* Main.java
*
* Oppgave 16.13.3
*
* Program som vedlikeholder en konto ved hjelp av skriving og lesing til filer
*/

public class Main {
    public static void main(String[] args) {
        FilHåndterer filHåndterer = new FilHåndterer();
        try {
            Konto konto = new Konto("1234.56.78910", "Truls Oppoverbakke", filHåndterer.lesSaldoFraFil());
            KontoBGS kontoBGS = new KontoBGS(konto);

            int valg = kontoBGS.lesValg();
            while (valg >= 0) {
                kontoBGS.utførValgtOppgave(valg);
                valg = kontoBGS.lesValg();
            }
        } catch (Exception e) {
            System.out.println("Noe gikk galt!");
        }
    }
}