package ders26_passByvalue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByvalueList2 {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        yeniListDegeriAta(sayilar);
        System.out.println("method call'dan sonra main method'da sayilar list : " + sayilar);
    }

    public static void yeniListDegeriAta(List<Integer> sayilar) {
        List<Integer> yeniList = new ArrayList();

        for(int i = 0; i < sayilar.size(); ++i) {
            yeniList.add((Integer)sayilar.get(i) + 5);
        }

        System.out.println("method'da sayilar listesinin son hali : " + yeniList);
    }
}

