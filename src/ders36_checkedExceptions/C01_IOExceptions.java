package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public C01_IOExceptions() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");
        new FileOutputStream("src/ders36_checkedExceptions/Deneme.txt");
    }
}


