package ders26_passByvalue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {
    public C06_ImmutableClasses() {
    }

    public static void main(String[] args) {
        String str = "Java guzeldir";
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str.toLowerCase();
        System.out.println(str);
        List<String> harfler = new ArrayList();
        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);
        System.out.println(harfler);
    }
}

