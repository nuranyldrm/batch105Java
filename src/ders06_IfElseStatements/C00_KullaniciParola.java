package ders06_IfElseStatements;

import java.util.Scanner;

public class C00_KullaniciParola {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String kullanıcıAdı,parola;
        System.out.println("Lütfen kullanıcı adını giriniz :");
        kullanıcıAdı= scan.nextLine();
        System.out.println("Lütfen parolanızı giriniz:");
        parola= scan.nextLine();
        if (kullanıcıAdı.equals("java") && parola.equals("123")){
            System.out.println("Basarılı bir sekilde giris yaptınız");
        }else {
            System.out.println("Kullanıcı adınız veya parolanız yanlış!");
        }

    }
}
