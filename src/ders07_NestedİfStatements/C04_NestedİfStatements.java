package ders07_NestedİfStatements;

import java.util.Scanner;

public class C04_NestedİfStatements {
    public static void main(String[] args) {
        //kullanıcıdan cinsiyet ve yasını alın kadın 60 yas ve üzeri
        //erkek 65 yas ve üzeri emekli olabilir
        // cinsiyet ve yasını dikkate alarak
        //emekli olabilirsin veya emekli olmak icin .. yıl daha calısman gerekir yazdırın

        // ana degisken yas olsun
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println("lütfen  cinsiyet giriniz E/K");
        char cisiyet=scan.next().charAt(0);


        if ( yas<15){
            System.out.println("hatali yas girişi");
        } else if (yas<60) {
            // emekli olamaz ,calısması gereken sure cinsiyete baglı
            System.out.println("emekli olamazsın");
            if (cisiyet=='K' || cisiyet=='k') {
                System.out.println("daha" + (60 - yas) + "sene calısmalısın");
            } else if (cisiyet=='E' || cisiyet=='e') {
                System.out.println("daha" + (65 - yas) + "sene calısmalısın");
            }else {
                System.out.println("hatali cinsiyet girişi");}


        }else if (yas<65) {
            //kadın ise emekli olabilir ,erkek ise calısması lazım
            if (cisiyet=='K' || cisiyet=='k') {
                System.out.println("emekli olabilirsin");
            } else if (cisiyet=='E' || cisiyet=='e') {
                System.out.println("daha" + (65 - yas) + "sene calısmalısın");
            }else {
                System.out.println("hatali cinsiyet girişi");
            }


        }else { //yas 65 den büyükse
            System.out.println("emekli olabilirsin");
        }

    }

    }

