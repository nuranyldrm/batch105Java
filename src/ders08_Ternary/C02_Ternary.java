package ders08_Ternary;

public class C02_Ternary {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "ALI";

        // verilen iki metin birbiri ıle aynı ıse "metinler aynı "
        // verilen iki metin birbiri ıle farklı ıse "metinler farklı "
        //     "equals" stringlerde yazı karsışatırması yapar matematikteki esittir gibidir    //
        if (str1.equals(str2)) {
            System.out.println("Metinler ayni");
        } else {
            System.out.println("Metinler farkli");
        }

        System.out.println(str1.equals(str2) ? "Metinler ayni" : "Metinler farkli");
    }
}
