package ders27_immutableClasses_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public C05_LocalTime() {
    }

    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();
        System.out.println(saat);
        LocalTime saat2 = LocalTime.of(15, 10, 20);
        System.out.println(saat.compareTo(saat2));
        System.out.println(saat2.withNano(45565));
    }
}


