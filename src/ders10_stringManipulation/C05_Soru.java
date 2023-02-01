package ders10_stringManipulation;

public class C05_Soru {


    public static void main(String[] args) {

        /* mail kontrolu yapan bir program yazdırın
        1-mail@ isareti icermiyorsa "gecersiz mail"
        2-@gmail.com icermiyorsa "gmail adresi giriniz"
        3-@gmail.com ile bitmiyorsa "yaazım hatası"
        seklınde sonuc yazdırın
         */

        String email = "ahmet@gmail.com";
        if (!email.contains("@")) { // contaıns harfi icerisinde varmı ona bakardı
                                    // icermediğine bakmak içinde basına ! ünlem koyarız
            System.out.println("gecersiz email");

        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");

        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");

        } else {
            System.out.println("email basari ile kaydedildi");
        }

    }
}