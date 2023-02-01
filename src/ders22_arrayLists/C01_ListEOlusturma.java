package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ListEOlusturma {
    public static void main(String[] args) {


        List<Double> notlar = listeOlustur();
        System.out.println(notlar);
    }


    public static List<Double> listeOlustur() {

        List<Double> notlar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Double girilenNot = (Double) 5.0;

        while (girilenNot > 0) {
            System.out.println("Lütfen listeye eklemek icin not giriniz" + "\nBitirmek icin 0'a basin");
            girilenNot = scan.nextDouble();
            if (girilenNot > 0) {
                notlar.add(girilenNot);
            }
        }
        return notlar;
    }
}








