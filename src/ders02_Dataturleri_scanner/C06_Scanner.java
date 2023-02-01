package ders02_Dataturleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //soru = kullanıcıdan bir dikdortgenın 2 kenar uzunlugunu alıp
        //dikdortgen alanını yazdırın

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen dikdortgenın iki kenar uzunlugunu girin" +
                "\niki kenar uzunlugu arasında enter'a basin");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("dikdörtgenin alanı :"+(kenar1*kenar2) );
    }
}
