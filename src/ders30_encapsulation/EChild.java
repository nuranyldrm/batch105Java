package ders30_encapsulation;


    public class EChild extends DParent {
        public EChild() {
        }

        public static void main(String[] args) {
            ders30_encapsulation.EChild child1 = new ders30_encapsulation.EChild();
            child1.yas = 30;
            child1.isim = "Mahmut";
            child1.isEnough = false;
        }
    }