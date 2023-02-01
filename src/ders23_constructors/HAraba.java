package ders23_constructors;

public class HAraba {
    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public HAraba(String mrk, String mdl, String ykt, int yl, int fyt) {
        this.marka = mrk;
        this.model = mdl;
        this.yakit = ykt;
        this.yil = yl;
        this.fiyat = fyt;
    }

    public HAraba(String mrk, String mdl, int yl) {
        this.marka = mrk;
        this.model = mdl;
        this.yil = yl;
    }

    public HAraba() {
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


