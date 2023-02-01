package ders03_datacastingWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="java cok guzel";

         /* primitive data türleri sadece deger barındırır
         hazır methodları yoktur.

         java ya yapılan talepler sonucunda java primitive data turleri
         ile bazı hazır methodların kullanılabilmesi için
          Wrapper class lar olusturulmustur
         wrapper class lar primivite data turlerındeki degerleri alırlar
         ancak methodlarıda vardır .
          */

        char krk='b';
        Character krkWrapper='c';


        System.out.println(Character.isLetter('5')); // false

        System.out.println(Character.isDigit('7')); // true

        String str1="123";
        String str2="12";
        // str1 ve str2 nin degerlerini matematiksel olarak toplayın

        System.out.println(str1+str2);// 12312
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); //135
        //Integer parseınteger (str) icine yazılan str rakamlardan olusuyorsa str i int a cevirir
        //ancak bir karakter bile rakam değilse hata verir bosluk bile .

        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Short.MIN_VALUE);// -32768

    }
}
