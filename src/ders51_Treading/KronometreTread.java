package ders51_Treading;

public class KronometreTread implements Runnable{

    private Thread thread;
    private String treadName;

    public KronometreTread(String treadName){
        this.treadName=treadName;
        System.out.println("Olusturuluyor :" + treadName);

    }
    @Override
    public void run() {
        System.out.println("Çalıştırılıyor:" + treadName);

        try {
            for (int i = 1; i <=10; i++) {
                System.out.println(treadName + ":" +i);
                Thread.sleep(1000);

            }
        }
        catch (InterruptedException exception){
            System.out.println("Kesildi:" + treadName);

        }
        System.out.println("Tread bitti:" + treadName);

    }
    public void start(){
        System.out.println("Thread nesnesi Olusuyor");
        if (thread==null){
            thread=new Thread(this,treadName);
            thread.start();
        }

    }
}
