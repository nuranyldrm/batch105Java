package ders06_IfElseStatements;

import java.util.Scanner;

public class C00_SınıfGecme {
    public static void main(String[] args) {
        int türkce,matematik,fenBilgisi,sosyalBilgisi,BedenEgitimi;
        double ortalama=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("türkce notunu giriniz :");
        türkce= scan.nextInt();
        System.out.println("\n matematik notunu giriniz :");
        matematik= scan.nextInt();
        System.out.println("\n fenBilgisi notunu giriniz :");
        fenBilgisi= scan.nextInt();
        System.out.println("\n sosyalBilgisi notunu giriniz :");
        sosyalBilgisi= scan.nextInt();
        System.out.println("\n beden egitimi notunu giriniz :");
        BedenEgitimi= scan.nextInt();

        ortalama=(türkce+matematik+fenBilgisi+sosyalBilgisi+BedenEgitimi)/5;


        if (ortalama<50){
            System.out.println("sınıfta kaldınız ! seneye görüşmek üzere ");
        }else {
            System.out.println("tebrikler sınıfı basarili bir sekılde gectiniz !");
        }
        System.out.println("sınıf ortalamanız :"+ ortalama);


    }
}
