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
                                         "Finn antall oppgaver som en bestemt student har løst",
                                         "Registrer en ny student",
                                         "Øk antall oppgaver for en bestemt student",
                                         "Avslutt"};

    private final int FINN_ANT_STUDENTER = 0;
    private final int FINN_ANT_OPPGAVER = 1;
    private final int REG_NY_STUDENT = 2;
    private final int ØK_ANTALL_OPG = 3;
    private final int AVSLUTT = 4;

    private Oppgaveoversikt oppgaveoversikt;

    public OppgaveoversiktBGS(Oppgaveoversikt oppgaveoversikt) {
        this.oppgaveoversikt = oppgaveoversikt;
    }

    public int lesValg() {
        int valg = showOptionDialog(null, "Hva vil du gjøre?\n" + oppgaveoversikt, "Oppgaveoversikt", DEFAULT_OPTION,
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

            case ØK_ANTALL_OPG:
                økAntallOpg();
                break;

            default:
                break;
        }
    }

    private void finnAntStudenter() {
        showMessageDialog(null, "Antall studenter registrert: " + oppgaveoversikt.finnAntStudReg());
    }

    private void finnAntOppgaver() {
        String navnLest = showInputDialog("Hvem vil du finne løste oppgaver for?");
        int antLøstOpg = oppgaveoversikt.finnAntOppgLøst(navnLest);
        if (antLøstOpg >= 0) {
            showMessageDialog(null, navnLest + " har løst " + antLøstOpg + " antall oppgaver.");
        } else {
            showMessageDialog(null, "Noe gikk galt, vennligst prøv igjen.");
        }
    }

    private void regNyStudent() {
        String navnLest = showInputDialog("Navn på studenten:");
        String antOpgLest = showInputDialog("Antall oppgaver studenten har løst:");
        int antOpg = Integer.parseInt(antOpgLest);
        if (oppgaveoversikt.regNyStudent(navnLest, antOpg)) {
            showMessageDialog(null, "Registrering fullført!");
        } else {
            showMessageDialog(null, "Noe gikk galt, vennligst prøv igjen.");
        }
    }

    private void økAntallOpg() {
        String navnLest = showInputDialog("Navn på studenten:");
        String opgØkningLest = showInputDialog("Hvor mange oppgaver vil du øke med:");
        int opgØkning = Integer.parseInt(opgØkningLest);
        oppgaveoversikt.økAntOppg(navnLest, opgØkning);
    }
}