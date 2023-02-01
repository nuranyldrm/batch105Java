package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_SayılarınBoyutu {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar.size());
        sayilar.add(10);
        sayilar.add(20);
        System.out.println(sayilar.size()); // sayıların boyutu 2 index var onu yazar
    }
}
