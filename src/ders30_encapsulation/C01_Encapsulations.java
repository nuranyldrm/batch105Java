package ders30_encapsulation;

public class C01_Encapsulations {
    public static void main(String[] args) {
        AEncapsuleClass pers1 = new AEncapsuleClass();
        System.out.println(pers1.getHastaneIsmi());
        pers1.setHastaUcreti(500);
        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("Istanbul");
        System.out.println(pers1.getHemsireIsmi());
    }
}

