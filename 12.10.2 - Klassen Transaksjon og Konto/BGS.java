/**
* BGS.java
*
* Oppgave 12.10.2
*
* Klassen BGS
*/

import static javax.swing.JOptionPane.*;

public class BGS {
    private final String[] ALTERNATIVER = {"Legg inn ny transaksjon", "Hent ut alle transaksjoner i tidsperiode",
                                           "Avslutt"};

    private final int LEGG_INN_NY_TRANSAKSJON = 0;
    private final int HENT_ALLE_TRANSAKSJONER = 1;
    private final int AVSLUTT = 2;

    private Konto konto;

    public BGS(Konto konto) {
        this.konto = konto;
    }

    public int lesValg() {
        int valg = showOptionDialog(null, konto, "Konto", DEFAULT_OPTION,
                                    PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
        if (valg == AVSLUTT) {
            valg = -1;
        }
        return valg;
    }

    public void utf�rValgtOppgave(int valg) {
        switch (valg) {
            case LEGG_INN_NY_TRANSAKSJON:
                leggInnNyTransaksjon();
                break;

            case HENT_ALLE_TRANSAKSJONER:
                hentAlleTransaksjoner();
                break;

            default:
                break;
        }
    }

    private void leggInnNyTransaksjon() {
        String datoLest = showInputDialog("Hvilken dato er transaksjonen du vil legge til? (yyyyMMdd)");
        int dato = Integer.parseInt(datoLest);
        String bel�pLest = showInputDialog("Hvor stort er bel�pet p� transaksjonen?");
        double bel�p = Double.parseDouble(bel�pLest);
        boolean transaksjonRegistrert = konto.nyTransaksjon(dato, bel�p);
        if (transaksjonRegistrert) {
            showMessageDialog(null, "Transaksjon registrert, saldo er: " + konto.getSaldo() + ".");
        } else {
            showMessageDialog(null, "Noe gikk galt, vennligst pr�v igjen!");
        }
    }

    private void hentAlleTransaksjoner() {
        String fraDatoLest = showInputDialog("Dato fra (yyyyMMdd):");
        int fraDato = Integer.parseInt(fraDatoLest);
        String tilDatoLest = showInputDialog("Dato til (yyyyMMdd):");
        int tilDato = Integer.parseInt(tilDatoLest);
        Transaksjon[] transaksjoner = konto.hentAlleTransaksjonerFraTil(fraDato, tilDato);
        String resultat = "Transaksjoner fra " + fraDato + " til " + tilDato + ":";
        for (int i = 0; i < transaksjoner.length; i++) {
            resultat += "\n" + transaksjoner[i];
        }
        showMessageDialog(null, resultat);
    }
}