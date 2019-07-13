/**
* VareBGS.java
*
* Oppgave 9.11.1
*
* Klassen VareBGS lager et menystyrt klientprogram der brukeren kan velge mellom de fire operasjonene.
*/

import static javax.swing.JOptionPane.*;

public class VareBGS {
    private final String[] ALTERNATIVER = {"Registrer ny vare", "Registrer ny pris",
                                           "Finn pris", "Registrer ny pris (prosent)", "Avslutt"};

    private final int REG_NY_VARE = 0;
    private final int REG_NY_PRIS = 1;
    private final int FINN_PRIS = 2;
    private final int REG_NY_PRIS_PROSENT = 3;
    private final int AVSLUTT = 4;

    private Prisliste prisliste;

    public VareBGS(Prisliste prisliste) {
        this.prisliste = prisliste;
    }

    public int lesValg() {
        int valg = showOptionDialog(null, prisliste.toString(), "Prisliste", DEFAULT_OPTION,
                                    PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
        if (valg == AVSLUTT) {
            valg = -1;
        }
        return valg;
    }

    public void utførValgtOppgave(int valg) {
        switch (valg) {
            case REG_NY_VARE:
                regNyVare();
                break;

            case REG_NY_PRIS:
                regNyPris();
                break;

            case FINN_PRIS:
                finnPris();
                break;

            case REG_NY_PRIS_PROSENT:
                regNyPrisProsent();
                break;

            default:
                break;
        }
    }

    public void regNyVare() {
        String prisLest = showInputDialog("Hvilken pris på varen vil du registrere?");
        double pris = Double.parseDouble(prisLest);
        prisliste.registrerNyVare(pris);
    }

    public void regNyPris() {
        String varenummerLest = showInputDialog("Varenummer du vil endre pris på: ");
        String prisLest = showInputDialog("Ny pris på varen: ");
        int varenummer = Integer.parseInt(varenummerLest);
        double pris = Double.parseDouble(prisLest);
        if (prisliste.registrerNyPris(varenummer, pris)) {
            showMessageDialog(null, "Varenummer " + varenummer + " har nå prisen " + pris + ".");
        } else {
            showMessageDialog(null, "Noe gikk galt, vennligs prøv igjen!");
        }
    }

    public void finnPris() {
        String varenummerLest = showInputDialog("Hvilket varenummer vil du finne prisen på?");
        int varenummer = Integer.parseInt(varenummerLest);
        double pris = prisliste.finnPris(varenummer);
        if (pris != -1) {
            showMessageDialog(null, "Varenummer " + varenummer + " har prisen " + pris + ".");
        } else {
            showMessageDialog(null, "Noe gikk galt, vennligs prøv igjen!");
        }
    }

    public void regNyPrisProsent() {
        String varenummerLest = showInputDialog("Varenummer du vil endre pris på: ");
        String prosentLest = showInputDialog("Prosent endring på varen: ");
        int varenummer = Integer.parseInt(varenummerLest);
        double prosent = Double.parseDouble(prosentLest);
        double pris = prisliste.registrerNyPrisProsent(varenummer, prosent);
        if (pris != -1) {
            showMessageDialog(null, "Varenummer " + varenummer + " har når prisen " + pris + ".");
        } else {
            showMessageDialog(null, "Noe gikk galt, vennligs prøv igjen!");
        }
    }
}
