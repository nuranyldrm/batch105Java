package ders30_encapsulation;

public class AEncapsuleClass {
    private String hastaneIsmi = "Yildiz Hastanesi";
    private int hastaUcreti;
    private String hemsireIsmi;
    private String hemsireAdresi;

    public AEncapsuleClass() {
    }

    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmi() {
        return this.hastaneIsmi;
    }

    public String getHemsireIsmi() {
        return this.hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return this.hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }
}


