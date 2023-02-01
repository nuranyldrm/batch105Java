package ders06_IfElseStatements;

import java.util.Scanner;

public class C00_HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi1,sayi2,secim;
        System.out.println("ilk sayiyi giriniz:");
        sayi1= scan.nextInt();
        System.out.println("\n ikinci sayiyi giriniz :");
        sayi2= scan.nextInt();
        System.out.println("lütfen yapmak istediğiniz işlemi seciniz:");
        System.out.println("1-Toplama\n2- Çıkarma\n 3-Çarpma\n 4-Bölme");
        System.out.print("Seciminiz : ");
        secim=scan.nextInt();

        if (secim==1){
            System.out.println("Toplama:"+ (sayi1+sayi2));
        } else if (secim==2) {
            System.out.println("Çıkarma:"+ (sayi1-sayi2));
        } else if (secim==3) {
            System.out.println("Çarpma:"+(sayi1*sayi2));
        } else if (secim==4) {
            if (secim==0) {
                System.out.println("ikinci sayi 0'a eşittir ve sonuc belirsizdir.");
            }else {
            } System.out.println("Bölme:"+ (sayi1/sayi2));
        }else {
            System.out.println("Gecersiz bir işlem girdiniz tekrar deneyiniz!");
        }
    }
}
