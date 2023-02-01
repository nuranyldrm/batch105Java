package ders31_inheritanceDemo;

public class Main {
    public static void main(String[] args) {
//        ÖgretmenKrediManager ögretmenKrediManager=new ÖgretmenKrediManager();
//        ögretmenKrediManager.Hesapla();

        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new ÖgretmenKrediManager());
    }
}
