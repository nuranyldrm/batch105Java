package ders40_Interfaces;

public interface I08_InterfaceStaticVeDefaultMethods {
    void method1();

    void method2();

    default void method3() {
        System.out.println("interface icindeki body'li default method");
    }

    static void method4() {
        System.out.println("Interface icindeki body'li static method");
    }
}
