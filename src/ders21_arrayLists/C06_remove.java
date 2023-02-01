package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};
        List<Integer> sayilar = new ArrayList();

        for(int i = 0; i < arr.length; ++i) {
            sayilar.add(arr[i]);
        }

        sayilar.remove(2);
        System.out.println(sayilar);
        sayilar.remove(5);
        System.out.println(sayilar);
        /*
        listemiz integer lardan olusuyorsa
        biz int bie deger yazdıgımızda hep index kabul ettıgınden
        istedigimiz elementi obje olarak girip sildirmek icin önceden tanımlamamız gerekir
         */
        Integer silinecekObje = 4;
        sayilar.remove(silinecekObje);
        System.out.println(sayilar);
        // tüm 3 leri sildirme
        silinecekObje = 3;

        while(sayilar.contains(silinecekObje)) {
            sayilar.remove(silinecekObje);
        }

        System.out.println(sayilar);
        silinecekObje = 10;
        System.out.println(sayilar.remove(silinecekObje));
       // sayilar.remove(20); // olmayanı silecek olursak IndexOutOfBoundsException fırlatır

        sayilar.clear();// tüm listeyi siler
        System.out.println(sayilar);

    }
}
