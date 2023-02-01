package ders06_IfElseStatements;

public class C00_Örnek {
    public static void main(String[] args) {
        // en buyuk sayıyı bulmak
        int sayi1=50;
        int sayi2=22;
        int sayi3=30;
        int enBuyuk=sayi1;

        if (enBuyuk<sayi2) {
            enBuyuk =sayi2;

        }   if (enBuyuk<sayi3){
            enBuyuk=sayi3;

        }
        System.out.println("En Büyük :"+ enBuyuk);
        }
    }

