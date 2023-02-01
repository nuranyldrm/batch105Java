package ders07_NestedİfStatements;

import java.util.Scanner;

public class C02_NestedİfStatements {
    public static void main(String[] args) {


        // kullanıcı aldıgı urun adedi ve liste fiyatını alın
        // kullanıcıya musteri kartı olup olmadıgını sorun
        // musteri kartı varsa 10 urunden fazla alırsa %20,10 üründen az ise  %15 inidirim yapın
        // müsteri kartı yoksa 10 urunden fazla alırsa %15 ,10 üründen az ise  %10 inirim yapın


        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen ürün sayisini giriniz");
        //int urunAdedi = scan.nextInt();
        //System.out.println("lütfen liste fiyatini giriniz");
       // double ListeFiyati = scan.nextDouble();
        //System.out.println("kartınız var mı E/H");
       // char kartVaMi=scan.next().charAt(0);
       // kullanıcıdan isterken bu sekılde yapılırdı

       int  urunAdedi=30;
       boolean kartVaMi=true;
        double ListeFiyati = 12.5;
        double toplamFiyat = 0;

        if (kartVaMi == true && urunAdedi >= 10) {
            toplamFiyat = urunAdedi * ListeFiyati * (0.8);
            System.out.println("%20 indirimli  toplam fiyat:" + toplamFiyat);
        } else if (kartVaMi == true && urunAdedi < 10 && urunAdedi > 0) {
            toplamFiyat = urunAdedi * ListeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat);
        } else if (!kartVaMi && urunAdedi > 10) { // basına ünlem koymak yeterli false olunca
            toplamFiyat = urunAdedi * ListeFiyati * (0.85);
                System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat);
            }else if (kartVaMi==false & urunAdedi<10 & urunAdedi>0){
                toplamFiyat = urunAdedi * ListeFiyati * (0.9);
                System.out.println("%10 indirimli toplam fiyat:" + toplamFiyat);
            }else {
                System.out.println("Gecersiz giriş");
                // sarı olan yerler icin true ve false yazmana gerek yok dıyor aslında olmasada olur tanımlandıgı ıcın
            }
            }
        }