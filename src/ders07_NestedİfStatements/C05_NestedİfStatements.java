package ders07_NestedİfStatements;

public class C05_NestedİfStatements {
    public static void main(String[] args) {
        // kullanıcı aldıgı urun adedi ve liste fiyatını alın
        // kullanıcıya musteri kartı olup olmadıgını sorun
        // musteri kartı varsa 10 urunden fazla alırsa %20,10 üründen az ise  %15 inidirim yapın
        // müsteri kartı yoksa 10 urunden fazla alırsa %15 ,10 üründen az ise  %10 inirim yapın
        int  urunAdedi=30;
        boolean kartVaMi=true;
        double ListeFiyati = 12.5;
        double toplamFiyat = 0;

        //ana degisken kart olsun
        if (kartVaMi) {
            // kart var
            if (urunAdedi<0){
                System.out.println("hatali ürün adedi girisi");
            } else if (urunAdedi<10) {
                toplamFiyat=urunAdedi*ListeFiyati*0.85;
                System.out.println("%15 indirimli toplam fiyat:"+ toplamFiyat +"tl");
            }else {
                toplamFiyat=urunAdedi*ListeFiyati*0.80;
            }
                System.out.println("%20 indirimli toplam fiyat:"+ toplamFiyat +"tl");

        }else { // kart yok
            if(urunAdedi<0){
                System.out.println("hatalı ürün adedi girisi");
            } else if (urunAdedi<10) {
                toplamFiyat=urunAdedi*ListeFiyati*0.90;
                System.out.println("%10 indirimli toplam fiyat:"+ toplamFiyat+"tl" );
            }else {toplamFiyat=urunAdedi*ListeFiyati*0.85;
                System.out.println("%15 indirimli toplam fiyat:"+ toplamFiyat+"tl" );

            // kart yok
        }}}}
