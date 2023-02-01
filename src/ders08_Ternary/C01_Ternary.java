package ders08_Ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan bir say alın
        // sayı pozitif ise iki kaatını yazdırın
        // sayı pozitif degilse sayıya 10 ekleyip yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();
        if (sayi > 0.0) {
            System.out.println(sayi * 2.0);
        } else {
            System.out.println(sayi + 10.0);
        }

        System.out.println(sayi > 0.0 ? 2.0 * sayi : sayi + 10.0);
    }
}
