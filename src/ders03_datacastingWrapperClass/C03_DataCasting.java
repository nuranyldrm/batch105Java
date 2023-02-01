package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        // Kullanıcıdan bir tamsayi alın
        //kullanıcı kac girerse girsin
        //konsolda -128 ile +127 arasında bir sonuc yazdıracak
        //kod yazınız
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");

        int girilenSayı= scan.nextInt();
        byte dönüsenSayı=(byte) girilenSayı;
        System.out.println("girdiginiz"+ girilenSayı+"'nin dönüsmüs hali:"+dönüsenSayı);

    }
}
