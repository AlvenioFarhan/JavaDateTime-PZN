package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void create() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2000, Month.MARCH, 31);
        LocalDate localDate3 = LocalDate.parse("2000-03-31");

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void with() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.withYear(2000);
        LocalDate localDate3 = localDate1.withYear(2000).withMonth(3);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void modify() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusYears(10);
        LocalDate localDate3 = localDate1.minusMonths(10);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void get() {
        LocalDate localDate1 = LocalDate.now();

        System.out.println(localDate1.getYear());
        System.out.println(localDate1.getMonth());
        System.out.println(localDate1.getMonthValue());
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.getDayOfWeek());
        System.out.println(localDate1.getDayOfYear());
    }
}
