package ders23_constructors;

public class DAraba {
    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public DAraba() {
    }

    public String toString() {
        return "Araba Ozellikleri \nmarka : " + this.marka + "\nmodel : " + this.model + "\nyakit : " + this.yakit + "\nyil : " + this.yil + "\nfiyat : " + this.fiyat;
    }

    public int maxHiz(String yakit) {
        int maxHiz = 120;
        if (yakit.equalsIgnoreCase("dizel")) {
            maxHiz = 200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz = 230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz = 180;
        }

        return maxHiz;
    }
}


