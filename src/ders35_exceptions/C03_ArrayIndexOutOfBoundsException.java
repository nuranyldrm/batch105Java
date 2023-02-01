package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 6, 7, 8, 2, 3, 5, 6, 8, 9, 1};
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir index giriniz");
        int index = scan.nextInt();

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException var5) {
        }

    }
}


