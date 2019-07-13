/**
* Oppgaveoversikt.java
*
* Oppgave 12.10.1
*
* Klassen Oppgaveoversikt
*/


public class Oppgaveoversikt {
    private Student[] studenter;
    private int antStud = 0;


    public Oppgaveoversikt(int maksStudenter) {
        studenter = new Student[maksStudenter];
    }

    // Finn antall studenter registrert
    public int finnAntStudReg() {
        return antStud;
    }


    // Finn antall oppgaver som en bestemt student har løst
    public int finnAntOppgLøst(String navn) {
        int indeks = finnStudent(navn);
        if (indeks >= 0) {
            return studenter[indeks].getAntOppg();
        }
        return -1;
    }


    private int finnStudent(String navn) {
        navn = navn.toUpperCase();
        for (int i = 0; i < antStud; i++) {
            if (navn.equals(studenter[i].getNavn().toUpperCase())) {
                return i;
            }
        }
        return -1;
    }


    // Registrer en ny student
    public boolean regNyStudent(String navn, int antOppg) {
        if (antStud < studenter.length && finnStudent(navn) == -1) {
            studenter[antStud] = new Student(navn, antOppg);
            antStud++;
            return true;
        }
        return false;
    }


    // Øk antall oppgaver for en bestemt student
    public boolean økAntOppg(String navn, int økning) {
        int indeks = finnStudent(navn);
        if (gyldigIndeks(indeks)) {
            studenter[indeks].økAntOppg(økning);
            return true;
        } else {
            return false;
        }
    }


    private boolean gyldigIndeks(int indeks) {
        if (indeks >= 0 && indeks < antStud) {
            return true;
        } else {
            return false;
        }
    }

    // toString()-metode
    public String toString() {
        String res = "";
        for (int i = 0; i < antStud; i++) {
            res += studenter[i] + "\n\n";
        }
        return res;
    }
}