package ders18_arrays;

public class C04_ArrayElementleriToplama {
    public static void main(String[] args) {
        //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.
        int arr[]={1,-3,-5,5,6,7};
        System.out.println(pozitifElementleriTopla(arr));


    }
    public static int pozitifElementleriTopla(int[]arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }

        }
        return toplam;
    }
}
