/**
* Bok.java
*
* Oppgave 11.10.3
*
* Klassen Bok
*/

public class Bok {
    private String navn;
    private String forfatter;
    private int utgivelses�r;
    private int antallSider;
    private String forlag;

    public Bok(String navn, String forfatter, int utgivelses�r, int antallSider, String forlag) {
        this.navn = navn;
        this.forfatter = forfatter;
        this.utgivelses�r = utgivelses�r;
        this.antallSider = antallSider;
        this.forlag = forlag;
    }

    public String getNavn() {
        return navn;
    }

    public String getForfatter() {
        return forfatter;
    }

    public int getUtgivelses�r() {
        return utgivelses�r;
    }

    public int getAntallSider() {
        return antallSider;
    }

    public String getForlag() {
        return forlag;
    }

    // Sammenligner alderen til to b�ker.
    public int sammenlignAlder(Bok bok) {
        return utgivelses�r - bok.getUtgivelses�r();
    }

    // Sammenligner antall sider.
    public int sammenlignAntallSider(Bok bok) {
        return antallSider - bok.getAntallSider();
    }

    // Finner ut om det er samme forfatter.
    public boolean sammenlignForfatter(Bok bok) {
        return forfatter.equalsIgnoreCase(bok.getForfatter());
    }

    // Finner ut om to b�ker er utgitt p� samme forlag.
    public boolean sammenlignForlag(Bok bok) {
        return forlag.equalsIgnoreCase(bok.getForlag());
    }

    @Override
    public String toString() {
        return navn + "\n" +
               "Forfatter: " + forfatter + "\n" +
               "Utgivelses�r: " + utgivelses�r + "\n" +
               "Antall sider: " + antallSider + "\n" +
               "Forlag: " + forlag;
    }
}
