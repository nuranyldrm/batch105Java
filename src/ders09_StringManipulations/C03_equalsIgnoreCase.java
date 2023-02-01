package ders09_StringManipulations;

public class C03_equalsIgnoreCase {
    public C03_equalsIgnoreCase() {
    }

    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase("Ali Can"));
        System.out.println(str1.equalsIgnoreCase( "ali"));
        /*
        equalsıgnorecase aynı metnin buyuk ve kucuk harf kullanılarak olusturulan farklı yazımlarını birbirine esit olarak kabul eder
        yanı equalsIgnoreCase için Ali -ALİ-ali birbirine esittir
        ama kelimede farklılık arsa bunları kabul etme a li - ali. gibi karakterler ve bosluklarda farkeder
         */
    }
}

