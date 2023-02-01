package ders02_Dataturleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan ismini ,soyismini ve yasını alıp ,asagıdaki formatta yazdırın.
        //isminiz:John
        //soyisminiz:Doe
        //yasiniz:44
        //Kaydınız basarıyla tamamlanmıştır.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");
        //string için kullanılabilen next() sadece ilk space 'e kadar olan kısmı alır
        //                           nextLine () ise o satırda yazılan tüm bilgiyi alır

        String isim= scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Lütfen yasinizi giriniz");
        double yas= scan.nextDouble();
        System.out.println("İsminiz:" + isim + "\nsoyisminiz:" + soyisim + "\nyasınız:" + yas+
                   "\nKaydiniz basarıyla tamamlanmıstır.");

    }
}
