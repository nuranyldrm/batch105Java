package ders21_arrayLists;

import java.util.Scanner;

public class C11_Fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "lütfen bir sayı  giriniz ");
        int input=scan.nextInt();

        int sayi1=0;
        int sayi2=1;
        int toplam;

        System.out.println(input + "sayisinin fibonacci serisi");
        for (int i = 1; i <=input ; i++) {
            System.out.println(sayi1+" , ");

            toplam=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=toplam;

        }
    }
}
