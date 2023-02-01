package ders08_Ternary;

import java.util.Scanner;

public class C07_SwichtCase {
    public static void main(String[] args) {
//        j:java
//        D: devolepment
//        K: kit
//                kullanıcıdan bir harf alın
//                alınan harf j-d-k dan biri ise yukarıdakı kelımelerı yazdırın
//                bu harflerden biri degilse "gecersiz harf " yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
        //DİKKAT : switch parantezinde long,double float ve boolean kullanılmaz
        char harf = scan.next().charAt(0);
        switch (harf) {
            case 'D':
            case 'd':
                System.out.println("Devolepment");
                break;
            case 'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Gecersiz harf");
        }

    }
}


