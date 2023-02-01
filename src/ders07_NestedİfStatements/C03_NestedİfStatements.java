package ders07_NestedİfStatements;

public class C03_NestedİfStatements {
    public static void main(String[] args) {

        //kullanıcıdan cinsiyet ve yasını alın kadın 60 yas ve üzeri
        //erkek 65 yas ve üzeri emekli olabilir
        // cinsiyet ve yasını dikkate alarak
        //emekli olabilirsin veya emekli olmak icin .. yıl daha calısman gerekir yazdırın


        char cinsiyet='K';
        int yas=56;

        // nested if else seklınde kullanım ıcın önce ana degiskeni secip
        // ona göre yapıyı olusturalım
        //cinsiyet ana degısken olsun

        if (cinsiyet=='k' || cinsiyet=='K'){
            // giris yapılan deger kadına ait demektir
            if (yas<15){
                System.out.println("hatalı yas girişi");
            } else if (yas<60) {
                System.out.println("emekli olamazsın"+ (60-yas)+ "yıl calısmalısın");
            }else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet== 'e'|| cinsiyet=='E'){
            //giris yapılan deger ERKEGE ait demektir
            if (yas<15){
                System.out.println("hatalı yas girişi");
            } else if (yas<65) {
                System.out.println("emekli olamazsın"+ (65-yas)+ "yıl calısmalısın");}else {
                System.out.println("emekli olabilirsin");
            }

        } else{
            System.out.println("yanlıs cinsiyet girişi ");
        }
    }
}
