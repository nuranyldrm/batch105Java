package ders28_varargs_stringBuilder;

public class C02_Varargs {
    public C02_Varargs() {
    }

    public static void main(String[] args) {
        topla(5, 6);
        topla(5, 3, 8);
        topla(2, 4, 6, 8);
        topla(1);
        topla();
        topla(4, 5, 6, 7, 5, 3, 2, 1, 2, 34, 45, 56, 6, 6);
    }

    public static void topla(int... sayilar) {
        int toplamSonucu = 0;
        int[] var2 = sayilar;
        int var3 = sayilar.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int each = var2[var4];
            toplamSonucu += each;
        }

        System.out.println("Girilen sayilarin toplami : " + toplamSonucu);
    }
}


