package ders10_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        // contains =içeriyor mu  ? var yada yok
        String str = "Java ile kodlama cok zevkli";
        // charSequence = karakter dizisi = char dizisi
        System.out.println(str.contains("cok"));
        System.out.println(str.contains("odla"));
        System.out.println(str.contains("a"));

       // System.out.println(str.contains('s')); // parametre olarak char kabul etmez

        System.out.println(str.contains("java")); // küçük j yok o nedenle false
        String str2 = "Java";
        System.out.println(str.contains(str2));

        String str3 = "234 Ali Can ";
        str3.contains("2");
    }
}
