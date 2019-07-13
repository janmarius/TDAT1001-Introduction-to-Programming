/**
* BokSammenligner.java
*
* Oppgave 11.10.3
*
* Klassen BokSammenligner blir brukt til å sammenligne to ulike bøker.
*/

public class BokSammenligner {
    public String sammenlign(Bok bok1, Bok bok2) {
        String resultat = "Sammenligner:\n" + "Bok 1: " + bok1.getNavn() + "\n&\n" + "Bok 2: " + bok2.getNavn() + "\n\n";

        int alderForskjell = bok1.sammenlignAlder(bok2);
        if (alderForskjell == 0) {
            resultat += "Bok 1 og Bok 2 har likt utgivelsesår.";
        } else if (alderForskjell > 0) {
            resultat += "Bok 1 ble utgitt " + alderForskjell + " år etter Bok 2.";
        } else {
            resultat += "Bok 1 ble utgitt " + Math.abs(alderForskjell) + " år før Bok 2.";
        }

        resultat += "\n";

        int sideForskjell = bok1.sammenlignAntallSider(bok2);
        if (sideForskjell == 0) {
            resultat += "Bok 1 og Bok2 har likt antall sider.";
        } else if (sideForskjell > 0) {
            resultat += "Bok 1 har " + sideForskjell + " flere sider enn Bok 2.";
        } else {
            resultat += "Bok 1 har " + Math.abs(sideForskjell) + " færre sider enn bok 2.";
        }

        resultat += "\n";

        boolean likForfatter = bok1.sammenlignForfatter(bok2);
        if (likForfatter) {
            resultat += "Bok 1 og Bok 2 har samme forfatter.";
        } else {
            resultat += "Bok 1 og Bok 2 har forskjellige forfattere.";
        }

        resultat += "\n";

        boolean liktForlag = bok1.sammenlignForlag(bok2);
        if (liktForlag) {
            resultat += "Bok 1 og Bok 2 har samme forlag.";
        } else {
            resultat += "Bok 1 og Bok 2 har forskjellige forlag.";
        }
        return resultat;
    }
}
