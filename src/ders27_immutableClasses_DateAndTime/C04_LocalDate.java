package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public C04_LocalDate() {
    }

    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.minusDays(100L));
        System.out.println(tarih.minusWeeks(5L).minusDays(3L));
        System.out.println(tarih.plusMonths(5L).plusWeeks(2L).plusDays(3L));
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.getMonth());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.isLeapYear());
        System.out.println(tarih.withYear(2000).isLeapYear());
        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13));
        System.out.println(tarih.lengthOfYear());
        System.out.println(tarih.withYear(2020).lengthOfYear());
        System.out.println(tarih.withYear(1991).withMonth(3).withDayOfMonth(15).getDayOfWeek());
        LocalDate date1 = LocalDate.of(2011, 11, 11);
        LocalDate date2 = LocalDate.of(2010, 10, 10);
        System.out.println(date2.isBefore(date1));
        System.out.println(date2.isAfter(date1));
        System.out.println(tarih.equals(date1));
    }
}


