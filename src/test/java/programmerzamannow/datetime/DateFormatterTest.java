package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {

    @Test
    void parsing() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2020 11 24", formatter);
        System.out.println(localDate);
    }

    @Test
    void format() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2020 11 24", formatter);
        String format1 = localDate.format(formatter);
        String format2 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(format1);
        System.out.println(format2);
    }

    @Test
    void i18n() {

        Locale locale1 = new Locale("id", "ID");
        Locale locale2 = new Locale("en", "US");

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale1);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale2);

        LocalDate localDate1 = LocalDate.of(2024, 7, 24);
        LocalDate localDate2 = LocalDate.of(2024, 7, 24);
        String format1 = localDate1.format(formatter1);
        String format2 = localDate2.format(formatter2);

        System.out.println("Indonesia : " + format1);
        System.out.println("Inggris : " + format2);
    }
}
