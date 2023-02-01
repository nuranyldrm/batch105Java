package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java Candir");
        System.out.println(sb1.reverse());
        System.out.println("Tersini yazdirdiktan sonra sb1 : " + sb1);
        System.out.println(sb1.insert(0, "."));
        System.out.println(sb1);
        sb1.reverse();
        StringBuilder sb2 = new StringBuilder("Java Candir.");
        String str = "Java Candir.";
        System.out.println(sb1 == sb2);
        System.out.println(sb1 == sb1);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb1));
        System.out.println(sb1.equals(str));
        System.out.println(sb1.compareTo(sb2));
        StringBuilder sb3 = new StringBuilder("Jaka Kandir");
        System.out.println(sb1.compareTo(sb3));
    }
}

