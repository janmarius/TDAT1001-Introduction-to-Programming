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
    private final String[] ALTERNATIVER = {"Registrer ny transaksjon", "Utfør betaling", "Avslutt"};

    private final int REG_NY_TRANSAKSJON = 0;
    private final int UTFØR_BETALING = 1;
    private final int AVSLUTT = 2;

    private FilHåndterer filHåndterer = new FilHåndterer();
    private Konto konto;

    public KontoBGS(Konto konto) {
        this.konto = konto;
    }

    public int lesValg() throws IOException {
        int valg = showOptionDialog(null, konto + "\n\nTransaksjoner:\n" +
                                    filHåndterer.lesTransaksjonerFraFil(), "Konto", DEFAULT_OPTION,
                                    PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
        if (valg == AVSLUTT) {
            valg = -1;
        }
        return valg;
    }

    public void utførValgtOppgave(int valg) throws IOException {
        switch (valg) {
            case REG_NY_TRANSAKSJON:
                regNyTransaksjon();
                break;

            case UTFØR_BETALING:
                utførBetaling();
                break;

            default:
                break;
        }
    }

    private void regNyTransaksjon() throws IOException {
        String beløpLest = showInputDialog("Skriv inn beløpet til transaksjonen du vil registrere:");
        double beløp = Double.parseDouble(beløpLest);
        filHåndterer.skrivTransaksjonTilFil(beløp);
    }

    private void utførBetaling() throws IOException{
        double beløp = filHåndterer.lesSumTransaksjonerFraFil();
        if (beløp != Double.MAX_VALUE) {
            if (konto.endreSaldo(beløp)) {
                filHåndterer.skrivSaldoTilFil(konto.getSaldo());
                filHåndterer.tømTransaksjoner();
                showMessageDialog(null, "Betaling utført!");
            } else {
                filHåndterer.tømTransaksjoner();
                showMessageDialog(null, "Noe gikk galt, vennligst prøv igjen!");
            }

        } else {
            showMessageDialog(null, "Ingen transaksjoner registrer!");
        }
    }
}