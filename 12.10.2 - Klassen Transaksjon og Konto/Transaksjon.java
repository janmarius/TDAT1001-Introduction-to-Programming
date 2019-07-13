/**
* Transaksjon.java
*
* Oppgave 12.10.2
*
* Klassen Transaksjon
*/

import java.util.Arrays;

public class Transaksjon implements Comparable<Transaksjon> {
    private int dato; // Datoformat: yyyyMMdd
    private double beløp;

    public Transaksjon(int dato, double beløp) {
        this.dato = dato;
        this.beløp = beløp;
    }

    public int getDato() {
        return dato;
    }

    public double getBeløp() {
        return beløp;
    }

    // Sorterer transaksjonsobjektene etter nyeste først.
    @Override
    public int compareTo(Transaksjon objekt) {
        if (dato < objekt.dato) return 1;
        if (dato > objekt.dato) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return dato + ": " + beløp;
    }

    public static void main(String[] args) {
        Transaksjon[] transaksjoner = new Transaksjon[3];
        transaksjoner[0] = new Transaksjon(20001010, 50.50);
        transaksjoner[1] = new Transaksjon(20001011, 45.40);
        transaksjoner[2] = new Transaksjon(19990202, 100.23);

        for (int i = 0; i < transaksjoner.length; i++) {
            System.out.println(transaksjoner[i]);
        }

        System.out.println();
        Arrays.sort(transaksjoner);

        for (int i = 0; i < transaksjoner.length; i++) {
            System.out.println(transaksjoner[i]);
        }
    }
}