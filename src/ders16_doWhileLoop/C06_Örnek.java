package ders16_doWhileLoop;

public class C06_Örnek {
    public static void main(String[] args) {
        int i=0;
        while (i<10){
            System.out.println(i);
            if (i==4){
                i++;
                continue;
            }
        }
        System.out.println(i);
        //UYARI DONGU BU SEKILDE DURMUYOR

    }
}
