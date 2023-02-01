package ders02_Dataturleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan ismini alıp buyuk harfle yazdırın
        //1. adım scan objesi olusturma
        Scanner scan =new Scanner(System.in);

        //2.adım kullanıcıya ne istediğimizi yazdırma
        System.out.println("Lutfen adinizi giriniz");

        //3. adım kullanıcıdan ıstedıgımız bılgının turune uygun veriable olusturup
        //scanner method'larından uygun olanını kullanarak alınan degeri verıable'a atayalım

        String kullanıcıAdı= scan.next();
        System.out.println(kullanıcıAdı.toUpperCase());



    }
}
