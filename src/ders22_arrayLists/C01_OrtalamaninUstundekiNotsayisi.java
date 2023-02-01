package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotsayisi {

    public static void main(String[] args) {
        // ögretmendenögrenci notlarını alıp bir list olusturun
        // ögretmen 100 den buyuk sayı  ya basıp bitirdiginde
        // sınıf sayısını ,sınıf ortalamasını ve kac kisinin ortalamanın ustunde not aldıgını yazdırın
        List<Double> notlar = listeOlustur();
        System.out.println(notlar);
        raporla(notlar);
    }

    public static void raporla(List<Double> notlar) {
        int ogrenciSayisi = notlar.size();
        double notlarToplami = 0.0;
        double sinifNotOrtalamasi = 0.0;
        int ortalamaUstundekiOgrenciSayisi = 0;
        // notlar toplamını bulalım

        int i;
        for(i = 0; i < notlar.size(); ++i) {
            notlarToplami += (Double)notlar.get(i);
        }
        // notların ortalamasını bulalım

        sinifNotOrtalamasi = notlarToplami / (double)ogrenciSayisi;
        // ortalama ustundekiogrenci sayısını bulalım

        for(i = 0; i < notlar.size(); ++i) {
            if ((Double)notlar.get(i) > sinifNotOrtalamasi) {
                ++ortalamaUstundekiOgrenciSayisi;
            }
        }
        // rapor ıcın ıstenenleri yazdıralım

        System.out.print("Girilen not sayisi : " + ogrenciSayisi +
                         "\nGirilen notlarin ortalamasi : " + sinifNotOrtalamasi +
                         "\nOrtalama uzerinde not alan ogrenci sayisi : " + ortalamaUstundekiOgrenciSayisi);
    }

    public static List<Double> listeOlustur() {
        List<Double> notlar = new ArrayList();
        Scanner scan = new Scanner(System.in);
        Double girilenNot = 5.0;

        while(girilenNot <= 100.0) {
            System.out.println("Lutfen listeye eklemek icin not giriniz\nBitirmek icin 100'den buyuk bir sayi yazin");
            girilenNot = scan.nextDouble();
            if (girilenNot <= 100.0) {
                notlar.add(girilenNot);
            }
        }

        return notlar;
    }
}

