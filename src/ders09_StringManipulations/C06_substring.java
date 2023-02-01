package ders09_StringManipulations;

public class C06_substring {
    public C06_substring() {
    }

    public static void main(String[] args) {
        // substring yazdıgımız karakter numarasından sonra kalan kısmı yzdırır.
        String str = "Java ogren, isi kap";
        System.out.println(str.substring(5));
        System.out.println(str.substring(0));
        System.out.println(str.length());
        char var10000 = str.charAt(str.length() - 1);

        // SON HARFİ STRİNG OLARAK YAZDIRIN

        String sonHarf = "" + var10000;
        sonHarf = str.substring(str.length() - 1);
        System.out.println(sonHarf);
        System.out.println(str.substring(str.length() - 1).toUpperCase()); // BUYUK HARFLE YAZDIR
        System.out.println(str.substring(str.length() - 3).toUpperCase());
    }
}
