package ders06_IfElseStatements;

import java.util.Scanner;

public class C09_İfElseStatements {
    public static void main(String[] args) {

        // kullanıcıdan bir tam sayı alın
        // sayı negatif ise gecersiz sayı
        // tek basamaklı ise rakam
        //iki basamaklı ise  iki basamaklı sayi
        // bunun dısındakı sayılar ıcın büyük sayı yazdırın

       // Scanner scan=new Scanner(System.in);
       // System.out.println("Lütfen bir tam sayı giriniz ");
        int sayi=20;

        if (sayi<0){
            System.out.println("Gecersiz sayi");
        } else if (sayi<10) {
            System.out.println("rakam");
        } else if (sayi<100) {
            System.out.println("iki basamaklı sayi");
        }else {
            System.out.println("büyük sayi");

        }

    }

    }

