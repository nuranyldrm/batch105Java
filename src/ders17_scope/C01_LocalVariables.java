package ders17_scope;

public class C01_LocalVariables {
    // bir methodun icerisinde olusturulan veriable larin scope u
    //icinde olusturdukları method tur
    //o method un dısından ulasılamazlar


    public static void main(String[] args) {
        boolean sayi = true;
        String isim = "Ramazan";

        for (int i = 0; i < 10; ++i) {
            String adres = "Ankara";
            // bir loop icersiinde olustrulan veriaable ler sadece o loop icerisinde gecerlidir
        }
        //System.out.println(adres); loopun  dısına cıktıgı ıcınkullanılmaz


        // lokal veriable ler deger atamadan olusturulabilir aNCk kullNILmMAZ
        double pi;
       // System.out.println(pi); buradakı gibi :kulllanılamaz : ancak kullanmadan önce deger atamalıyız

    }


    public static void method1() {

        boolean dogruMu = true;
        // ankara yı bu method icinde kullanmayız scop kendı alanı demektır
        //System.out.println(sayi);

}}
