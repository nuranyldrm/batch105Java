package ders04_matematikselİslemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        // kullanıcıdan iki int deger alıp,
        //bunları birbirine bölun ve sonucu double olarak yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki tamsayi giriniz");
        int sayi1= scan.nextInt(); // 20
        int sayi2= scan.nextInt(); //6

        System.out.println(sayi1/sayi2); //3

        double ondalıklıSonuc=(double) (sayi1/sayi2);// (double)(3)==>3.0

        System.out.println(ondalıklıSonuc); // 3,0
        double dogruSonuc= (double) sayi1/sayi2; // double /int genis olana göre sonuc verir
        System.out.println(dogruSonuc);//3.3333



    }
}
