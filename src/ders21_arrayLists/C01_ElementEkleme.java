package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList();
        System.out.println(sayilar);
        System.out.println(sayilar.add(10));
        System.out.println(sayilar);
        sayilar.add(20); // yeni eklenen sayıyı sonraya ekler
        System.out.println(sayilar);
        sayilar.add(1, 15); // istediğimiz bir index sonrasına sayıyı ekler
        System.out.println(sayilar);
        sayilar.add(0, 44); // listenin basına 44 ekle
        System.out.println(sayilar);

        List<Integer> eklenecekListe = new ArrayList();
        eklenecekListe.add(3);
        eklenecekListe.add(5);
        // sayılar lisatesinin sonuna eklenecekleri ekleyın hepsını ekler addAll
        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar);
        sayilar.addAll(1, eklenecekListe);
        System.out.println(sayilar);
    }
}


