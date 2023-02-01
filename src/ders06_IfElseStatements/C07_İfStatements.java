package ders06_IfElseStatements;

import java.util.Scanner;

public class C07_İfStatements {
    public static void main(String[] args) {
        // kullanıcıdan bir harf isteyin
        // girilen karakter küçük harf ise onu buyuk olarak yazdırın
        // yoksa girilen harfi yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char krk= scanner.next().charAt(0);
        if (krk>='a' && krk<='z'){// kücük harf girildi demektir
            System.out.println((char) (krk-32));
            //ascıı tablosunda harflerin gecerleri oldugu ıcın basına char tanımlamaz isek harfın sayısal degerini yazdırır
        } else {

            // kücük harf degil demektir
            System.out.println(krk);}

    }
}
