package ders26_passByvalue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {
        double fiyat = 100.0;
        System.out.println(indirimUygula(fiyat));
        System.out.println(indirimUygula(fiyat));
        System.out.println(indirimUygula(fiyat));
        System.out.println(fiyat);
        fiyat = indirimUygula(fiyat);
        System.out.println("indirim uygulanmis yeni fiyat : " + fiyat);
    }

    public static double indirimUygula(double fiyat) {
        fiyat *= 0.9;
        return fiyat;
    }
}


