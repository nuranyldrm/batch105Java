package ders42_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedListSoru {static List<Double> notListesi = new LinkedList();

    public C03_LinkedListSoru() {
    }

    public static void main(String[] args) {
        System.out.println("Oncelikle ogrenci not listesini olusturalim");
        notListesineDegerEkle();
        double notToplami = 0.0;
        int ortalamaAltindakiOgrenciSayisi = 0;
        int ortalama10PuanAltUstOgrencisayisi = 0;

        Iterator var7;
        Double eachNot;
        for(var7 = notListesi.iterator(); var7.hasNext(); notToplami += eachNot) {
            eachNot = (Double)var7.next();
        }

        double notOrtalamasi = notToplami / (double)notListesi.size();
        var7 = notListesi.iterator();

        while(var7.hasNext()) {
            eachNot = (Double)var7.next();
            if (eachNot < notOrtalamasi) {
                ++ortalamaAltindakiOgrenciSayisi;
            }

            if (eachNot >= notOrtalamasi - 10.0 && eachNot <= notOrtalamasi + 10.0) {
                ++ortalama10PuanAltUstOgrencisayisi;
            }
        }

        System.out.println("Not ortalamasi : " + notOrtalamasi + "\nOgrenci sayisi : " + notListesi.size() + "\nortalama altindaki ogrenci sayisi : " + ortalamaAltindakiOgrenciSayisi + "\nortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : " + ortalama10PuanAltUstOgrencisayisi);
    }

    public static void notListesineDegerEkle() {
        Scanner scan = new Scanner(System.in);
        boolean loopDevam = true;

        while(loopDevam) {
            try {
                System.out.println("Lutfen ogrenci notlarini giriniz \nBitirmek icin Q'ya basiniz");
                double not = scan.nextDouble();
                notListesi.add(not);
            } catch (Exception var6) {
                String girilenDeger = scan.nextLine();
                if (girilenDeger.equalsIgnoreCase("Q")) {
                    loopDevam = false;
                    break;
                }

                System.out.println("Not icin sayisal degerler girmelisiniz");
            }
        }

    }
}


