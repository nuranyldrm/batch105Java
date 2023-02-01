package ders32_inheritanceConstructorCall;


    public class DCamry extends BToyota {
        DCamry(String pc) {
            super("Deniz");
            System.out.println("String parametreli Camry");
        }

        DCamry() {
        }

        public static void main(String[] args) {
            new ders32_inheritanceConstructorCall.DCamry("celal");
            System.out.println("=======");
            new ders32_inheritanceConstructorCall.DCamry();
        }
    }

