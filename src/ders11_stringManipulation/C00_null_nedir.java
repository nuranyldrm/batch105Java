package ders11_stringManipulation;

public class C00_null_nedir {
    public static void main(String[] args) {
        // null bir deger ataması yapılmadıgını belirtmek isteyen bir isaretcidir
          /*
        int sayi = null;
        boolean bl=null;
        primitive data turleri için null pointer kullanılamaz

        non -primitive tüm data türlerinde null pointer kullanılabılır
         */
        Integer sayi=null;
        Boolean bl=null; // bas harfler buyuk non primitive kabul ettı oyuzden

        String str1;
        String str2=new String();
        String str3="";
        String str4=null;
        // bir Stringe deger atayabiliriz
        // bu 4 veriable atama acısından aynı durumdadır
        // hepsine yeni deger atanabilir ve yeni hali kullanılabilir
        //str1="java";
        //System.out.println(str1); //java


        // bir string i yazdırabilirim
        //System.out.println(str1); // java
        // str1 deger ataması yapılmadıgından yazdırılamaz , altı cizilir kod calısmaz
        System.out.println(str4);
        /*
        null ataması yaptığımız string yazdırıldıgında null sonucunu görürüz
        bu bir string degil ,sadece str4 e null atandıgının isaretidir
         */

//       System.out.println("java"+ str1);
//        str1 deger ataması yapılmadıgından yazdırılamaz , altı cizilir kod calısmaz
//        System.out.println("java"+ str4);
//        str4 için java null yazdırır ,işlem yapmasına itiraz etmez
//                str4 un null olarak isaretlendigini bize gösterir

        System.out.println(str2.length());
        //str1 deger ataması yapılmadıgından yazdırılamaz , altı cizilir kod calısmaz
        //str4 için null pointerException verir hata

        int x=0;
        String s=null;

        //if (x==s) System.out.println("Success"); kod calısmaz hata verir
        //else System.out.println("Failure");
    }
}
