package ders27_immutableClasses_DateAndTime;

public class C02_StringPool {
    public C02_StringPool() {
    }

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "";
        str4 = str4.concat("Java");
        String str5 = "Ja";
        str5 = str5.concat("va");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str4));
        System.out.println(str1 == str4);
        System.out.println(str1.equals(str5));
        System.out.println(str1 == str5);
        System.out.println(str1 == "Java");
        System.out.println(str3 == "Java");
    }
}

