package ders05_Concatenatıon;

import java.util.Scanner;

public class C03_If_Statements {
    public static void main(String[] args) {
        // kullanıcıdan 2 sayı alın
        // eger birinci sayı 100'den buyukse , "ilk sayı 100'Den buyuk yazdırın
        // eger 2 cif sayı cıft ıse "ikinci sayı cıft yazdırın
        // eger ilk sayı ikinci ayıdan buyukse "ilk sayı daha buyuk yazdıırın "
        Scanner scab=new Scanner(System.in);
        System.out.println( "lütfen iki tam sayi giriniz");
        int s1= scab.nextInt();
        int s2= scab.nextInt();

        // eger birinci sayı 100'den buyukse , "ilk sayı 100'Den buyuk yazdırın
        if (s1>100){
            System.out.println("ilk sayı 100 den buyuk");
        }
        // eger 2 cif sayı cıft ıse "ikinci sayı cıft yazdırın

        if (s2%2==0) {
            System.out.println("ikinci sayi cift sayi");
        }

        // eger ilk sayı ikinci sayıdan buyukse "ilk sayı daha buyuk yazdıırın "

        if (s1>s2){
            System.out.println("ilk sayi daha büyük");
        }


        // sayılar ıstenilen kosulları saglamadıgı zaman cıkıda biz göremeyebiliriz
        // bu kodun calısmadıgını göstermez
        // ıf cumleleri kodun geri kalanıyla baglantılı degildir ilgilenmez

    }
}
