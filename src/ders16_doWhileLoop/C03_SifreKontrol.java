package ders16_doWhileLoop;

import java.util.Scanner;

public class C03_SifreKontrol {
public static void main(String[] args) {

            //Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
            //kontrol edin ve sifredeki hatalari yazdirin.
            //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
            //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
            //- Sifre kucuk harf icermelidir
            //- Sifre buyuk harf icermelidir
            //- Sifre ozel karakter icermelidir
            //- Sifre en az 8 karakter olmalidir.
    Scanner scan = new Scanner(System.in);
    String sifre;
    boolean sifreDogruMu;
    int bayrak;
    do {
        System.out.println("Lutfen bir sifre giriniz");
        sifre = scan.nextLine();
        // tüm hataları söylemesini istiyorsak bagımsız if cumlelerı ve bayrak kullanmak zorundayız
        bayrak = 0;

        int sonuc = kucukHarfKontroluYap(sifre);
        //kücük harf kontrolu yapan bir method olusturalım
        //kucuk harf varsa 1,yoksa 0 doldursun
        bayrak += sonuc;

        sonuc = buyukHarfKontroluYap(sifre);
        //buyük harf kontrolu yapan bir method olusturalım
        //büyük harf varsa 1,yoksa 0 doldursun
        bayrak += sonuc;

        sonuc = ozelKarakterKontroluYap(sifre);
        //özel karakter kontrolu yapan bir method olusturalım
        //özel karakter varsa 1,yoksa 0 doldursun
        bayrak += sonuc;

        if (sifre.length() < 8) {
            System.out.println("sifre en az 8 karakter olmalidir");
        } else {
            ++bayrak;
        }
    } while(bayrak != 4); //en sona geldigimizde bayrak 4 olmalı o zaman sifre tamam

    System.out.println("Sifreniz basari ile kaydedildi");
}

    public static int kucukHarfKontroluYap(String sifre) {
    int bayrak=0;
    // sifre kücük harf icermelidir
        // bunun icin tüm harfleri kontrol edecek bir fot loop olusturalım
        // 1 tane kucuk harf bulması yeterli olacak
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                bayrak++;
                break;
            }

        }
        if (bayrak == 0) {
            System.out.println("Sifre kücük harf icermelidir");
            return 0;
        } else {
            return 1;
        }
    }
    public static int  buyukHarfKontroluYap( String sifre) {
    int bayrak=0;
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                bayrak++;
                break;
            }

        }
        if (bayrak == 0) {
            System.out.println("Sifre büyük harf icermelidir");
            return 0;
        } else {
            return 1;
        }
    }

    public static int ozelKarakterKontroluYap(String sifre) {
        int bayrak = 0;
        String ozelKarakterler = "§±@!$%^&*()_-+=?/>.<,`~#";
        // sifre özel karakter icermelidir
        //bunun icin tum harflerı kontrol edecek bir fot loop olusturalım
        //eger sifrenin karakterlerinden bir tanesi özel karakterler String i iceriyorsa
        // bizim icin yeterli olur

        for(int i = 0; i < sifre.length(); ++i) {
            if (ozelKarakterler.contains(sifre.substring(i, i + 1))) {
                ++bayrak;
                break;
            }
        }

        if (bayrak == 0) {
            System.out.println("Sifre ozel karakter icermelidir");
            return 0;
        } else {
            return 1;
        }
    }}
