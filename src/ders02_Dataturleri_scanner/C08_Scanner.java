package ders02_Dataturleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        //Kullancıdan iki sayı alıp ikisinin degerlerini değiştirin(swap)

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen birinci tamsayiyi giriniz");
        int sayi1= scan.nextInt();

        System.out.println("lütfen ikinci tamsayiyi giriniz");
        int sayi2= scan.nextInt();

        int  bos;
        bos= sayi2;
        sayi2=sayi1;
        sayi1=bos;
        System.out.println("sayı1'in degeri:"+sayi1);
        System.out.println("sayı2'in degeri:"+sayi2);

    }
}
