package ders08_Ternary;

public class C04_TernaryClass {
    public C04_TernaryClass () {
    }
    // kullanıcıdan bir ücgenın 3 kenar uzunlugunu alın
    // ucgen es kenar ise "eşkenar ucgen " yazdırın degilse" eskenar degil" yadırın

    public static void main(String[] args) {
        int kenar1 = 0;
        int kenar2 = 0;
        int kenar3 = 0;
        System.out.println(kenar1 > 0 && kenar2 > 0 && kenar3 > 0 && kenar1 == kenar2 && kenar2 == kenar3 ? "Eskenar ucgen" : "Eskenar ucgen degil");

        // kullanıcıdan iki sayi alın ve buyuk olmayan sayıyı yazdırın
        int sayi1 = 11;
        int sayi2 = 12;
        System.out.println(sayi1 > sayi2 ? sayi2 : sayi1);
    }
}
