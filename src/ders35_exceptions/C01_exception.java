package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
        public static void main(String[] args) {
                sayiAlKaresiniyazdir();
        }

        public static void sayiAlKaresiniyazdir() {
                Scanner scan = new Scanner(System.in);
                System.out.println("Lutfen bir tamsayi giriniz");

                try {
                        int girilenSayi = scan.nextInt();
                        System.out.print("Girdiginiz sayinin karesi : ");
                        System.out.println(girilenSayi * girilenSayi);
                } catch (InputMismatchException var2) {
                        System.out.println("Sana tam sayi degeri gir dedik :) ");
                        sayiAlKaresiniyazdir();
                }

        }
}


