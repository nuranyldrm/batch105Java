package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {
    public C07_PeriodOf() {
    }

    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1972, 1, 18);
        Period gecenSure = Period.between(dogumGunu, bugun);
        System.out.println(gecenSure);
        System.out.println(gecenSure.getYears());
    }
}

