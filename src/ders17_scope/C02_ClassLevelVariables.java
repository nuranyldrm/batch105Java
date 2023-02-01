package ders17_scope;

public class C02_ClassLevelVariables {
    static String hastaneismi = "Yildiz hastanesi";
    static int hastaSayisi = 23453;
    static String basHekimIsmi;
    String persIsmi = "Isim girilmedi";
    String persTelefonu = "Telefon girilmedi";
    int persYasi;

    public C02_ClassLevelVariables() {
    }

    // class level veriable lar methodların dısında olusturulur
    // genel kullanım en üstte olusturulmalıdır
    public static void main(String[] args) {
        System.out.println(hastaneismi);
        System.out.println(basHekimIsmi);
        /*
        class veriabler a deger ataması yapılmamıs olursa
        java bu veriable lara data turune göre
        default olarak tanımlanan degerleri atar
        default degerler
        sayısal veriable lar :0
        boolean : false
        char:'' hiclik
        objeler (String dahil):null
         */
    }

    public static void method1() {
        System.out.println(hastaSayisi);
        ++hastaSayisi;
    }

    public void method2() {
        System.out.println(hastaneismi);
        ++hastaSayisi;
        System.out.println(this.persIsmi);
        System.out.println(this.persYasi);
    }
}
