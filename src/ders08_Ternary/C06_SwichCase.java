package ders08_Ternary;

public class C06_SwichCase {
    public C06_SwichCase() {
    }

    public static void main(String[] args) {

        // kullanıcının girdigi gun numarasının gun ismini yazdırın

        // switch icinde boolean -long- doble-float olmaz program calısmaz char -string kullanılır olur
        int gunNo = 1;
        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz gun no");
        }

    }
}