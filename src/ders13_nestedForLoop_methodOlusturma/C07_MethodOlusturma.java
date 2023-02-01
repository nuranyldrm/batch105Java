package ders13_nestedForLoop_methodOlusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {

        //Projemiz icerisinde tekrar tekrar
        //kullanacagimiz bir islem icin her seferinde
        //yeniden kod yazmak yerine bir kere yazip
        //ihtiyacimiz oldukca kullanmak
        String str = "Java muhtesemdir";
        String buyukStr = str.toUpperCase();
        System.out.println(str);
        System.out.println(buyukStr);
        System.out.println(buyukStr.contains("S"));
    }
}

