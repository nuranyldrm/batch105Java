package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1 = "";
        System.out.println(str1);
        System.out.println(str1.concat("Java"));

        String str2 = "Java candir";
        System.out.println(str2);
        System.out.println(str2.concat("."));
        // veriable deger atanmazsa kullanılamaz hata verir
        // null kodu calısır durumda tutar =obje olusturulmus deger atanmamıs demektir
        // fakat null olarak isareliyoruz  bunun farkında oldugumuzu gösterir ve hata vermez
        String str3 = null;
        System.out.println((String)str3);
        System.out.println("" + str3 + "Java");
        System.out.println(((String)str3).toUpperCase());//NullPointerException
    }
}

