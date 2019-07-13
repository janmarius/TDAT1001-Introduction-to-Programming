/**
* Konto.java
*
* Oppgave 16.13.3
*
* Klassen Konto
*/

public class Konto {
    private String kontonummer;
    private String navn;
    private double saldo;

    public Konto(String kontonummer, String navn, double saldo) {
        this.kontonummer = kontonummer;
        this.navn = navn;
        this.saldo = saldo;
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

    public boolean endreSaldo(double beløp) {
        if (beløp + saldo <= 0) return false;
        saldo += beløp;
        return true;
    }

    @Override
    public String toString() {
        return "Kontonummer: " + kontonummer + "\nNavn: " + navn + "\nSaldo: " + saldo;
    }
}