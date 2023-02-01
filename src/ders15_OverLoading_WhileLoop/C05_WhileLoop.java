package ders15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {

    public static void main(String[] args) {

        // kullanıcıdan toplanmak uzere sayı alın sayıların toplamı 500 olur veya gecerse
        // girilen sayı adedi, girilen sayilarin toplami  ve "Bu kadar yeter " yazdırın
        Scanner scan = new Scanner(System.in);
        double girilensayi = 0.0;
        double toplam = 0.0;

        int sayac;
        for(sayac = 0; toplam < 500.0; ++sayac) {
            System.out.println("Toplanmak icin sayi giriniz");
            girilensayi = scan.nextDouble();
            toplam += girilensayi;
        }

        System.out.println("Girilen " + sayac + " sayinin toplami : " + toplam + " oldu. Bu kadar yeter");
    }
}
