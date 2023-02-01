package ders33_inheritanceDataTypeKullanimi_overriding;

public class FAvciKuslar extends EKuslar {
    public FAvciKuslar() {
    }

    public void hareket() {
        System.out.println("Avci kuslar ucarlar");
    }

    public void beslenme() {
        System.out.println("Avci kuslar et yerler");
    }

    public void pence() {
        System.out.println("Avci kuslar pencelidir");
    }

    public void gaga() {
        System.out.println("Avci kuslar sivri gagalidir");
    }

    public static void main(String[] args) {
        FAvciKuslar avci1 = new FAvciKuslar();
        avci1.beslenme();
        avci1.gaga();
        avci1.pence();
        avci1.hareket();
        avci1.cogalma();
        avci1.kanat();
        avci1.omur();
        avci1.solunum();
        EKuslar avci2 = new FAvciKuslar();
        avci2.beslenme();
        avci2.gaga();
        avci2.hareket();
        avci2.cogalma();
        avci2.kanat();
        avci2.omur();
        avci2.solunum();
        DHayvanlar avci3 = new FAvciKuslar();
        avci3.beslenme();
        avci3.hareket();
        avci3.cogalma();
        avci3.omur();
        avci3.solunum();
        EKuslar kus1 = new EKuslar();
        kus1.cogalma();
        kus1.gaga();
        kus1.kanat();
        kus1.hareket();
        kus1.solunum();
        kus1.beslenme();
        kus1.omur();
        DHayvanlar kus2 = new EKuslar();
        kus2.cogalma();
        kus2.hareket();
        kus2.solunum();
        kus2.beslenme();
        kus2.omur();
    }
}