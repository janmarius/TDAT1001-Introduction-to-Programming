/**
* Konto.java
*
* Oppgave 12.10.2
*
* Klassen Konto
*/

import java.util.Arrays;

public class Konto {
    private String kontonummer;
    private String navn;
    private double saldo;
    private Transaksjon[] transaksjoner;
    private int antallTransaksjoner = 0;

    public Konto(String kontonummer, String navn, double saldo) {
        this.kontonummer = kontonummer;
        this.navn = navn;
        this.saldo = saldo;
        transaksjoner = new Transaksjon[10];
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public String getNavn() {
        return navn;
    }

    public double getSaldo() {
        return saldo;
    }

    // Legger inn ny transaksjon.
    public boolean nyTransaksjon(int dato, double beløp) {
        if (beløp > saldo) return false;

        if (antallTransaksjoner >= transaksjoner.length) utvidTabell();

        transaksjoner[antallTransaksjoner] = new Transaksjon(dato, beløp);
        antallTransaksjoner++;
        saldo -= beløp;
        return true;
    }

    // Henter ut alle transaksjoner innen en gitt tidsperiode.
    public Transaksjon[] hentAlleTransaksjonerFraTil(int datoFra, int datoTil) {
        int teller = 0;
        for (int i = 0; i < antallTransaksjoner; i++) {
            if(transaksjoner[i].getDato() >= datoFra && transaksjoner[i].getDato() <= datoTil) {
                teller++;
            }
        }

        Transaksjon[] resultat = new Transaksjon[teller];
        for (int i = 0; i < teller; i++) {
            if(transaksjoner[i].getDato() >= datoFra && transaksjoner[i].getDato() <= datoTil) {
                resultat[i] = transaksjoner[i];
            }
        }

        Arrays.sort(resultat);
        return resultat;
    }


    private void utvidTabell() {
        Transaksjon[] nyTab = new Transaksjon[transaksjoner.length * 2];
        for (int i = 0; i < transaksjoner.length; i++) {
            nyTab[i] = transaksjoner[i];
        }
        transaksjoner = nyTab;
    }

    @Override
    public String toString(){
        String resultat = "Kontonummer: " + kontonummer + "\n" +
                          "Navn: " + navn + "\n" +
                          "Saldo: " + saldo;
        for (int i = 0; i < antallTransaksjoner; i++) {
            resultat += "\n" + transaksjoner[i];
        }
        return resultat;
    }
}
