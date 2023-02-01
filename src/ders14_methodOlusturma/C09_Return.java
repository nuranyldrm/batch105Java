package ders14_methodOlusturma;

public class C09_Return {
    public static void main(String[] args) {
        System.out.println("sonuc:"+ ucilecarp(ikiTopla(dortCıkart(4))));
    }

    public static int ucilecarp(int a){
        return 3*a;
    }
    public static int ikiTopla(int a){
        return 2+a;
    }
    public static int dortCıkart(int a){
        return a-4;
    }

}
