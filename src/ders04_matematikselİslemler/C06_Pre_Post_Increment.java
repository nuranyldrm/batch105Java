package ders04_matematikselİslemler;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;
        // a veriable nin degerini yazdırıp, sonra a nin degerini bir artırın

        System.out.println("a:"+a);//10
        a++;
        // a artık 11

        int b=10;
        // b veriable nin degerini bir arttırıp , sonra yazdırın .

        b++;
        System.out.println("b:"+b); //11


        // pratık yontem

        int c=10;
        // c veriable nin degerini yazdırıp, sonra a nin degerini bir artırın


        System.out.println("c :" + c++);

        int d=10;
        // d veriable nin degerini bir arttırıp , sonra yazdırın .

        System.out.println("d:"+ ++d);

        /* c++ veyaz ++d yi yazdırma veya atama isleminde kullanıyorsanız.
        c++ 'e post increment denir o satır icin önce islemi yapar sonra artırmayı yapar
        ++d 'ye ise pre increment denir ,önce artırma yapıp sonra islemi yapar

        islemin oldugu satırın bir alt satırına gecildiginde
        c'de d'de bir artmıstır
         */
    }
}
