package ders34_polymorphisim;

public class Main {
    public static void main(String[] args) {

  /*  EmailLogger logger=new EmailLogger();
    logger.Log("Log mesajı");
    */
//
//        BaseLogger[] loggers=new BaseLogger[]{new FileLogger(), new EmailLogger(),new DataBaseLogger()};
//        for(BaseLogger logger:loggers){
//            logger.Log("Log mesaji");
//        }

        CustumerManager custumerManager=new CustumerManager(new DataBaseLogger());
        custumerManager.add();
}
}
