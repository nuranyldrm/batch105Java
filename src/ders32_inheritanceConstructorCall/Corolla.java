package ders32_inheritanceConstructorCall;


    public class Corolla extends BToyota {
        Corolla(int pc) {
            super(5);
            System.out.println("Parametreli Corolla constructor");
        }

        Corolla() {
        }

        Corolla(String str) {
            this();
            System.out.println("String parametreli Corolla cons");
        }

        public static void main(String[] args) {
            new ders32_inheritanceConstructorCall.Corolla("Ilker");
            System.out.println("=======");
            new ders32_inheritanceConstructorCall.Corolla();
            System.out.println("=======");
            new ders32_inheritanceConstructorCall.Corolla(3);
        }
    }