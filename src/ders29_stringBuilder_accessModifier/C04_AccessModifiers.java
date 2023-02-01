package ders29_stringBuilder_accessModifier;

public class C04_AccessModifiers {
    String isim = "Ali";
    private static int sayi = 10;

    public C04_AccessModifiers() {
    }

    public static void main(String[] args) {
        System.out.println(sayi);
        sayi = 20;
        System.out.println(sayi);
    }
}


