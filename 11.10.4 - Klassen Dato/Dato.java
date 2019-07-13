/**
* Dato.java
*
* Oppgave 11.10.4
*
* Klassen Dato.
*/

import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Dato implements Comparable<Dato> {
    private GregorianCalendar gregorianCalendar = new GregorianCalendar();
    private final String DATOFORMAT = "dd.MM.yyyy";
    private static final int ANT_TIMER_PR_DØGN = 24;
    private static final int ANT_MIN_PR_TIME = 60;
    private static final int ANT_SEK_PR_MIN = 60;
    private static final int ANT_MS_PR_SEK = 1000;
    private static final long ANT_MS_PR_DØGN = ANT_TIMER_PR_DØGN * ANT_MIN_PR_TIME * ANT_SEK_PR_MIN * ANT_MS_PR_SEK;


    public Dato() {

    }

    public Dato(Date dato) {
        gregorianCalendar.setTime(dato);
    }

    public Dato(String dato) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATOFORMAT);
        simpleDateFormat.setLenient(false);
        Date date = simpleDateFormat.parse(dato);
        gregorianCalendar.setTime(date);
    }


    public Dato nyDato(long dager) {
        long datoMillisekund = gregorianCalendar.getTimeInMillis() + dager * ANT_MS_PR_DØGN;
        Date dato = new Date(datoMillisekund);
        return new Dato(dato);
    }

    public int compareTo(Dato dato) {
        if (gregorianCalendar.before(dato.gregorianCalendar)) {
            return -1;
        } else if (gregorianCalendar.equals(dato.gregorianCalendar)) {
            return 0;
        } else {
            return 1;
        }
    }

    public int antallDagerMellomDato(Dato dato) {
        long dagerMillisekund = dato.gregorianCalendar.getTimeInMillis() - gregorianCalendar.getTimeInMillis();
        return (int) (dagerMillisekund / ANT_MS_PR_DØGN);
    }

    @Override
    public String toString() {
        Date dato = gregorianCalendar.getTime();
        return dato.toString();
    }
}
