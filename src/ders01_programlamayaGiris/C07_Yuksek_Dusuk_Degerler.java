package ders01_programlamayaGiris;

public class C07_Yuksek_Dusuk_Degerler {
    public static void main(String[] args) {


        System.out.println( Math.max(5,10));  //  Math.max (x,y)x ve y nin en yuksek degerini bulmak icin kullanılır
        System.out.println(Math.min(5,10)); // en dusuk degeri bulmak ıcın Math.min(x,y)
        System.out.println(Math.sqrt(64));//  Math.sqrt(x) x in karekokunu dödurur
        System.out.println(Math.abs(-4.7)); // x in mutlak (pozitif) degerini döndurur Math.abs(x)
        System.out.println(Math.random());// 0,0 dahil ile 1,0 arasında rastgele bir sayı dondurur

        int rabdomNum=(int)(Math.random()*101); // 0ile 100 arasında bir sayı döndurur
    }
}
