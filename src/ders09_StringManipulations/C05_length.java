package ders09_StringManipulations;

public class C05_length {
    public C05_length() {
    }

    public static void main(String[] args) {
        String str = "Uzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.length()); // 34
        // SON KARAKTERİ YAZDIRIN
        System.out.println(str.charAt(33)); //U
        System.out.println(str.charAt(str.length() - 1)); // SON KARAKTERİ ELDE ETMEK İÇİN KULLANILIR
        System.out.println(str.charAt(str.length() - 3)); // SONDAN 3. KARAKTER
    }
}
