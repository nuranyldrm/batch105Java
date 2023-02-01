package ders37_exceptions;

import java.util.Scanner;

public class C06_ThrowKeyword {
    public C06_ThrowKeyword() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        if (yas <= 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException var4) {
                var4.printStackTrace();
                System.out.println("yas sifir veya negatif OLAMAZ");
            }
        }

    }
}


