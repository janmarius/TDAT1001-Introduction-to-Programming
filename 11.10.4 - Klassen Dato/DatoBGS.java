/**
* DatoBGS.java
*
* Oppgave 11.10.4
*
* Klassen DatoBGS.
*/

import java.text.ParseException;

import static javax.swing.JOptionPane.*;

public class DatoBGS {
    private final String REGEX_DATOFORMAT = "(0[1-9]|[12][0-9]|3[01]).(0[1-9]|1[0-2]).[12][0-9]{3}"; // dd.MM.yyyy

    private final String[] ALTERNATIVER = {"Lag ny dato", "Sammenlign to datoer",
                                           "Finn differanse i dager", "Avslutt"};

    private final int LAG_NY_DATO = 0;
    private final int SAMMENLIGN_DATO = 1;
    private final int FINN_DIFFERANSE_DAGER = 2;
    private final int AVSLUTT = 3;

    private Dato dato;

    public DatoBGS(Dato dato) {
        this.dato = dato;
    }

    public int lesValg() {
        int valg = showOptionDialog(null, dato.toString(), "Dato", DEFAULT_OPTION,
                                    PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
        if (valg == AVSLUTT) {
            valg = -1;
        }
        return valg;
    }

    public void utforValgtOppgave(int valg) {
        switch (valg) {
            case LAG_NY_DATO:
                lagNyDato();
                break;

            case SAMMENLIGN_DATO:
                sammenlignDato();
                break;

            case FINN_DIFFERANSE_DAGER:
                finnDifferanseDager();
                break;

            default:
                break;
        }
    }

    public void lagNyDato() {
        String dagerLest = showInputDialog("Hvor mange dager frem eller tilbake vil du endre?");
        long dager = Long.parseLong(dagerLest);
        dato = dato.nyDato(dager);
    }

    public void sammenlignDato() {
        String datoSammenlignLest = showInputDialog("Skriv inn datoen du vil sammenligne (dd.MM.yyyy)");
        try {
            if (datoSammenlignLest.matches(REGEX_DATOFORMAT)) {
                Dato datoTemp = new Dato(datoSammenlignLest);
                int sammenlignResultat = dato.compareTo(datoTemp);
                if (sammenlignResultat == 0) {
                    showMessageDialog(null, "Datoene er lik.");
                } else if (sammenlignResultat == 1) {
                    showMessageDialog(null, "Datoen er etter " + datoSammenlignLest);
                } else {
                    showMessageDialog(null, "Datoen er før " + datoSammenlignLest);
                }

            } else {
                showMessageDialog(null, "Noe gikk galt, vennligst prøv igjen!");
            }

        } catch (ParseException e) {
            showMessageDialog(null, "Noe gikk galt, vennligst prøv igjen!");
        }
    }

    public void finnDifferanseDager() {
        String datoSammenlignLest = showInputDialog("Skriv inn datoen du vil sammenligne (dd.MM.yyyy)");
        try {
            if (datoSammenlignLest.matches(REGEX_DATOFORMAT)) {
                Dato datoTemp = new Dato(datoSammenlignLest);
                showMessageDialog(null, "Antall dager differanse er: " +
                                    dato.antallDagerMellomDato(datoTemp));

            } else {
                showMessageDialog(null, "Noe gikk galt, vennligst prøv igjen!");
            }

        } catch (ParseException e) {
            showMessageDialog(null, "Noe gikk galt, vennligst prøv igjen!");
        }
    }
}
