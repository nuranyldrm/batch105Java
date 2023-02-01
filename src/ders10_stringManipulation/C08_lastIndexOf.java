package ders10_stringManipulation;

public class C08_lastIndexOf {

    public static void main(String[] args) {
        //Aranan String veya char’in verilen metindeki en son kullanimini bulur ve index’ini
        //döndürür. sondan aramaya baslar fakat index sayısı normal sırasındadır

        String str = "Java hafiften beyin yakiyor";
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf(101));
        System.out.println(str.lastIndexOf("java")); // kucuk java
        System.out.println(str.lastIndexOf("Java"));
        System.out.println(str.lastIndexOf("e", 14)); // bir öncekinden baslayıp arar
    }
}
