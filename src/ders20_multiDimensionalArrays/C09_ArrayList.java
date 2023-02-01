package ders20_multiDimensionalArrays;

import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayList {

    public static void main(String[] args) {

        new Scanner(System.in);
        new C06_KullaniciyaArrayOlusturma();
        // 1- list primitive data kabul etmez int gibi
        //2-list bir interface oldugu icin direk obje olusturulamaz new List<>(); gibi kırmızı cızer
        //onun yerine sag tarafta ArrayLisr<>(); yazarız
        List<Integer> sayilar = new ArrayList();
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(7);
        System.out.println(sayilar);
    }
}

