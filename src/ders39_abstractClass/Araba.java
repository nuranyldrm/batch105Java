package ders39_abstractClass;

public abstract class Araba {
    public Araba() {
    }

    public abstract void motor();

    public abstract void marka();

    public abstract void kasa();

    public abstract void tekerlek();

    public void abs() {
        System.out.println("Guvenlik artirmak isteyen arabalar abs kullanmali");
    }

    public void klima() {
        System.out.println("Konfor artirmak isteyen arabalar klima kullanmali");
    }
}
