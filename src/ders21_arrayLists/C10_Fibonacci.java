package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Fibonacci {
    public static void main(String[] args) {
        // c009 u whıle ile cozumu method
        //Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        //bir liste olarak  yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();
        if (girilenSayi < 0) {
            System.out.println("Fibonacci serisi icin 0'dan buyuk tamsayi girmelisin");
        } else if (girilenSayi == 0) {
            System.out.println("0'dan kucuk fibonacci sayisi yoktur");
        } else if (girilenSayi == 1) {
            System.out.println("1'den kucuk tek fibonacci sayisi vardir : 0");
        } else {
            fibonacciSayilariniyazdir(girilenSayi);
        }

    }

    public static void fibonacciSayilariniyazdir(int girilenSayi) {
        // buraya geldiyse girilen sayı 1 den buyuktur
        List<Integer> fibonacciListesi = new ArrayList();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);
        int yeniFibonacciSayisi = 0;
        int index=3;




        while (yeniFibonacciSayisi < girilenSayi ) { // ilk 3 eleman 011 oldugu icin 3. index e geldik

            yeniFibonacciSayisi = fibonacciListesi.get(index - 2) + fibonacciListesi.get(index - 1);

            if (yeniFibonacciSayisi < girilenSayi) {
                fibonacciListesi.add(yeniFibonacciSayisi);
            }
            index++;
        }

        System.out.println(fibonacciListesi);
    }
}


