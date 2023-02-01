package ders34_overriding_pollymorphism;

public class BChild extends AParent {
    public BChild() {
    }

    public void method1() {
        System.out.println("Child class method1");
    }

    public void method2(int a) {
        System.out.println("child class method2");
    }

    public void method2(String isim) {
        System.out.println("Child class String parametreli method2");
    }

    public void method3() {
    }
}
