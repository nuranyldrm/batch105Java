package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {
        // set var olan bir elementi degistirmek demek
        // java da set() u update icin kullanılır
        // add() ile set() farklıdır

        //list.set(index,yeniDeger)methodu
        // istenen indexdeki eski degeri silip bize dondurur
        // ve o indexteki degeri verdigimiz yeni deger olarak atar

        int[] arr = new int[]{1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};
        List<Integer> sayilar = new ArrayList();

        int eskiDeger;
        for(eskiDeger = 0; eskiDeger < arr.length; ++eskiDeger) {
            sayilar.add(arr[eskiDeger]);
        }

        System.out.println(sayilar.set(0, 8)); // index ve yeni deger
        eskiDeger = (Integer)sayilar.set(1, 9);
        System.out.println(eskiDeger);
        System.out.println(sayilar);
    }
}

