/**
* OppgaveoversiktBGS.java
*
* Oppgave 12.10.1
*
* Klassen OppgaveoversiktBGS
*/


import static javax.swing.JOptionPane.*;

public class OppgaveoversiktBGS {
    private final String[] ALTERNATIVER = {"Finn antall studenter registrert",
                                         "Finn antall oppgaver som en bestemt student har l�st",
                                         "Registrer en ny student",
                                         "�k antall oppgaver for en bestemt student",
                                         "Avslutt"};

    private final int FINN_ANT_STUDENTER = 0;
    private final int FINN_ANT_OPPGAVER = 1;
    private final int REG_NY_STUDENT = 2;
    private final int �K_ANTALL_OPG = 3;
    private final int AVSLUTT = 4;

    private Oppgaveoversikt oppgaveoversikt;

    public OppgaveoversiktBGS(Oppgaveoversikt oppgaveoversikt) {
        this.oppgaveoversikt = oppgaveoversikt;
    }

    public int lesValg() {
        int valg = showOptionDialog(null, "Hva vil du gj�re?\n" + oppgaveoversikt, "Oppgaveoversikt", DEFAULT_OPTION,
                PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
        if (valg == AVSLUTT) {
            valg = -1;
        }
        return valg;
    }

    public void utforValgtOppgave(int valg) {
        switch (valg) {
            case FINN_ANT_STUDENTER:
                finnAntStudenter();
                break;

            case FINN_ANT_OPPGAVER:
                finnAntOppgaver();
                break;

            case REG_NY_STUDENT:
                regNyStudent();
                break;

            case �K_ANTALL_OPG:
                �kAntallOpg();
                break;

            default:
                break;
        }
    }

    private void finnAntStudenter() {
        showMessageDialog(null, "Antall studenter registrert: " + oppgaveoversikt.finnAntStudReg());
    }

    private void finnAntOppgaver() {
        String navnLest = showInputDialog("Hvem vil du finne l�ste oppgaver for?");
        int antL�stOpg = oppgaveoversikt.finnAntOppgL�st(navnLest);
        if (antL�stOpg >= 0) {
            showMessageDialog(null, navnLest + " har l�st " + antL�stOpg + " antall oppgaver.");
        } else {
            showMessageDialog(null, "Noe gikk galt, vennligst pr�v igjen.");
        }
    }

    private void regNyStudent() {
        String navnLest = showInputDialog("Navn p� studenten:");
        String antOpgLest = showInputDialog("Antall oppgaver studenten har l�st:");
        int antOpg = Integer.parseInt(antOpgLest);
        if (oppgaveoversikt.regNyStudent(navnLest, antOpg)) {
            showMessageDialog(null, "Registrering fullf�rt!");
        } else {
            showMessageDialog(null, "Noe gikk galt, vennligst pr�v igjen.");
        }
    }

    private void �kAntallOpg() {
        String navnLest = showInputDialog("Navn p� studenten:");
        String opg�kningLest = showInputDialog("Hvor mange oppgaver vil du �ke med:");
        int opg�kning = Integer.parseInt(opg�kningLest);
        oppgaveoversikt.�kAntOppg(navnLest, opg�kning);
    }
}