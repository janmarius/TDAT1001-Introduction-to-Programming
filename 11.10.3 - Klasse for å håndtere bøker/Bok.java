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
    private int utgivelsesår;
    private int antallSider;
    private String forlag;

    public Bok(String navn, String forfatter, int utgivelsesår, int antallSider, String forlag) {
        this.navn = navn;
        this.forfatter = forfatter;
        this.utgivelsesår = utgivelsesår;
        this.antallSider = antallSider;
        this.forlag = forlag;
    }

    public String getNavn() {
        return navn;
    }

    public String getForfatter() {
        return forfatter;
    }

    public int getUtgivelsesår() {
        return utgivelsesår;
    }

    public int getAntallSider() {
        return antallSider;
    }

    public String getForlag() {
        return forlag;
    }

    // Sammenligner alderen til to bøker.
    public int sammenlignAlder(Bok bok) {
        return utgivelsesår - bok.getUtgivelsesår();
    }

    // Sammenligner antall sider.
    public int sammenlignAntallSider(Bok bok) {
        return antallSider - bok.getAntallSider();
    }

    // Finner ut om det er samme forfatter.
    public boolean sammenlignForfatter(Bok bok) {
        return forfatter.equalsIgnoreCase(bok.getForfatter());
    }

    // Finner ut om to bøker er utgitt på samme forlag.
    public boolean sammenlignForlag(Bok bok) {
        return forlag.equalsIgnoreCase(bok.getForlag());
    }

    @Override
    public String toString() {
        return navn + "\n" +
               "Forfatter: " + forfatter + "\n" +
               "Utgivelsesår: " + utgivelsesår + "\n" +
               "Antall sider: " + antallSider + "\n" +
               "Forlag: " + forlag;
    }
}
