package ders15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C05_While_örnek {
    public static void main(String[] args) {
        // kullanıcıdan toplanmak uzere sayı alın sayıların toplamı 500 olur veya gecerse
        // girilen sayı adedi, girilen sayilarin toplami  ve "Bu kadar yeter " yazdırın
        Scanner scan = new Scanner(System.in);
        double girilensayi = 0.0;
        double toplam = 0.0;
        int sayac=0;

        while (toplam<500){
            System.out.println("toplanmak için sayi giriniz ");
            girilensayi=scan.nextDouble();

            toplam+=girilensayi;
            sayac++;

        }
        System.out.println("Girilen " + sayac + " sayinin toplami : " + toplam + " oldu. Bu kadar yeter");
    }
}
