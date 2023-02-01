package ders27_immutableClasses_DateAndTime;

public class C01_Immutable {
    public C01_Immutable() {
    }

    public static void main(String[] args) {
        String str = "Ali";

        for(int i = 0; i < 10; ++i) {
            str = str + ".";
        }

        System.out.println(str);
    }
}
