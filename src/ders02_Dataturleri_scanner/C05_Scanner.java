package ders02_Dataturleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //soru = kullanıcıdan bir doble ,bir de int sayı alıp
        // bunların toplamını ve carpımını yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ondalıklı bir sayi giriniz");
        double ondalikliSayı= scan.nextDouble();

        System.out.println("Lütfen bir tamsayi giriniz");
        int tamSayi= scan.nextInt();

        System.out.println("Girilen sayıların toplamı:" +(ondalikliSayı+tamSayi));

        System.out.println("Girilen sayıların carpımı:"+(ondalikliSayı*tamSayi));



    }
}
