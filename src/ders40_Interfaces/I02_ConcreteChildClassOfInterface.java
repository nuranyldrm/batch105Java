package ders40_Interfaces;

public class I02_ConcreteChildClassOfInterface implements I01_Interface {
    public I02_ConcreteChildClassOfInterface() {
    }

    public static void main(String[] args) {
        System.out.println("Hello Interface");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.PI);
    }

    public void method1() {
    }

    public int method2() {
        return 0;
    }

    public String method3() {
        return null;
    }
}
