package ders14_methodOlusturma;

public class C02_StringConcate {
    public static void main(String[] args) {
        //verilen iki stringi parametre olarak kabul edip
        // bu ıkı string i aralarında bir bosluk olan tek bir string olarak
        // main mathoda dönduren bir method olusturun

        String str1 = "Java";
        String str2 = "Candir";
        System.out.println(birlestirMethodu(str1, str2));
        System.out.println(birlestirMethodu("Bu da", "oldu"));
        System.out.println(birlestirMethodu("Anladiniz", "mi?"));
    }

    public static String birlestirMethodu(String str1, String str2) {
        return str1 + " " + str2;
    }
}

