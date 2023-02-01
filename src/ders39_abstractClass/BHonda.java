package ders39_abstractClass;

public abstract class BHonda extends Araba {
    public BHonda() {
    }

    public void marka() {
        System.out.println("marka : Honda");
    }

    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelTeknoloji() {
        System.out.println("Tum Honda arabalar vtec teknolojisi kullanir");
    }
}
