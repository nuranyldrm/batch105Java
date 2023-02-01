package ders04_matematikselİslemler;

public class C01_DataCasting {public static void main(String[] args) {
        int sayi1=20;
        int sayi2=6;
        System.out.println(sayi1/sayi2); //3 ,666 olması gerekirken 3 olur virgulden sonrasını göstermez
        //bölünen ve böle ikiside tam sayı ıse , java sonucun tam say kısmını alır

        double sayi3=6;
        System.out.println(sayi1/sayi3); //3,3333 int / doble java genis olana göre davranır


    }
}
