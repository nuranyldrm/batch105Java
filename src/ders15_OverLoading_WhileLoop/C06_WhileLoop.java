package ders15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        /*
             Soru : Kullanicidan Kullanicidan sifre
            isteyin asagidaki sartlari saglamayan
            sifrelerde hatalari yazdirip,
            kullanicinin yeni sifre girmesi isteyin
            Gecerli bir sifre yazilincaya kadar bu
            islemi tekrar edin gecerli sifre
            yazilinca “sifreniz basari ile
            kaydedildi” yazdirin
            sartlar :
            - sifrenin ilk karakteri kucuk harf
            olmali
            - sifrenin son karakteri sayi olmali
         */

        Scanner scan = new Scanner(System.in);
        boolean sifreGecerliMi = false;
        String sifre = "";
        int bayrak = 0;

        while (sifreGecerliMi != true) {
            System.out.println("Lütfen sifrenizi giriniz");
            sifre = scan.nextLine();
            bayrak = 0;


            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
                System.out.println("Sifrenin ilk karakteri kücük harf olmali");
                bayrak++;
            }
            if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
                System.out.println("Sifrenin son karakteri sayı olmali");
                bayrak++;
            }
            if (sifre.length()<8){
                System.out.println("sifre en az 8 karakter olmalı");
                bayrak++;
            }
            if (!(sifre.charAt(0) < 'A' || sifre.charAt(0) > 'Z')) {
                System.out.println("Sifre en az 1 büyük harf içermeli");
                ++bayrak;
            }
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
                bayrak++;
            }
            if (bayrak == 0) {
                sifreGecerliMi = true;
                System.out.println("Sifreniz basarıyla Kaydedildi");

            }

        }
    }}