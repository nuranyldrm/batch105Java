package ders02_Dataturleri_scanner;

import java.util.Scanner;

public class C09_ScannerOdev {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı alıp, Üçüncü Bir Değişken Kullanmadan İki Değişkenin Değerlerini Değiştirme
        Scanner scan= new Scanner(System.in);
        int a=10;
        int b =20;
        System.out.println("a:"+a + "b:"+b);

        a = a + b; // a = 30  b = 20
        b = a - b; // b = 10  a = 30
        a = a - b; // a = 20  b = 10
        System.out.println("Degiskenler degistirildi...\n"+ "a :" + a + " b :" + b);


    }
}
