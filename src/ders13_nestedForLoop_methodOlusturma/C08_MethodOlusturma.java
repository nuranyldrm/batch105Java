package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {

    //kullanıcıdan iki sayi alıp , bunların toplamını yazdıran bir method olsturun

    public static void main(String[] args) {

        isteToplaYazdir();
        isteToplaYazdir();
    }

    public static void isteToplaYazdir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("girilen sayilarin toplami : " + (sayi2 + sayi1));
    }
}

