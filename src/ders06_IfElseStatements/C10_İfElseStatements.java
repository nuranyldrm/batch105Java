package ders06_IfElseStatements;

public class C10_İfElseStatements {
    public static void main(String[] args) {
        // kullanıcıdan cinsiyetini yasını alın kadın 60 ve üzeri
        // erkek 65 yas ve üzeri emekli olabilir
        // cınsiyet ve yasını dıkkate alarak
        // emekli olabilirsin veya emekli olmak icin .. yıl daha calısman gerekir yazdırın

        char cinsiyet='E';
        int yas=60;
        if (cinsiyet=='E'  && yas>=65){
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet=='E'  && yas<65 && yas>15){
            System.out.println("emekli olmak icin" +  (65-yas)  + "sene calismalisin");
        }else if (cinsiyet=='K'  && yas>=60){
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet=='K'  && yas<60 && yas>15) {
            System.out.println("emekli olmak icin" +  (60-yas)  + "sene calismalisin");
        } else{
            System.out.println("gecersiz giris");
        }

        }
    }


