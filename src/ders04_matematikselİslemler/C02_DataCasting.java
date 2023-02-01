package ders04_matematikselİslemler;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
        //soru kullanıcıdan iki double sayı alın,
        //ilk sayıyı ikinci sayıya bölün ve bölüm isleminin sonucunun tam sayı kısmına yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        int bölmeSonucuTamsayı= (int)(sayi1/sayi2);
        System.out.println(bölmeSonucuTamsayı);
    }
}
