package ders12_forLoops;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        // kullanıcının verdiği sayının rakamlar toplamını bulun

        long sayi = 43011238841L;// long oldugu ıcın arkaların l koyduk ınt olsaydı L lerı kaldıracaktık
        String sayiStr = "" + sayi;
        long birlerBasamagi = 0L;
        long rakamlarToplami = 0L;

        for(int i = 1; i <= sayiStr.length(); ++i) {
            birlerBasamagi = sayi % 10L;
            rakamlarToplami += birlerBasamagi;
            sayi=sayi /10L;
        }

        System.out.println(rakamlarToplami);
    }
}
