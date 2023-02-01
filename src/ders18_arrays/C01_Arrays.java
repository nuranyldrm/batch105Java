package ders18_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr1 = new int[]{2, 4, 6, 8, 10};
        // arry in bir elementine ulasmak ve update etmek istersek

        System.out.println(arr1[2]);
        arr1[3] = 20;
        System.out.println(arr1[3]);
        System.out.println(arr1.length); // element sayısı
        System.out.println(arr1[arr1.length - 1]); // son element

        for(int i = 0; i < arr1.length; ++i) { //tüm  elementlerini yazın
            System.out.print(arr1[i] + " ");
        }

        // arry in uzunlugu sonradan degistirilemez
        // eger array de olmayan bir index e atama yapmak isterseniz
        //arry run tıme hatası verir cte degıl
       // arr1[5]=35;
    }
}
