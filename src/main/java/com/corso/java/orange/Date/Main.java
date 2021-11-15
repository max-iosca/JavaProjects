package com.corso.java.orange.Date;

import com.corso.java.orange.ColoringConsole.ColoringConsole;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    private LocalTime ora;
    private LocalDate data;
    private LocalDateTime dataOra;

    public static void main(String[] args) {

        //dateJavaOldStyle();

        //dateJavaOldStyleCalendar();

        dateJavaGood();
    }

    /**
     * java.time
     * Finalmente dalla 1.8 le date, o meglio, il tempo gestito in maniera sensato
     * http://losviluppatore.it/date-time-con-java-8-parte-i/
     *
     * DIFFERENZE TRA UTC e GMT
     *
     * Il Greenwich Mean Time (GMT) viene spesso scambiato o confuso con il Coordinated Universal Time (UTC).
     * Ma GMT è un fuso orario e UTC è uno standard orario.
     *
     * Sebbene GMT e UTC condividano la stessa ora corrente in pratica, c'è una differenza di base tra i due:
     *
     * GMT è un fuso orario ufficialmente utilizzato in alcuni paesi europei e africani.
     * L'ora può essere visualizzata utilizzando il formato 24 ore (0 - 24) o il formato 12 ore (1 - 12 am/pm).
     * UTC non è un fuso orario, ma uno standard di tempo che è la base dell'ora civile e dei fusi orari in tutto il mondo.
     * Ciò significa che nessun paese o territorio utilizza ufficialmente UTC come ora locale.
     *
     */
    private static void dateJavaGood() {
        System.out.println(ColoringConsole.GREEN_BOLD + "\nLe Date Java dalla 1.8 (Con time.package)..."+ColoringConsole.RESET);

        System.out.println(LocalDateTime.now());

        LocalDate date = LocalDate.of(2014, Month.SEPTEMBER, 9);
        int year = date.getYear(); // 2014
        Month month = date.getMonth(); // SEPTEMBER
        int dom = date.getDayOfMonth(); // 9
        DayOfWeek dow = date.getDayOfWeek(); // Tuesday
        int len = date.lengthOfMonth(); // 30 (Numero di gg di settembre)
        boolean leap = date.isLeapYear(); //false (2014 non è bisestile)
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(date.format(DateTimeFormatter.ofPattern("w dd.MM.yyyy")));

        //
        String patternIta = "dd/MM/yyyy";
        LocalDate dtIniziale = LocalDate.of(2011, 10, 1);
        LocalDate dtFinale = LocalDate.of(2011, 10, 5);
        boolean dtFinaleMaggioreDtIniziale = dtFinale.isAfter(dtIniziale);
        System.out.println("La data inziale " + dtIniziale.format(DateTimeFormatter.ofPattern(patternIta)) + " é minore di quella finale: " +
                dtIniziale.format(DateTimeFormatter.ofPattern(patternIta)) + " =  " + dtFinaleMaggioreDtIniziale);

        dtFinale.minusDays(dtIniziale.getDayOfMonth());
        Long differenza = ChronoUnit.DAYS.between(dtIniziale, dtFinale);
        System.out.println("Ci sono " + differenza + " giorni di differenza tra la " + dtIniziale.format(DateTimeFormatter.ofPattern(patternIta)) + " e quella finale: " +
                dtIniziale.format(DateTimeFormatter.ofPattern(patternIta)) + " =  " + dtFinaleMaggioreDtIniziale);

        String localDateString = "2011-10-26";
        LocalDate dataDaUnaString = LocalDate.parse(localDateString);
        System.out.println("Data ottenuta da una stringa: " + dataDaUnaString.format(DateTimeFormatter.ofPattern(patternIta)));

        String localDateErrataString = "2011-26-26";
        LocalDate dataDaUnaStringErrata = null;
        try {
            dataDaUnaStringErrata = LocalDate.parse(localDateErrataString);
            System.out.println("Data ottenuta da una stringa: ("+ localDateErrataString +")" + dataDaUnaString.format(DateTimeFormatter.ofPattern(patternIta)));
        } catch(DateTimeParseException e) {
            System.out.println("Data ottenuta da una stringa: ("+ localDateErrataString +") é errata." );
        }

        // in italiano
        String localDateItaString = "27.10.2021";
        LocalDate dataItaDaUnaString = LocalDate.parse(localDateItaString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println("Data ottenuta da una stringa: ("+ localDateItaString +") "
                + dataItaDaUnaString.format(DateTimeFormatter.ofPattern(patternIta)));

        // https://mkyong.com/java8/java-display-all-zoneid-and-its-utc-offset/
        ZonedDateTime oraDiLondra = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("A Londra sono le: " + oraDiLondra.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        ZonedDateTime oraDiParigi = ZonedDateTime.now(ZoneOffset.of("+02:00"));
        System.out.println("A Parigi sono le: " + oraDiParigi.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

    }



    /**
     * Classe Date
     * Le versioni antecedenti al rilascio della classe Calendar utilizzavano un banalissimo Long per
     * calcolare il tempo!!!! Semplicemente deprimente.
     * Assolutamente deprimente
     */
    private static void dateJavaOldStyle() {
        System.out.println(ColoringConsole.GREEN_BOLD + "\nLe Date Java Prima della 1.8 (Con Date.class)..."+ColoringConsole.RESET);
        Date dataPrimaDiJava8 = new Date();
        System.out.println("Data dataPrimaDiJava8: " + dataPrimaDiJava8);

        DateFormat formatoDataShort = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
        System.out.println("Data dataPrimaDiJava8: " + formatoDataShort.format(dataPrimaDiJava8));

        DateFormat formatoDataMedium = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ITALY);
        System.out.println("Data dataPrimaDiJava8: " + formatoDataMedium.format(dataPrimaDiJava8));

        // https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html
        SimpleDateFormat formatoDataCustom1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ITALY);
        System.out.println("Data dataPrimaDiJava8: " + formatoDataCustom1.format(dataPrimaDiJava8));

        SimpleDateFormat formatoDataCustom2 = new SimpleDateFormat("dd-MM-yyyy", Locale.ITALY);
        System.out.println("Data dataPrimaDiJava8: " + formatoDataCustom2.format(dataPrimaDiJava8));
    }


    /**
     * Classe Calendar
     * (l'unica cosa interessante di Calendar é che vi permette di creare nuovi calendari, tipo quelli di altri sistemi solari.
     *  Ad esempio il calendario Klingoniano -:))
     *
     * Assolutamente deprimente
     */
    private static void dateJavaOldStyleCalendar() {
        System.out.println(ColoringConsole.GREEN_BOLD + "\nLe Date Java Prima della 1.8 (Con Calendar.class)..."+ColoringConsole.RESET);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        int year       = calendar.get(Calendar.YEAR);
        int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

        int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
        int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute     = calendar.get(Calendar.MINUTE);
        int second     = calendar.get(Calendar.SECOND);
        int millisecond= calendar.get(Calendar.MILLISECOND);

        System.out.println(sdf.format(calendar.getTime()));

        System.out.println("year \t\t: " + year);
        System.out.println("month \t\t: " + month);
        System.out.println("dayOfMonth \t: " + dayOfMonth);
        System.out.println("dayOfWeek \t: " + dayOfWeek);
        System.out.println("weekOfYear \t: " + weekOfYear);
        System.out.println("weekOfMonth \t: " + weekOfMonth);

        System.out.println("hour \t\t: " + hour);
        System.out.println("hourOfDay \t: " + hourOfDay);
        System.out.println("minute \t\t: " + minute);
        System.out.println("second \t\t: " + second);
        System.out.println("millisecond \t: " + millisecond);


        SimpleDateFormat sdfSample = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendarSample = new GregorianCalendar(2013,0,31);
        System.out.println(sdfSample.format(calendarSample.getTime()));
    }

}
