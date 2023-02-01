package ders39_abstractClass;

public class CHondaCivic extends BHonda {
    public CHondaCivic() {
    }

    public void motor() {
        System.out.println("Honda Civic araclar vtec teknolojili cevreci kullanir");
    }

    public void kasa() {
        System.out.println("Civic sedan veya hb kasa kullanir");
    }

    public void tekerlek() {
        System.out.println("civic araclar 205x16x55 teker kullanir");
    }

    public void yakit() {
        System.out.println("Civic araclar benzinlidir");
    }

    public void guvenlik() {
        System.out.println("Civic araclar guvenlik standardina uyar");
    }

    public void abs() {
        System.out.println("Honda Civic arabalar standart olarak abs kullanir");
    }

    public void klima() {
        System.out.println("Honda Civic arabalar standart olarak klima kullanir");
    }

    public static void main(String[] args) {
        CHondaCivic civic1 = new CHondaCivic();
        civic1.abs();
        civic1.klima();
        civic1.marka();
        civic1.ozelTeknoloji();
    }
}
