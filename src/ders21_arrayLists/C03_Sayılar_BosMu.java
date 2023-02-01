package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_Sayılar_BosMu {
    public static void main(String[] args) {
        // sayılar bosmu -true bos - false bos değil
        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar.isEmpty()); // true
        sayilar.add(10);
        sayilar.add(20);
        System.out.println(sayilar.isEmpty());// false
    }
}
