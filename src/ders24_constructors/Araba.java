package ders24_constructors;

public class Araba {
    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Araba(String mrk, String mdl) {
        this.marka = mrk;
        this.model = mdl;
    }

    public Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public Araba() {
    }

    public String toString() {
        return "Araba Ozellikleri \nmarka : " + this.marka + "\nmodel : " + this.model + "\nyakit : " + this.yakit + "\nyil : " + this.yil + "\nfiyat : " + this.fiyat;
    }
}
