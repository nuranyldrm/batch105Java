package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C04_ElementeUlasma {
    public static void main(String[] args) {
        // istedigimiz elemente ulasma
        List<String> liste=new ArrayList<>();
        liste.add("fatih");
        liste.add("levent");
        liste.add("esra");
        liste.add("seher");

        System.out.println(liste.get(2)); // esra
        System.out.println(liste.get(1));// levent

        liste.set(2,"fatih"); // degistirme elementi
        System.out.println("set'den sonra "+liste);

        //bir list te baska bir list in tüm elementlerini silme removeAll
        List<String> silinecekliste=new ArrayList<>();
        liste.add("fatih");
        liste.add("levent");
        liste.removeAll(silinecekliste);
        System.out.println(liste);
        System.out.println(liste.equals(silinecekliste)); // false iki listenin esit olduguna bakma
        System.out.println(liste);
        Collections.sort(liste);// listedeki elementleri sıralama alfabeye göre
        System.out.println(liste.subList(1,3));// bir listenin belli bir bolumunu alma baslangıc ve bitis



    }
}
