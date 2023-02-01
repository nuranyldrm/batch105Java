package ders40_Interfaces;

public class I09_ChildOfI08 implements I08_InterfaceStaticVeDefaultMethods {
    public I09_ChildOfI08() {
    }

    public void method1() {
    }

    public void method2() {
    }

    public static void main(String[] args) {
        I09_ChildOfI08 obj = new I09_ChildOfI08();
        obj.method3();
        I08_InterfaceStaticVeDefaultMethods.method4();
    }
}
