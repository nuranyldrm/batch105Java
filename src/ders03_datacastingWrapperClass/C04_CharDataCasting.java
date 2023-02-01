package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // 97+98=195

        //kullanıcıdan char bir karakter alın
        //o karakterden sonra gelen 3 karakteri yazdırın.
        //örnek input: a, output: bcd

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char gitilenKrk= scan.next().charAt(0);

        System.out.println(""+(char) (gitilenKrk+1)+(char) (gitilenKrk+2)+(char) (gitilenKrk+3));

    }
}
