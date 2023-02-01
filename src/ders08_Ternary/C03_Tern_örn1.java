package ders08_Ternary;

import java.util.Scanner;

public class C03_Tern_örn1 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen birinci sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lütfen ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();

        System.out.println(sayi1<sayi2?"kücük olmayan sayi" +sayi2 : sayi2<sayi1? "kücük olmayan sayi"+sayi1 :"eşittir");

    }
}
