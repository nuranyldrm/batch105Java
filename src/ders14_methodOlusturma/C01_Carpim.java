package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {
    //  main metod icerisinde kullanıcıdan iki sayi alın
    //bu sayıyı parametre olarak kabul edip , carpımlarını main method a dönduren bır method olusturun

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println(carpimMethodu(sayi1, sayi2));
        double carpimSonucu = carpimMethodu(6.0, 2.0);
        System.out.println(carpimSonucu);
    }

    public static double carpimMethodu(double sayi1, double sayi2) {
        System.out.println("carpim method'u calisti");
        return sayi1 * sayi2;
    }
}
