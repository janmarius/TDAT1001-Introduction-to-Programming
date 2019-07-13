/**
* KontoBGS.java
*
* Oppgave 16.13.3
*
* Klassen KontoBGS.java
*/

import java.io.IOException;

import static javax.swing.JOptionPane.*;

public class KontoBGS {
    private final String[] ALTERNATIVER = {"Registrer ny transaksjon", "Utf�r betaling", "Avslutt"};

    private final int REG_NY_TRANSAKSJON = 0;
    private final int UTF�R_BETALING = 1;
    private final int AVSLUTT = 2;

    private FilH�ndterer filH�ndterer = new FilH�ndterer();
    private Konto konto;

    public KontoBGS(Konto konto) {
        this.konto = konto;
    }

    public int lesValg() throws IOException {
        int valg = showOptionDialog(null, konto + "\n\nTransaksjoner:\n" +
                                    filH�ndterer.lesTransaksjonerFraFil(), "Konto", DEFAULT_OPTION,
                                    PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
        if (valg == AVSLUTT) {
            valg = -1;
        }
        return valg;
    }

    public void utf�rValgtOppgave(int valg) throws IOException {
        switch (valg) {
            case REG_NY_TRANSAKSJON:
                regNyTransaksjon();
                break;

            case UTF�R_BETALING:
                utf�rBetaling();
                break;

            default:
                break;
        }
    }

    private void regNyTransaksjon() throws IOException {
        String bel�pLest = showInputDialog("Skriv inn bel�pet til transaksjonen du vil registrere:");
        double bel�p = Double.parseDouble(bel�pLest);
        filH�ndterer.skrivTransaksjonTilFil(bel�p);
    }

    private void utf�rBetaling() throws IOException{
        double bel�p = filH�ndterer.lesSumTransaksjonerFraFil();
        if (bel�p != Double.MAX_VALUE) {
            if (konto.endreSaldo(bel�p)) {
                filH�ndterer.skrivSaldoTilFil(konto.getSaldo());
                filH�ndterer.t�mTransaksjoner();
                showMessageDialog(null, "Betaling utf�rt!");
            } else {
                filH�ndterer.t�mTransaksjoner();
                showMessageDialog(null, "Noe gikk galt, vennligst pr�v igjen!");
            }

        } else {
            showMessageDialog(null, "Ingen transaksjoner registrer!");
        }
    }
}