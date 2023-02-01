package ders29_stringBuilder_accessModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {
    public C01_DateTimeFormatter() {
    }

    public static void main(String[] args) {
        LocalDateTime zaman = LocalDateTime.now();
        System.out.println(zaman);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(zaman.format(dtf1));
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d:MMM:YY");
        System.out.println(zaman.format(dtf2));
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d.MMMM.YYYY EEEE");
        System.out.println(zaman.format(dtf3));
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(zaman.format(dtf4));
    }
}


