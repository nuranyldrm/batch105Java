package ders04_matematikselİslemler;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=10; // bu sayıyı 3 arttıralım ve yazdıralım

        sayi=sayi+3;
        System.out.println(sayi); //13
        sayi+=3;
        System.out.println(sayi); // 16 olacak

        int s=10; // bu sayıyı sadece bir arttırın
        s=s+1;
        System.out.println(s); //11

        s+=1;
        System.out.println(s);//12

        s++;
        System.out.println(s);//13
        ++s;
        System.out.println(s);//14

        // deger eksiltme
        int t=10;
        // bu sayıyı bir eksiltelim
        t=t-1;//9
        t-=1; //8
        t--;//7
        --t;//6
        System.out.println(t);
    }
}
