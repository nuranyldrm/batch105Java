package ders07_NestedİfStatements;

import java.util.Scanner;

public class C01_NestedİfStatements {
    public static void main(String[] args) {

        // kullanıcıdan kilo (kg) ve boyunu (cm) isteyıp kıtle endeksini hesalpayın
        //(kilo*10000 / (boy*boy))
        // vucut kitle e ndeksi 30'dan büyük ise obez
        //20-25 arası ise normal
        //20 den kucukse zayıf yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kg olarak kilonuzu giriniz ");
        double kg= scan.nextDouble();
        System.out.println("lütfen cm olarak boyunuzu giriniz ");
        double boy= scan.nextDouble();
        double vke=(kg*10000/(boy*boy));
        System.out.println("vücüt kitle endeksi:"+ vke);

        if (vke>30){
            System.out.println("obez");
        } else if (vke>25) {
            System.out.println("kilolu");
        } else if (vke<20) {
            System.out.println("normal");
        } else if (vke>0) {
            System.out.println("zayif");
        }else {
            System.out.println("yanlıs giris");

        }

    }


    }