package ders23_encapsulation;

public class ProductManager {
    public void Add(Product product){
        //JDBC VERİ TABANINA KAYDEDİYOR BURADAN
        System.out.println("Ürün eklendi" +   product.name);
    }

    // encapsulation kısmı
    //public void Add2(int id, String name, String description, int stockAmount, double price)
    // bu sekılde yaparsak kod uzzerıne bır sey eklemek ıstedıgımız yerlerın hepsı kırmızı cızılır tek tek duzeltmemız gerekır
    // bu kotu koddur bu sekılde yazılmaz
    // encapsulatıonda private yanı ozel erisim olarak yazılırsa capsul ıcıne yazılır
    // getter ve setter
    // getter getir al oku
    // setter set etmek ayarlamak deger atamaya deger kurmaya yarar


}
