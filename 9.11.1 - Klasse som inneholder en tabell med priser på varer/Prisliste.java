/**
* Prisliste.java
*
* Oppgave 9.11.1
*
* Klassen prisliste.
*/

public class Prisliste {
    private double[] priser = new double[10];
    private final int VARENUMMER_START = 1000;
    private int antallRegistrerte = 0;

    public int registrerNyVare(double pris) {
        if (antallRegistrerte >= priser.length) {
            utvidTabell();
        }
        priser[antallRegistrerte] = pris;
        int varenummer = VARENUMMER_START + antallRegistrerte;
        antallRegistrerte++;
        return varenummer;
    }

    public boolean registrerNyPris(int varenummer, double nyPris) {
        int indeks = varenummerTilIndeks(varenummer);
        if (gyldigIndeks(indeks)) {
            priser[indeks] = nyPris;
            return true;
        }
        return false;
    }

    public double finnPris(int varenummer) {
        int indeks = varenummerTilIndeks(varenummer);
        if (gyldigIndeks(indeks)) {
            return priser[indeks];
        }
        return -1;
    }

    public double registrerNyPrisProsent(int varenummer, double prosent) {
        int indeks = varenummerTilIndeks(varenummer);
        if (gyldigIndeks(indeks)) {
            priser[indeks] *= 1 + (prosent / 100);
            return priser[indeks];
        }
        return -1;
    }

    private int varenummerTilIndeks(int varenummer) {
        return varenummer - VARENUMMER_START;
    }

    private boolean gyldigIndeks(int indeks) {
        return (indeks >= 0 && indeks < antallRegistrerte);
    }

    private void utvidTabell() {
        double[] nyTab = new double[priser.length * 2];
        for (int i = 0; i < priser.length; i++) {
            nyTab[i] = priser[i];
        }
        priser = nyTab;
    }

    @Override
    public String toString() {
        String resultat = "Antall priser registrert: " + antallRegistrerte;
        if (antallRegistrerte != 0) {
            for (int i = 0; i < antallRegistrerte; i++) {
                resultat += "\n" + (VARENUMMER_START + i) + ": " + priser[i];
            }
        }
        return resultat;
    }
}
