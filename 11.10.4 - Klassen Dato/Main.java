/**
* Main.java
*
* Oppgave 11.10.4
*
* Program som lar brukeren skrive inn datoer og f� utf�rt ulike oppgaver ved hjelp av klassen Dato.
*/

public class Main {
    public static void main(String[] args) {
        Dato dato = new Dato();
        DatoBGS datoBGS = new DatoBGS(dato);

        int valg = datoBGS.lesValg();
        while (valg >= 0) {
            datoBGS.utforValgtOppgave(valg);
            valg = datoBGS.lesValg();
        }
    }
}
