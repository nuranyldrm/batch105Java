package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double girilenSayi = 0.0;
        double sayilarinToplami = 0.0;
        int sayac = 0;
        boolean devam = true;

        while(devam) {
            System.out.println("Toplanmak uzere sayi giriniz.\nBitirmek icin Q'ya basiniz");

            try {
                girilenSayi = scan.nextDouble();
                sayilarinToplami += girilenSayi;
                ++sayac;
            } catch (InputMismatchException var10) {
                String str = scan.next();
                if (str.equalsIgnoreCase("Q")) {
                    break;
                }
            }
        }

        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + sayilarinToplami);
    }
}

