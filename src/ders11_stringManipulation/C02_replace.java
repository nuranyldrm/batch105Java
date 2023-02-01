package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        // eski harf veya kelıme yerine bir defalık yenı yazılan kelımeyi yazar
        String str = "Java candir";
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace(' ', '_'));
        System.out.println(str.replace("candir", "cok guzeldir."));
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("a", "")); //a nın yerine hiclik yazar yanı aslında a ları sıler

        // java yerine hava -candır yerine cok guzel yazdırın
        System.out.println(str.replace("Java", "Hava")
                               .replace("candir", "cok guzel"));

        System.out.println(str.replace("", "_"));//hiçlik yerine altcizgi

        System.out.println(str.replaceFirst("a", "A"));
        // sadece 1. a  yi A yap
    }
}
