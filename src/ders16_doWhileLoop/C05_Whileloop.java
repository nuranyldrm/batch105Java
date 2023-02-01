package ders16_doWhileLoop;

public class C05_Whileloop {
    public static void main(String[] args) {
        // DÖNGÜYE break ara ver continue ise döngüde yinelemeyı kese bir sonrakı yenilemeyle devam eder

        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
            if (i==4){ // 4 e esitlenince kırara ver
                break;
            }
        }
    }
}
