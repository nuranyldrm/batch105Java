package ders12_forLoops;

public class C04_rAKAMLARItoplamıÖrnek {
    public static void main(String[] args) {
              int sayi = 430112341;
      //// kullanıcının verdiği sayının rakamlar toplamını bulun
        String sayiStr = "" + sayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        for(int i = 1; i <= sayiStr.length(); ++i) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi = sayi / 10;
        }
        System.out.println(rakamlarToplami);
    }
}
